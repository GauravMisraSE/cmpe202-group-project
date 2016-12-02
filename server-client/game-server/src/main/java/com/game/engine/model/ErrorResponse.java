package com.game.engine.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Sushant on 01-12-2016.
 */
@XmlRootElement
public class ErrorResponse {
    private String message;
    private Integer errorId;

    public ErrorResponse() {
    }

    public ErrorResponse(String message,Integer id) {
        this.message = message;
        this.errorId =id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getErrorId() {
        return errorId;
    }

    public void setErrorId(Integer errorId) {
        this.errorId = errorId;
    }
}
