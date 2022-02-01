package com.project.calculadora.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.calculadora.entities.MedicineEntity;

public interface MedicineRepository extends JpaRepository<MedicineEntity, Long> {

}
