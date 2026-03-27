package com.example.DBconnect.Service;

import com.example.DBconnect.Repository.ConnectRepository;
import com.example.DBconnect.entity.ConnectDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConnectService {

    @Autowired
    private ConnectRepository psd;

    public List<ConnectDB> getdetails() {
    return psd.findAll();
    }

    public ConnectDB postdetail(ConnectDB p) {
        return psd.save(p);
    }


    public String deletepost(Long id) {
        psd.deleteById(id);
        return "success";
    }

    public ConnectDB update(ConnectDB p, Long id) {
        psd.save(p);
        return p;
    }
}
