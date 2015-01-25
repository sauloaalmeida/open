package org.openidmframework.core.model;

import org.openidmframework.core.model.enums.Status;

import java.io.Serializable;

/**
 * Created by saulo on 1/24/15.
 */
public abstract class BasicModel {

    protected Serializable id;
    protected Status status;

    public Serializable getId() {
        return this.id;
    }

    public Status getStatus(){
        return this.status;
    }


}
