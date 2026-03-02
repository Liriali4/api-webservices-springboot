package com.webservice.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webservice.vendas.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
