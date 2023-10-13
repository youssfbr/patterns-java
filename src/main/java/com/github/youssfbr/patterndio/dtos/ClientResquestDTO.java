package com.github.youssfbr.patterndio.dtos;

import com.github.youssfbr.patterndio.entities.Client;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientResquestDTO {

    private Long id;
    private String name;
    private LocalDate birthDate;
    private List<PhoneRequestDTO> phones = new ArrayList<>();

    public ClientResquestDTO(Client client) {
        id = client.getId();
        name = client.getName();
        birthDate = client.getBirthDate();

        client.getPhones().forEach(x -> this.phones.add(new PhoneRequestDTO(x)));
    }

}
