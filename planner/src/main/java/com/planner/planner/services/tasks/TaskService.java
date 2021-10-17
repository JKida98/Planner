package com.planner.planner.services.tasks;

import com.planner.planner.database.entities.DbTask;
import com.planner.planner.database.repositories.ITaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService implements ITaskService {

    @Autowired
    private ITaskRepository _taskRepository;

    @Override
    public DbTask getByName(String name) {
        return _taskRepository.findByName(name);
    }

}
