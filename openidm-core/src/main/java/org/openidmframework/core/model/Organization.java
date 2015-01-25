package org.openidmframework.core.model;

import org.openidmframework.core.model.enums.OrganizationType;

/**
 * Created by saulo on 1/24/15.
 */
public class Organization extends BasicModel implements Identificable {

    private String name;

    private Organization parent;

    private OrganizationType type;

    public String getName() {
        return name;
    }

    public Organization getParent() {
        return parent;
    }

    public OrganizationType getType() {
        return type;
    }

    //todo: return how deep the organization are in the tree
    public Integer getLevel() {
        return null;
    }
}
