package com.github.youssfbr.patterndio.entities.enums;

import lombok.Getter;

@Getter
public enum PhoneType {

    RES("Res"),
    COM("Com"),
    CEL("Cel");

    private final String description;

    PhoneType(String description) {
        this.description = description;
    }
}
