package com.project.calculadora.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "historico")
public class HistoricEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long id;

	@Column(name = "NomeUsuario")
	private String userName;

	@Column(name = "NomeMedicamento")
	private String mediceneName;

	@Column(name = "QuantidadeApresentacao")
	private String presentationQuantity;

	@Column(name = "QuantidadePrescrita")
	private String prescribedQuantity;

	@Column(name = "ViaAdministracao")
	private String viaAdministration;

	@Column(name = "DataCalculo")
	private Date calculoDate;

	@Column(name = "ResultadosJson", length = 10000)
	private String jsonResults;

	public HistoricEntity() {
	}

	public HistoricEntity(Long id, String userName, String mediceneName, String presentationQuantity,
			String prescribedQuantity, String viaAdministration, Date calculoDate, String jsonResults) {
		this.id = id;
		this.userName = userName;
		this.mediceneName = mediceneName;
		this.presentationQuantity = presentationQuantity;
		this.prescribedQuantity = prescribedQuantity;
		this.viaAdministration = viaAdministration;
		this.calculoDate = calculoDate;
		this.jsonResults = jsonResults;
	}

	public HistoricEntity(String userName, String mediceneName, String presentationQuantity, String prescribedQuantity,
			String viaAdministration, Date calculoDate, String jsonResults) {
		this.userName = userName;
		this.mediceneName = mediceneName;
		this.presentationQuantity = presentationQuantity;
		this.prescribedQuantity = prescribedQuantity;
		this.viaAdministration = viaAdministration;
		this.calculoDate = calculoDate;
		this.jsonResults = jsonResults;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMediceneName() {
		return mediceneName;
	}

	public void setMediceneName(String mediceneName) {
		this.mediceneName = mediceneName;
	}

	public String getPresentationQuantity() {
		return presentationQuantity;
	}

	public void setPresentationQuantity(String presentationQuantity) {
		this.presentationQuantity = presentationQuantity;
	}

	public String getPrescribedQuantity() {
		return prescribedQuantity;
	}

	public void setPrescribedQuantity(String prescribedQuantity) {
		this.prescribedQuantity = prescribedQuantity;
	}

	public String getViaAdministration() {
		return viaAdministration;
	}

	public void setViaAdministration(String viaAdministration) {
		this.viaAdministration = viaAdministration;
	}

	public Date getCalculoDate() {
		return calculoDate;
	}

	public void setCalculoDate(Date calculoDate) {
		this.calculoDate = calculoDate;
	}

	public String getJsonResults() {
		return jsonResults;
	}

	public void setJsonResults(String jsonResults) {
		this.jsonResults = jsonResults;
	}

}
