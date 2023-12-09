package com.sejaumbu.umbu.repository;

import com.sejaumbu.umbu.models.Umchat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UmchatRepository extends JpaRepository<Umchat, UUID> {
}