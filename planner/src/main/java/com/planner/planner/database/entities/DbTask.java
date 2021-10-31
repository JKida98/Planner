package com.planner.planner.database.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Tasks")
public class DbTask extends BaseDbModel {

    @Column(name = "name", updatable = true, nullable = false)
    public String name;

    @Column(name = "description", updatable = true, nullable = true)
    public String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "startTime", updatable = true, nullable = false)
    public Date startTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "endTime", updatable = true, nullable = false)
    public Date endTime;

    @JoinColumn()
    @ManyToOne(fetch = FetchType.EAGER)
    public DbUser owner;

    public DbTask(String name, String description, Date startTime, Date endTime, DbUser owner) {
        this.name = name;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.owner = owner;
    }

    public DbTask() {

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

    public void setOwner(DbUser owner) {
        this.owner = owner;
    }

    public DbUser getOwner() {
        return this.owner;
    }
}
