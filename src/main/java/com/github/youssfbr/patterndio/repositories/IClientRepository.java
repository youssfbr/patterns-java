package com.github.youssfbr.patterndio.repositories;

import com.github.youssfbr.patterndio.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientRepository extends JpaRepository<Client, Long> {
}
