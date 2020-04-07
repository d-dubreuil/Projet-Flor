package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

public class Paiement {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Column()
	private Integer numeroCarte;
	@Column()
	private Long montant;

	public Paiement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Paiement(Integer numeroCarte,Long montant) {
		super();
		this.numeroCarte=numeroCarte;
		this.montant=montant;
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
	public Integer getNumeroCarte() {
		return numeroCarte;
	}
	public void setNumeroCarte(Integer numeroCarte) {
		this.numeroCarte = numeroCarte;
	}
	public Long getMontant() {
		return montant;
	}
	public void setMontant(Long montant) {
		this.montant = montant;
	}
	@Override
	public String toString() {
		return "Paiement [id=" + id + ", version=" + version + ", numeroCarte=" + numeroCarte + ", montant=" + montant
				+ "]";
	}
	
	
}
