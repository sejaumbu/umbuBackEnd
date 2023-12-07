package com.umbu.api.apiumbu.Repository;

import com.umbu.api.apiumbu.Model.Jardineiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface JardineiroRepository  extends JpaRepository<Jardineiro, UUID> {
}
