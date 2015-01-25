package org.openidmframework.core.model.enums;

/**
 * Created by saulo on 1/24/15.
 */
public enum Status implements IdentificableEnum {

    ACTIVE(1, "org.openidmframework.core.enums.status.active.desc"),
    INACTIVE(0, "org.openidmframework.core.enums.status.inactive.desc"),
    DELETED(-1, "org.openidmframework.core.enums.status.deleted.desc");

    private Integer codeStatus;
    private String descStatus;

    Status(Integer codeStatus, String descStatus) {
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