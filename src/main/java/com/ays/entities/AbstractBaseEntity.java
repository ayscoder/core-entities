package com.ays.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Ayush Agrahari created on 05/02/2021
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class AbstractBaseEntity {

    protected String createdOn;
    protected String updatedOn;
}
