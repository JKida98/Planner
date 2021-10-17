package com.planner.planner.database.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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

    @Column(name = "startTime", updatable = true, nullable = false)
    private String startTime;

    @Column(name = "endTime", updatable = true, nullable = false)
    private String endTime;

    @JoinColumn(name = "USER_ID", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private DbUser owner;
}
