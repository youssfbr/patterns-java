package com.github.youssfbr.patterndio.controllers.exceptions;

import com.github.youssfbr.patterndio.dtos.Response;
import com.github.youssfbr.patterndio.services.exceptions.ClientNotFoundException;
import com.github.youssfbr.patterndio.services.exceptions.InternalServerErrorException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceHandler {

    private static final HttpStatus STATUS_BAD_REQUEST = HttpStatus.BAD_REQUEST;
    private static final HttpStatus STATUS_NOT_FOUND = HttpStatus.NOT_FOUND;
    private static final HttpStatus STATUS_INTERNAL_SERVER_ERROR = HttpStatus.INTERNAL_SERVER_ERROR;

    @ExceptionHandler(ClientNotFoundException.class)
    public ResponseEntity<Response<String>> handlerClientNotFoundException(ClientNotFoundException ex) {

        Response<String> response = new Response<>();
        response.setStatusCode(STATUS_NOT_FOUND.value());
        response.setData(ex.getMessage());

        return ResponseEntity.status(STATUS_NOT_FOUND).body(response);
    }

    @ExceptionHandler(InternalServerErrorException.class)
    public ResponseEntity<Response<String>> handlerInternalServerErrorException(InternalServerErrorException ex) {

        Response<String> response = new Response<>();
        response.setStatusCode(STATUS_INTERNAL_SERVER_ERROR.value());
        response.setData(ex.getMessage());

        return ResponseEntity.status(STATUS_INTERNAL_SERVER_ERROR).body(response);
    }

}
