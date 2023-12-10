package com.sejaumbu.umbu.repository;

import com.sejaumbu.umbu.models.Jardineiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface JardineiroRepository  extends JpaRepository<Jardineiro, UUID> {
}
