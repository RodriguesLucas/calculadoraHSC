package com.project.calculadora.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.calculadora.entities.HistoricEntity;

public interface HistoricRepository extends JpaRepository<HistoricEntity, Long> {

}
