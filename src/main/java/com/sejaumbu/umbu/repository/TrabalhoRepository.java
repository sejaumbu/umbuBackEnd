package com.sejaumbu.umbu.repository;

import com.sejaumbu.umbu.models.Trabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface TrabalhoRepository extends JpaRepository<Trabalho, UUID> {
}
