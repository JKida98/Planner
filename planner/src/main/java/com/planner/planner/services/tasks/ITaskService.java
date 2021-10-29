package com.planner.planner.services.tasks;

import java.util.ArrayList;

import com.planner.planner.dtos.TaskDto;

public interface ITaskService {
    TaskDto findById(Long id);
    ArrayList<TaskDto> findAll();
}
