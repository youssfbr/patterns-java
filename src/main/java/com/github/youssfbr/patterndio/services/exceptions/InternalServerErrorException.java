package com.github.youssfbr.patterndio.services.exceptions;

public class InternalServerErrorException extends RuntimeException {

    public InternalServerErrorException() {
        super("Internal error identified. Contact support");
    }
}
