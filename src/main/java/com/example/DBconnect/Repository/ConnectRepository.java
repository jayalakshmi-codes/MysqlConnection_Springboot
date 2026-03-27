package com.example.DBconnect.Repository;

import com.example.DBconnect.entity.ConnectDB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConnectRepository extends JpaRepository<ConnectDB,Long> {
}
