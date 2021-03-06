package com.planner.planner.dtos;

import java.util.Date;

public class TaskDto {
    public Long id;
    public String name;
    public String description;
    public Date startTime;
    public Date endTime;
    public UserDto owner;

    public TaskDto() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setOwner(UserDto owner) {
        this.owner = owner;
    }

    public UserDto getOwner() {
        return this.owner;
    }

}
