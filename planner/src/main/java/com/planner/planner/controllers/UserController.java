package com.planner.planner.controllers;

import com.planner.planner.dtos.UserDto;
import com.planner.planner.services.users.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService _userService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<UserDto> addUser(@RequestBody UserDto user) {
        var result = _userService.addUser(user);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
}
