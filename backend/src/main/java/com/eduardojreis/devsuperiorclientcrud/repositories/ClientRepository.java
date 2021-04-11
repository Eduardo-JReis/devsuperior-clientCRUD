package com.eduardojreis.devsuperiorclientcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardojreis.devsuperiorclientcrud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
