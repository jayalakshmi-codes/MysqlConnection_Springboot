package com.example.DBconnect.Conroller;


import com.example.DBconnect.Service.ConnectService;
import com.example.DBconnect.entity.ConnectDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private ConnectService ps;

    @GetMapping("/get")
    public List<ConnectDB> getdetails(){
        return ps.getdetails();
    }

    @PostMapping("/add")
    public ConnectDB postdetail(@RequestBody ConnectDB p){
        return ps.postdetail(p);
    }

    @PutMapping("/update/{id}")
    public ConnectDB update(@RequestBody ConnectDB p, @RequestParam Long id){
        return ps.update(p,id);
    }

    @DeleteMapping("/delete/{id}")
    public String deletepost(@PathVariable Long id){
        return ps.deletepost(id);
    }

}
