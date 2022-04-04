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
    private int num;
    @NonNull
    private String tname;
    private boolean status;
    private Date deadline;
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    
}
