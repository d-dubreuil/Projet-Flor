package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class Conseil {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String nom;
	@ManyToOne
	@JoinColumn (name="utilisateur_id")
	private Utilisateur utilisateur;
	
	public Conseil() {
		super();
	}
	public Conseil(String nom) {
		super();
		this.nom = nom;
	}
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
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	@Override
	public String toString() {
		return "Conseil [id=" + id + ", nom=" + nom + "]";
	}

	


}
