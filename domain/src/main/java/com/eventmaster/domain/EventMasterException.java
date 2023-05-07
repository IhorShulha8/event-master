package com.eventmaster.domain;


public class EventMasterException extends BaseAbstractException {
    public EventMasterException(ErrorCode errorCode, String logMessage, String params) {
        super(errorCode, logMessage, params);
    }
}
