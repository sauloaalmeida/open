package org.openidmframework.core.exception;

import java.util.Locale;

/**
 * Created by saulo on 1/25/15.
 */
public abstract class BasicException extends RuntimeException{

    public BasicException(String message){
        super(message);
    }

    public BasicException(String message, Locale locale, Object... args) {
        super(message);
    }

    public BasicException(String message, Throwable cause, Locale locale) {
        super(message, cause);
    }

    public BasicException(Throwable cause) {
        super(cause);
    }
}
