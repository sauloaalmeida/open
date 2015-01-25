package org.openidmframework.core.model.enums;

/**
 * Created by saulo on 1/24/15.
 */
public enum OrganizationType implements IdentificableEnum {

    COMPANY(0,"org.openidmframework.core.enums.organizationtype.company.desc"),
    DEPARTMENT(1,"org.openidmframework.core.enums.organizationtype.department.desc");

    private Integer codeStatus;
    private String descStatus;

    OrganizationType(Integer codeStatus, String descStatus) {
        this.codeStatus = codeStatus;
        this.descStatus = descStatus;
    }

    @Override
    public String getDescStatus() {
        return descStatus;
    }

    @Override
    public Integer getCodeStatus() {
        return codeStatus;
    }
}
