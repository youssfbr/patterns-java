package com.github.youssfbr.patterndio.entities;

import com.github.youssfbr.patterndio.dtos.PhoneRequestDTO;
import com.github.youssfbr.patterndio.entities.enums.PhoneType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
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

    public Phone(PhoneRequestDTO phoneRequestDTO) {
        this.id = phoneRequestDTO.getId();
        this.phoneType = phoneRequestDTO.getPhoneType();
        this.number = phoneRequestDTO.getNumber();
    }
}
