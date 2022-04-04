package com.boltscape.todo.controller;

import com.boltscape.todo.model.listItem;
import com.boltscape.todo.repo.todoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class todoController {
    
    @Autowired
    private todoRepo todorepo;

    @GetMapping
    public List<listItem>  findAll(){
        return todorepo.findAll();
    }

    @PostMapping
    public listItem save(@Validated @NonNull @RequestBody listItem listitem){
        return todorepo.save(listitem);
    }

    @PutMapping
    public listItem update(@Validated @NonNull @RequestBody listItem listitem){
        return todorepo.save(listitem);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable long id){
        todorepo.deleteById(id);
    }
}
