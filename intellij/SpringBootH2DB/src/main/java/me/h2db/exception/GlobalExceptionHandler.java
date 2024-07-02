package me.h2db.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.resource.NoResourceFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody // else it will return the name of the view and view resolution unexpected error(return ResponseEntity)
    @ExceptionHandler(NoResourceFoundException.class)
    public String handleNoResourceFoundException(NoResourceFoundException ex) {
        return ex.getMessage();
    }

//    @ExceptionHandler(NoResourceFoundException.class) //
//    public ResponseEntity<?> handleNoResourceFoundException(NoResourceFoundException ex, WebRequest request) {
//        return ResponseEntity.status(HttpStatus.NOT_FOUND)
//                .body(new ErrorDetails(ex.getMessage(), request.getDescription(false)));
//    }


    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> globalExceptionHandler(Exception ex, WebRequest request) {
        ErrorDetails errorDetails = new ErrorDetails(ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
