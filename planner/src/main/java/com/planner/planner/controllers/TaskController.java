package com.planner.planner.controllers;

import com.planner.planner.dtos.TaskDto;
import com.planner.planner.services.tasks.ITaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private ITaskService _taskService;

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<TaskDto> getById(@PathVariable Long id) {
        TaskDto result = _taskService.getById(id);
        return new ResponseEntity<>(result, HttpStatus.FOUND);
    }
}
