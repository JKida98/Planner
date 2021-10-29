package com.planner.planner.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    String fullName;
    String description;

    public UserDto() {
        super();
    }
}
