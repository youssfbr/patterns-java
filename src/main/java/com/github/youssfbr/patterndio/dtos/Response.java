package com.github.youssfbr.patterndio.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;


@Data
@EqualsAndHashCode(callSuper = false)
public class Response<T> {

    private int statusCode = HttpStatus.OK.value();
    private long timeStamp;
    private T data;

    public Response() {
        this.timeStamp = System.currentTimeMillis();
    }

}
