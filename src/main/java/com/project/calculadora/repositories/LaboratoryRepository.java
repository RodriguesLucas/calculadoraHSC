package com.project.calculadora.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.calculadora.entities.LaboratoryEntity;

public interface LaboratoryRepository extends JpaRepository<LaboratoryEntity, Long> {

}
