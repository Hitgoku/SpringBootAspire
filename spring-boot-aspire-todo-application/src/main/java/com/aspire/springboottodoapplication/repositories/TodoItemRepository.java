package com.aspire.springboottodoapplication.repositories;

import org.springframework.data.repository.CrudRepository;

import com.aspire.springboottodoapplication.models.TodoItem;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {  
}
