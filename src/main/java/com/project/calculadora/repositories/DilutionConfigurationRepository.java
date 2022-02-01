package com.project.calculadora.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.calculadora.entities.DilutionConfigurationEntity;
import com.project.calculadora.entities.DilutionConfigurationPK;

public interface DilutionConfigurationRepository
		extends JpaRepository<DilutionConfigurationEntity, DilutionConfigurationPK> {

}
