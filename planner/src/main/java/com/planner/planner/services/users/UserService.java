package com.planner.planner.services.users;

import com.planner.planner.database.entities.DbUser;
import com.planner.planner.database.repositories.IUserRepository;
import com.planner.planner.dtos.UserDto;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository _userRepository;

    @Autowired
    private ModelMapper _mapper;

    @Override
    public UserDto addUser(UserDto user) {
        var result = _userRepository.save(_mapper.map(user, DbUser.class));
        var resultDto = _mapper.map(result, UserDto.class);
        return resultDto;
    }
}
