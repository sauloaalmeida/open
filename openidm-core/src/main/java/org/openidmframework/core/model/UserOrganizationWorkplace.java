package org.openidmframework.core.model;

import org.openidmframework.core.model.enums.Status;

/**
 * Created by saulo on 1/24/15.
 */
public class UserOrganizationWorkplace extends BasicModel implements Identificable{

    private Organization organization;
    private User user;
    private User manager;


}
