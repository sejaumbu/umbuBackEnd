package com.umbu.api.apiumbu.Repository;

import com.umbu.api.apiumbu.Model.Plano;
import org.springframework.data.jpa.repository.JpaRepository;

import  java.util.UUID;

public interface PlanoRepository extends JpaRepository<Plano, UUID> {
}