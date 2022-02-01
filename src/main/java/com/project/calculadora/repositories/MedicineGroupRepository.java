package com.project.calculadora.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.calculadora.entities.MedicineGroupEntity;

public interface MedicineGroupRepository extends JpaRepository<MedicineGroupEntity, Long> {

}
