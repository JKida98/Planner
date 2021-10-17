package com.planner.planner.services.tasks;

import com.planner.planner.database.entities.DbTask;

public interface ITaskService {
    DbTask getByName(String name);
}
