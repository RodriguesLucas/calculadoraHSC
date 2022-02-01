package com.project.calculadora.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "diluicao_configuracao")
public class DilutionConfigurationEntity {
	@EmbeddedId
	private DilutionConfigurationPK dilutionConfigurationPK;

	@Column(name = "quantidade_aspirada")
	private BigDecimal aspiratedQuantity;

	@Column(name = "quantidade_adicionada", nullable = false)
	private BigDecimal addedQuantity;

	@Column(name = "concentration")
	private BigDecimal concentration;

	@Column(name = "diluent")
	private String diluent;

	@Column(name = "modo_preparo")
	private String preparationMode;

	public DilutionConfigurationEntity() {

	}

	public DilutionConfigurationEntity(MedicineEntity medicine, ViaAdministrationEntity viaAdministracao, Long sequencia,
			BigDecimal aspiratedQuantity, BigDecimal addedQuantity, BigDecimal concentration,
			String diluent, String preparationMode) {
		this.dilutionConfigurationPK = new DilutionConfigurationPK(medicine, viaAdministracao, sequencia);
		this.addedQuantity = addedQuantity;
		this.aspiratedQuantity = aspiratedQuantity;
		this.concentration = concentration;
		this.diluent = diluent;
		this.preparationMode = preparationMode;
		
	}

	public DilutionConfigurationPK getDilutionConfigurationPK() {
		return dilutionConfigurationPK;
	}

	public void setDilutionConfigurationPK(DilutionConfigurationPK dilutionConfigurationPK) {
		this.dilutionConfigurationPK = dilutionConfigurationPK;
	}

	public BigDecimal getAspiratedQuantity() {
		return aspiratedQuantity;
	}

	public void setAspiratedQuantity(BigDecimal aspiratedQuantity) {
		this.aspiratedQuantity = aspiratedQuantity;
	}

	public BigDecimal getAddedQuantity() {
		return addedQuantity;
	}

	public void setAddedQuantity(BigDecimal addedQuantity) {
		this.addedQuantity = addedQuantity;
	}

	public BigDecimal getConcentration() {
		return concentration;
	}

	public void setConcentration(BigDecimal concentration) {
		this.concentration = concentration;
	}

	public String getDiluent() {
		return diluent;
	}

	public void setDiluent(String diluent) {
		this.diluent = diluent;
	}

	public String getPreparationMode() {
		return preparationMode;
	}

	public void setPreparationMode(String preparationMode) {
		this.preparationMode = preparationMode;
	}
	
	
}
