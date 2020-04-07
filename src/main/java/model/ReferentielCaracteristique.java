package model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ReferentielCaracteristique {
	@ManyToOne
	@JoinColumn (name = "caracteristique_Id")
	private Caracteristique caracteristique;
	@ManyToOne
	@JoinColumn (name = "flore_id")
	private Flore flore;
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
	
	

}
