package com.sejaumbu.umbu.repository;

import com.sejaumbu.umbu.models.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, UUID> {

}
