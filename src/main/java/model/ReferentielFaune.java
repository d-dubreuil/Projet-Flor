package model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ReferentielFaune {
	@ManyToOne
	@JoinColumn(name = "caracteristique_id")
	private Caracteristique caracteristique;
	@ManyToOne
	@JoinColumn(name = "flore_id")
	private Flore flore;
	@ManyToOne
	@JoinColumn(name = "faune_id")
	private Faune faune;
	
	public Caracteristique getCaracteristique() {
		return caracteristique;
	}
	public void setCaracteristique(Caracteristique caracteristique) {
		this.caracteristique = caracteristique;
	}
	public Flore getFlore() {
		return flore;
	}
	public void setFlore(Flore flore) {
		this.flore = flore;
	}
	public Faune getFaune() {
		return faune;
	}
	public void setFaune(Faune faune) {
		this.faune = faune;
	}
	
	
}
