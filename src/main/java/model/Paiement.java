package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class Paiement {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private Integer numeroCarte;
	private Long montant;
	@OneToOne(mappedBy = "paiement")
	private Commande commande;

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
	
	
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	@Override
	public String toString() {
		return "Paiement [id=" + id + ", version=" + version + ", numeroCarte=" + numeroCarte + ", montant=" + montant
				+ "]";
	}
	
	
}
