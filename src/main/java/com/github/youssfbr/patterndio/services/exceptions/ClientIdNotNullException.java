package com.github.youssfbr.patterndio.services.exceptions;

public class ClientIdNotNullException extends RuntimeException {
    public ClientIdNotNullException() { super("Client ID must be null. "); }
}
