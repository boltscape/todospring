package com.boltscape.todo.repo;

import com.boltscape.todo.model.listItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface todoRepo extends JpaRepository<listItem, Long> {
    
}
