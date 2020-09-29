package com.simplevat.product.controller;

import com.simplevat.product.exception.ApplicationError;
import com.simplevat.product.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
public class ErrorController extends ResponseEntityExceptionHandler {
    public ResponseEntity<ApplicationError> handleProductNotFoundException(ProductNotFoundException exception, WebRequest webRequest){
        ApplicationError error=new ApplicationError();
        error.setCode(101);
        error.setMessage(exception.getMessage());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
