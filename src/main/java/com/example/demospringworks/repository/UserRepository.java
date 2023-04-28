package com.example.demospringworks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demospringworks.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long>{}

