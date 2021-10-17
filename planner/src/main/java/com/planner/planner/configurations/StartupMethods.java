package com.planner.planner.configurations;

import java.util.Date;

import javax.annotation.PostConstruct;

import com.planner.planner.database.entities.DbTask;
import com.planner.planner.database.entities.DbUser;
import com.planner.planner.database.repositories.ITaskRepository;
import com.planner.planner.database.repositories.IUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartupMethods {
    @Autowired
    private ITaskRepository _taskRepository;

    @Autowired
    private IUserRepository _userRepository;

    @PostConstruct
    public void init() {
        var user = new DbUser("First user", "I don't know what I am doing here...");
        var user2 = new DbUser("Second user", "I like potatoes");
        var user3 = new DbUser("Third user", "I like going out with my friends");
        var user4 = new DbUser("Forth user", "I like playing football. Call me Messi!!");
        var savedUser = _userRepository.save(user);
        var savedUser2 = _userRepository.save(user2);
        var savedUser3 = _userRepository.save(user3);
        var savedUser4 = _userRepository.save(user4);

        DbTask task = new DbTask("CC", "ZZ", new Date(), new Date(), savedUser);
        DbTask task2 = new DbTask("GG", "VV", new Date(), new Date(), savedUser2);
        DbTask task3 = new DbTask("WW", "AA", new Date(), new Date(), savedUser3);
        DbTask task4 = new DbTask("QQ", "HH", new Date(), new Date(), savedUser4);
        _taskRepository.save(task);
        _taskRepository.save(task2);
        _taskRepository.save(task3);
        _taskRepository.save(task4);
    }
}
