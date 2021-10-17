package com.planner.planner.database.repositories;

import java.util.UUID;
import com.planner.planner.database.entities.DbUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<DbUser, UUID> {

}
