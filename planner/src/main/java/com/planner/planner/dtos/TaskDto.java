package com.planner.planner.dtos;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskDto {
    private String name;
    private String description;
    private Date startTime;
    private Date endTime;
    private UserDto owner;

    public TaskDto() {

    }
}
