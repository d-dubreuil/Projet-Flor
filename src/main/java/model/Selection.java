package model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

public class Selection {

	
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private Integer total;
	@ManyToOne
	@JoinColumn(name = "produit_id")
	private Produit produit;
	@ManyToOne
	@JoinColumn(name = "panier_id")
	private Panier panier;
	
	public Selection() {
		super();
	}
	
	
	public Selection(Long id, int version, Integer total) {
		super();
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
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	


	public Produit getProduit() {
		return produit;
	}


	public void setProduit(Produit produit) {
		this.produit = produit;
	}


	public Panier getPanier() {
		return panier;
	}


	public void setPanier(Panier panier) {
		this.panier = panier;
	}


	@Override
	public String toString() {
		return "Selection [id=" + id + ", version=" + version + ", total=" + total + "]";
	}
	
	
}
