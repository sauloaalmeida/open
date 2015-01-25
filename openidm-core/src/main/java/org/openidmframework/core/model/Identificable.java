package org.openidmframework.core.model;

import org.openidmframework.core.model.enums.Status;

import java.io.Serializable;

/**
 * Created by saulo on 1/24/15.
 */
public interface Identificable {

     Serializable getId();
     Status getStatus();
}
