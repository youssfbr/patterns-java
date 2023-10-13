package com.github.youssfbr.patterndio.dtos;

import com.github.youssfbr.patterndio.entities.Client;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientResponseDTO {

    private Long id;
    private String name;
    private String birthDate;
    private List<PhoneDTO> phones = new ArrayList<>();

    public ClientResponseDTO(Client client) {
        id = client.getId();
        name = client.getName();
        birthDate = client.getBirthDate().toString();

        client.getPhones().forEach(x -> this.phones.add(new PhoneDTO(x)));
    }

}
