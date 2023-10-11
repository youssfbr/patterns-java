package com.github.youssfbr.patterndio.entities;


import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity(name = "tb_client")
public class Clients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDate birthDate;

    @ToString.Exclude
    @OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE })
    private List<Phone> phones;

    @CreationTimestamp
    @Column(nullable = false,
            updatable = false,
            columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant createdAt;

}
