package com.planner.planner.services.tasks;

import java.util.List;

import com.planner.planner.dtos.TaskDto;
import com.planner.planner.dtos.TaskForCreationDto;

public interface ITaskService {
    TaskDto findById(Long id);
    List<TaskDto> findAll();
    TaskDto save(TaskForCreationDto taskForCreation);
}
