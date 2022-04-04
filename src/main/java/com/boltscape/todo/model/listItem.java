package com.boltscape.todo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.lang.NonNull;
//import org.springframework.validation.annotation.Validated;

@Entity
public class listItem {
    
    private long id; 
    @NonNull
    private String tname;
    private boolean status;
    private String deadline;
    public listItem() {
    }

    public listItem(long id, String tname, boolean status) {
        this.id = id;
        this.tname = tname;
        this.status = status;
    }

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    
}
