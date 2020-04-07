package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

public class Faune {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String nomFaune;
	private ReferentielFaune referentielFaune;
	
	public Faune() {
		super();
	}
	public Faune(String nomFaune) {
		super();
		this.nomFaune = nomFaune;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getNomFaune() {
		return nomFaune;
	}
	public void setNomFaune(String nomFaune) {
		this.nomFaune = nomFaune;
	}
	
	public ReferentielFaune getReferentielFaune() {
		return referentielFaune;
	}
	public void setReferentielFaune(ReferentielFaune referentielFaune) {
		this.referentielFaune = referentielFaune;
	}
	@Override
	public String toString() {
		return "Faune [id=" + id + ", version=" + version + ", nomFaune=" + nomFaune + "]";
	}
	
	
}
