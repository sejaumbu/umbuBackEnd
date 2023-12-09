package com.sejaumbu.umbu.repository;

import com.sejaumbu.umbu.models.Plano;
import org.springframework.data.jpa.repository.JpaRepository;

import  java.util.UUID;

public interface PlanoRepository extends JpaRepository<Plano, UUID> {
}