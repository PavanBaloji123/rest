package com.example.demospringworks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demospringworks.entity.Pavan;

@Repository
public interface PavanRepository extends JpaRepository<Pavan,Long>
{
	}
