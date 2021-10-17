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

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Tasks")
public class DbTask extends BaseDbModel {

    @Column(name = "name", updatable = true, nullable = false)
    private String name;

    @Column(name = "description", updatable = true, nullable = true)
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "startTime", updatable = true, nullable = false)
    private Date startTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "endTime", updatable = true, nullable = false)
    private Date endTime;

    @JoinColumn(name = "USER_ID", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private DbUser owner;

    public DbTask(String name, String description, Date startTime, Date endTime, DbUser owner) {
        this.name = name;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.owner = owner;
    }

    public DbTask(){
        
    }
}
