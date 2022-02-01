package com.project.calculadora.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class DilutionConfigurationPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@JoinColumn(name = "medicine_id", referencedColumnName = "id", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private MedicineEntity medicine;

	@JoinColumn(name = "via_administracao_id", referencedColumnName = "id", nullable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private ViaAdministrationEntity viaAdministration;

	@Column(name = "sequence")
	private Long sequence;

	public DilutionConfigurationPK() {

	}

	public DilutionConfigurationPK(MedicineEntity medicine, ViaAdministrationEntity viaAdministration, Long sequence) {
		this.medicine = medicine;
		this.viaAdministration = viaAdministration;
		this.sequence = sequence;
	}

	public MedicineEntity getMedicine() {
		return medicine;
	}

	public void setMedicine(MedicineEntity medicine) {
		this.medicine = medicine;
	}

	public ViaAdministrationEntity getViaAdministration() {
		return viaAdministration;
	}

	public void setViaAdministration(ViaAdministrationEntity viaAdministration) {
		this.viaAdministration = viaAdministration;
	}

	public Long getSequence() {
		return sequence;
	}

	public void setSequence(Long sequence) {
		this.sequence = sequence;
	}

}
