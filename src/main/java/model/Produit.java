package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

public class Produit {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Column()
	private Integer refProduit;
	private Long prix;
	private String fournisseur;
	private Integer stock;
	private Faune faune;
	private Flore flore;
	private Selection selection;
	
	public Produit() {
		super();
	}
	public Produit(Integer refProduit, Long prix, String fournisseur, Integer stock) {
		super();
		this.refProduit = refProduit;
		this.prix = prix;
		this.fournisseur = fournisseur;
		this.stock = stock;
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
	public Integer getRefProduit() {
		return refProduit;
	}
	public void setRefProduit(Integer refProduit) {
		this.refProduit = refProduit;
	}
	public Long getPrix() {
		return prix;
	}
	public void setPrix(Long prix) {
		this.prix = prix;
	}
	public String getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	public Faune getFaune() {
		return faune;
	}
	public void setFaune(Faune faune) {
		this.faune = faune;
	}
	public Flore getFlore() {
		return flore;
	}
	public void setFlore(Flore flore) {
		this.flore = flore;
	}
	public Selection getSelection() {
		return selection;
	}
	public void setSelection(Selection selection) {
		this.selection = selection;
	}
	@Override
	public String toString() {
		return "Produit [id=" + id + ", version=" + version + ", refProduit=" + refProduit + ", prix=" + prix
				+ ", fournisseur=" + fournisseur + ", stock=" + stock + "]";
	}
	
	
}
