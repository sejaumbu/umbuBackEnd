package com.umbu.api.apiumbu.Repository;

import com.umbu.api.apiumbu.Model.Trabalho;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrabalhoRepository extends JpaRepository<Trabalho, UUID> {
}
