package com.github.youssfbr.patterndio.entities;

import com.github.youssfbr.patterndio.entities.enums.PhoneType;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "tb_phone")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    private PhoneType phoneType;

    @Column(nullable = false, length = 20)
    private String number;
}
