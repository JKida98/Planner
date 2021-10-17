package com.planner.planner.dtos;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskDto {
    String name;
    String description;
    Date startTime;
    Date endTime;
    UserDto owner;
}
