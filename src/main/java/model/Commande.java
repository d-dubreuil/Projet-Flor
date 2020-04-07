package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

public class Commande {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Column()
	private Integer reference;
	private Paiement paiement;
	private Panier panier;
	@Column()
	private String typeEnvoi;
	private Float total;
	
	public Commande() {
		super();
	}
	public Commande(Integer reference, String typeEnvoi, Float total) {
		super();
		this.reference = reference;
		this.typeEnvoi = typeEnvoi;
		this.total = total;
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
	public Integer getReference() {
		return reference;
	}
	public void setReference(Integer reference) {
		this.reference = reference;
	}
	public String getTypeEnvoi() {
		return typeEnvoi;
	}
	public void setTypeEnvoi(String typeEnvoi) {
		this.typeEnvoi = typeEnvoi;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	
	
	public Paiement getPaiement() {
		return paiement;
	}
	public void setPaiement(Paiement paiement) {
		this.paiement = paiement;
	}
	public Panier getPanier() {
		return panier;
	}
	public void setPanier(Panier panier) {
		this.panier = panier;
	}
	@Override
	public String toString() {
		return "Commande [id=" + id + ", version=" + version + ", reference=" + reference + ", typeEnvoi=" + typeEnvoi
				+ ", total=" + total + "]";
	}
	
	
}
