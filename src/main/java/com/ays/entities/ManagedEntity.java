package com.ays.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * This is base class for all entity object within platform
 * Basic purpose is to have common fields like creation timestamp, lastModification timestamp and
 * unique row id.
 *
 * @author Ayush Agrahari created on 05/02/2021
 * @since 2.0.x-x
 */
@Entity
public abstract class ManagedEntity implements Serializable {

    /**
     * row id
     */
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    protected Long id;

    /**
     * record entry time stamp
     */
    protected String createdTime;

    /**
     * record last modification time stamp
     */
    protected String lastModifiedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }
}
