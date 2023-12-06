package com.umbu.api.apiumbu.Repository;

import br.com.sejaumbu.apiumbu.Model.Umchat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UmchatRepository extends  JpaRepository<Umchat, UUID>{

}