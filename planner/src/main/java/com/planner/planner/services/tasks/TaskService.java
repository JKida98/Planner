package com.planner.planner.services.tasks;

import com.planner.planner.database.repositories.ITaskRepository;
import com.planner.planner.dtos.TaskDto;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService implements ITaskService {

    @Autowired
    private ITaskRepository _taskRepository;

    @Autowired
    private ModelMapper _mapper;

    @Override
    public TaskDto getById(Long id) {
        var found = _taskRepository.findById(id);
        if (!found.isPresent()) {
            return null;
        }
        var foundDto = _mapper.map(found.get(), TaskDto.class);
        return foundDto;
    }

}
