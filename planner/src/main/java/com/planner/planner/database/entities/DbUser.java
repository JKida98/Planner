package com.planner.planner.database.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "Users")
public class DbUser extends BaseDbModel {

    @Column(name = "fullName", updatable = true, nullable = false)
    private String fullName;

    @Column(name = "description", updatable = true, nullable = true)
    private String description;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<DbTask> tasks;

    public DbUser(String fullName, String description) {
        this.fullName = fullName;
        this.description = description;
    }

    public DbUser() {

    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<DbTask> getTasks() {
        return this.tasks;
    }

    public void setTasks(List<DbTask> tasks) {
        this.tasks = tasks;
    }
}