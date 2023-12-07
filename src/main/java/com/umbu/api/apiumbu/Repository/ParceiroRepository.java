package com.umbu.api.apiumbu.Repository;

import com.umbu.api.apiumbu.Model.Parceiro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParceiroRepository extends JpaRepository<Parceiro, UUID> {
}
