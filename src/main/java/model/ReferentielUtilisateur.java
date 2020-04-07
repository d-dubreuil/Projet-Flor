package model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ReferentielUtilisateur {
	@ManyToOne
	@JoinColumn (name = "compteUtilisateurId")
	private CompteUtilisateur compteUtilisateur;
	@ManyToOne
	@JoinColumn (name = "caracteristiqueId")
	private Caracteristique caracteristique;
	
	public CompteUtilisateur getCompteUtilisateur() {
		return compteUtilisateur;
	}
	public void setCompteUtilisateur(CompteUtilisateur compteUtilisateur) {
		this.compteUtilisateur = compteUtilisateur;
	}
	public Caracteristique getCaracteristique() {
		return caracteristique;
	}
	public void setCaracteristique(Caracteristique caracteristique) {
		this.caracteristique = caracteristique;
	}
	
	
}
