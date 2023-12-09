package com.sejaumbu.umbu.Repository;

import com.sejaumbu.umbu.Model.Parceiro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParceiroRepository extends JpaRepository<Parceiro, UUID> {
}
