package com.planner.planner.services.tasks;

import com.planner.planner.dtos.TaskDto;

public interface ITaskService {
    TaskDto getById(Long id);
}
