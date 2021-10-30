package com.planner.planner.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto {
    public String name = "test";
    public String description = "testDescription";
    public Date startTime = new Date();
    public Date endTime = new Date();
    public UserDto owner = null;

    public TaskDto() {
        super();
    }

}
