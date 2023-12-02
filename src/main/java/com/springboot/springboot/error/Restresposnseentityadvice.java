package com.springboot.springboot.error;

import com.springboot.springboot.model.Errormessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class Restresposnseentityadvice extends ResponseEntityExceptionHandler {
    @ExceptionHandler(Employeenotfoundexception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Errormessage employeenotfoundhandler(Employeenotfoundexception employeenotfoundexception){
              return new Errormessage(HttpStatus.NOT_FOUND,employeenotfoundexception.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Errormessage genericexceptionhandler(Exception e){
        return new Errormessage(HttpStatus.INTERNAL_SERVER_ERROR,e.getMessage());
    }
}
