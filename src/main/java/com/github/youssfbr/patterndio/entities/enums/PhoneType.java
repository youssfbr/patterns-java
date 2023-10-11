package com.github.youssfbr.patterndio.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    RES("Res"),
    COM("Com"),
    CEL("Cel");

    private final String description;

}
