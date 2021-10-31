package com.planner.planner.services.tasks;

import java.util.List;

import com.planner.planner.database.entities.DbTask;
import com.planner.planner.database.repositories.ITaskRepository;
import com.planner.planner.database.repositories.IUserRepository;
import com.planner.planner.dtos.TaskDto;
import com.planner.planner.dtos.TaskForCreationDto;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("unchecked")
public class TaskService implements ITaskService {

    @Autowired
    private ITaskRepository _taskRepository;

    @Autowired
    private IUserRepository _userRepository;

    @Autowired
    private ModelMapper _mapper;

    @Override
    public TaskDto findById(Long id) {
        var found = _taskRepository.findById(id);
        if (!found.isPresent()) {
            return null;
        }
        var foundDto = _mapper.map(found.get(), TaskDto.class);
        return foundDto;
    }

    @Override
    public List<TaskDto> findAll() {
        var found = _taskRepository.findAll();
        var foundDto = _mapper.map(found, new TypeToken<List<TaskDto>>() {
        }.getType());        
        return (List<TaskDto>) foundDto;
    }

    @Override
    public TaskDto save(TaskForCreationDto taskForCreationDto) {
        // Get user reference
        var dbUser = _userRepository.getById(taskForCreationDto.ownerId);
        // Map dto object to db entity object
        var dbTask = _mapper.map(taskForCreationDto, DbTask.class);
        // Assign dbTask.owner property to found userReference
        dbTask.setOwner(dbUser);
        // Save dbTask using _taskRepository
        var saved = _taskRepository.save(dbTask);
        // Map saved value to TaskDto class object and return
        var savedDto = _mapper.map(saved, TaskDto.class);
        return savedDto;
    }
}
