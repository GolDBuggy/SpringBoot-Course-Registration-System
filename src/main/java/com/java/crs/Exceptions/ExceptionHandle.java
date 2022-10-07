package com.java.crs.Exceptions;

import io.jsonwebtoken.ExpiredJwtException;
import org.hibernate.SessionException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> runtimeExc(RuntimeException e){
        ErrorResponse error=new ErrorResponse(HttpStatus.NOT_FOUND.value(),e.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }


}
