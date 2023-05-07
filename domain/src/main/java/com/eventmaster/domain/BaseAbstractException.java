package com.eventmaster.domain;

import lombok.Getter;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;

@Getter
public abstract class BaseAbstractException extends RuntimeException{

    private final ErrorCode errorCode;

    private final String logMessage;

    private final String message;

    private final List<?> params;

    protected BaseAbstractException(ErrorCode errorCode, String logMessage, Object... params) {
        super(formatMessage(errorCode, params));
        this.errorCode = errorCode;
        this.logMessage = logMessage;
        this.message = formatMessage(errorCode, params);
        this.params = Arrays.asList(params);
    }

    protected BaseAbstractException(Throwable cause, ErrorCode errorCode, String logMessage, Object... params) {
        super(formatMessage(errorCode, params), cause);
        this.errorCode = errorCode;
        this.logMessage = logMessage;
        this.message = formatMessage(errorCode, params);
        this.params = Arrays.asList(params);
    }

    private static String formatMessage(ErrorCode errorCode, Object... params) {
        String messageWithReplacedSingleQuotes = errorCode.getMessage().replace("'", "''");
        String formattedMessage = MessageFormat.format(messageWithReplacedSingleQuotes, params);
        return formattedMessage.replace("''", "'");
    }
}
