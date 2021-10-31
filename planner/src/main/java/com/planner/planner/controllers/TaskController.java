package com.planner.planner.controllers;

import java.util.List;

import com.planner.planner.dtos.TaskDto;
import com.planner.planner.dtos.TaskForCreationDto;
import com.planner.planner.services.tasks.ITaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private ITaskService _taskService;

    @RequestMapping(method = RequestMethod.GET, value = "/{id}", produces = "application/json")
    public ResponseEntity<TaskDto> findById(@PathVariable Long id) {
        TaskDto result = _taskService.findById(id);
        return new ResponseEntity<>(result, HttpStatus.FOUND);
    }

    @RequestMapping(method = RequestMethod.GET, value = "", produces = "application/json")
    public ResponseEntity<List<TaskDto>> findAll() {
        List<TaskDto> result = _taskService.findAll();
        return new ResponseEntity<>(result, HttpStatus.FOUND);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public ResponseEntity<TaskDto> save(@RequestBody TaskForCreationDto taskForCreation) {
        TaskDto result = _taskService.save(taskForCreation);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
}
