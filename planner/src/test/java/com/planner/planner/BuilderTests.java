package com.planner.planner;

import com.planner.planner.dtos.TaskDto;

import org.junit.jupiter.api.Test;

public class BuilderTests {
    
    @Test
    public void TaskDtoBuilderTest(){
        TaskDto task = TaskDto.toBuilder().build();
    }
}
