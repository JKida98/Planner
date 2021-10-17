package com.planner.planner.database.repositories;

import com.planner.planner.database.entities.DbTask;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITaskRepository extends JpaRepository<DbTask, Long> {
}
