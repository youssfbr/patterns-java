package com.github.youssfbr.patterndio.entities;


import jakarta.persistence.Column;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

public class Clients {
    private Long id;
    private String name;
    private LocalDate birthDate;
    private List<Phone> phones;
    @CreationTimestamp
    @Column(nullable = false,
            updatable = false,
            columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant createdAt;

}
