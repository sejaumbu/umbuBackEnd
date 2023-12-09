package com.sejaumbu.umbu.Repository;

import com.sejaumbu.umbu.Model.Trabalho;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrabalhoRepository extends JpaRepository<Trabalho, UUID> {
}
