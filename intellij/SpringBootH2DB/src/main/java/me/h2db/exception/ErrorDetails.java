package me.h2db.exception;

public class ErrorDetails {
    private String message;
    private String details;

    public ErrorDetails(String message, String details) {
        super();
        this.message = message;
        this.details = details;
    }

    // Getters and setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

