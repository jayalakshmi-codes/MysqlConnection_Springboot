package com.example.DBconnect.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ConnectDB {
    @Id

    private String id;
    private String name;
    private String dep;

    public ConnectDB(){

    }

    public ConnectDB(String id, String name, String dep) {
        this.id = id;
        this.name = name;
        this.dep = dep;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }
}
