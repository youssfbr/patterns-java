package com.github.youssfbr.patterndio.dtos;

import com.github.youssfbr.patterndio.entities.Phone;
import com.github.youssfbr.patterndio.entities.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PhoneDTO {

    private Long id;
    private PhoneType phoneType;
    private String number;

    public PhoneDTO(Phone entity) {
        this.id = entity.getId();
        this.phoneType = entity.getPhoneType();
        this.number = entity.getNumber();
    }

}
