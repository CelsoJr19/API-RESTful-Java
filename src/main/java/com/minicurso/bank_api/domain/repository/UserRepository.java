package com.minicurso.bank_api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minicurso.bank_api.domain.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long>{}
