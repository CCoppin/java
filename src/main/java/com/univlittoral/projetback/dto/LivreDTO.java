package com.univlittoral.projetback.dto;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class LivreDTO {
	
	
	private Long id;
	private String nom;
	private String editeur;
	private Integer nbPages;
	private Date dateParution;
	private String lieuParution;
	@Enumerated(EnumType.STRING)
	private TypeEnum genre;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	public Integer getNbPages() {
		return nbPages;
	}
	public void setNbPages(Integer nbPages) {
		this.nbPages = nbPages;
	}
	public Date getDateParution() {
		return dateParution;
	}
	public void setDateParution(Date dateParution) {
		this.dateParution = dateParution;
	}
	public String getLieuParution() {
		return lieuParution;
	}
	public void setLieuParution(String lieuParution) {
		this.lieuParution = lieuParution;
	}
	public TypeEnum getGenre() {
		return genre;
	}
	public void setGenre(TypeEnum genre) {
		this.genre = genre;
	}
	
		

}
