package com.project.calculadora.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "medicamento")
public class MedicineEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "grupo_medicamento_id", nullable = false, insertable = false, updatable = false)
	private Long mediceGroupId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "grupo_medicamento_id", referencedColumnName = "id", nullable = false, insertable = true, updatable = true)
	private MedicineGroupEntity mediceGroupEntity;

	@Column(name = "laboratorio_id", nullable = false, insertable = false, updatable = false)
	private Long laboratoryId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "laboratorio_id", referencedColumnName = "id", nullable = false, insertable = true, updatable = true)
	private LaboratoryEntity laboratoryEntity;

	@Column(name = "name")
	private String name;

	@Column(name = "concentracao_inicial")
	private BigDecimal initialConcentration;

	@Column(name = "embalagem_apresentada")
	private String presentedPackaging;

	@Column(name = "quantidade_apresentacao")
	private BigDecimal presentingQuantity;

	@Column(name = "unidade_medida")
	private String unitMeasure;

	@Column(name = "info_observacao")
	private String observationInfo;

	@Column(name = "info_sobra")
	private String infoLeftover;

	@Column(name = "info_tempo_administracao")
	private String infoTimeAdministration;

	public MedicineEntity(Long id, Long mediceGroupId, Long laboratoryId, String name,
			BigDecimal initialConcentration, String presentedPackaging, BigDecimal presentingQuantity,
			String unitMeasure, String observationInfo, String infoLeftover, String infoTimeAdministration) {
		this.id = id;
		this.mediceGroupId = mediceGroupId;
		this.laboratoryId = laboratoryId;
		this.name = name;
		this.initialConcentration = initialConcentration;
		this.presentedPackaging = presentedPackaging;
		this.presentingQuantity = presentingQuantity;
		this.unitMeasure = unitMeasure;
		this.observationInfo = observationInfo;
		this.infoLeftover = infoLeftover;
		this.infoTimeAdministration = infoTimeAdministration;
	}

	public MedicineEntity(MedicineGroupEntity mediceGroupEntity, LaboratoryEntity laboratoryEntity,
			String name, BigDecimal initialConcentration, String presentedPackaging, BigDecimal presentingQuantity,
			String unitMeasure, String observationInfo, String infoLeftover, String infoTimeAdministration) {
		this.mediceGroupId = mediceGroupEntity.getId();
		this.laboratoryId = laboratoryEntity.getId();
		this.name = name;
		this.initialConcentration = initialConcentration;
		this.presentedPackaging = presentedPackaging;
		this.presentingQuantity = presentingQuantity;
		this.unitMeasure = unitMeasure;
		this.observationInfo = observationInfo;
		this.infoLeftover = infoLeftover;
		this.infoTimeAdministration = infoTimeAdministration;
	}
}
