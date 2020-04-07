package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Caracteristique {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String nom;
	private String valeur;
	private TypeCarac typeCarac;
	@OneToMany (mappedBy = "caracteristique")
	private ReferentielUtilisateur referentielUtilisateur;
	@OneToMany (mappedBy = "caracteristique")
	private ReferentielCaracteristique referentielCaracteristique;
	@OneToMany (mappedBy = "caracteristique")
	private ReferentielFaune referentielFaune;
		
	public Caracteristique() {
		super();
	}
	
	public Caracteristique(String nom, String valeur, TypeCarac typeCarac) {
		super();
		this.nom = nom;
		this.valeur = valeur;
		this.typeCarac = typeCarac;
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
	public String getValeur() {
		return valeur;
	}
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
	public TypeCarac getTypeCarac() {
		return typeCarac;
	}
	public void setTypeCarac(TypeCarac typeCarac) {
		this.typeCarac = typeCarac;
	}
	public ReferentielUtilisateur getReferentielUtilisateur() {
		return referentielUtilisateur;
	}
	public void setReferentielUtilisateur(ReferentielUtilisateur referentielUtilisateur) {
		this.referentielUtilisateur = referentielUtilisateur;
	}
	public ReferentielCaracteristique getReferentielCaracteristique() {
		return referentielCaracteristique;
	}
	public void setReferentielCaracteristique(ReferentielCaracteristique referentielCaracteristique) {
		this.referentielCaracteristique = referentielCaracteristique;
	}
	public ReferentielFaune getReferentielFaune() {
		return referentielFaune;
	}
	public void setReferentielFaune(ReferentielFaune referentielFaune) {
		this.referentielFaune = referentielFaune;
	}

	@Override
	public String toString() {
		return "Caracteristique [id=" + id + ", nom=" + nom + ", valeur=" + valeur + ", typeCarac=" + typeCarac + "]";
	}
	
	
}
