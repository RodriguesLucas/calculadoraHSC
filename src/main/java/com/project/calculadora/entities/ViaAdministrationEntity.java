package com.project.calculadora.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "via_administracao")
public class ViaAdministrationEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(unique = false, nullable = false)
	private String name;

	public ViaAdministrationEntity(String name) {
		this.name = name;
	}

	public ViaAdministrationEntity() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ViaAdministracaoEntity [id=" + id + ", name=" + name + "]";
	}
}
