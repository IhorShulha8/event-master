package com.eventmaster.domain;

public enum ErrorCode {

    NOT_IMPLEMENTED(3999, "Service is not implemented yet"),
    INCORRECT_REQUEST_PARAMETER(4000, "Incorrect request parameter {0}"),
    UNSUPPORTED(4001, "Unsupported action");

    private final Integer id;
    private final  String message;

    ErrorCode(Integer id, String message){
        this.id = id;
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
