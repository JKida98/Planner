package com.planner.planner.controllers;

import com.planner.planner.database.entities.DbTask;
import com.planner.planner.database.repositories.ITaskRepository;
import com.planner.planner.services.tasks.ITaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {
    
    @Autowired
    private ITaskService _taskService;

    @GetMapping(value = "/{name}")
    public DbTask findTaskByName(@PathVariable String name){
        DbTask task = _taskService.getByName(name);
        return task;
    }
}
