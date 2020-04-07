package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table
public class Produit {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private Integer refProduit;
	private Long prix;
	private String fournisseur;
	private Integer stock;
	@ManyToOne
	@JoinColumn(name = "faune_id")
	private Faune faune;
	@ManyToOne
	@JoinColumn(name = "flore_id")
	private Flore flore;
	@OneToMany(mappedBy = "produit")
	private List<Selection> selections= new ArrayList<Selection>();
	@ManyToOne
	@JoinColumn(name = "utilisateur_id")
	private Utilisateur utilisateur;
	
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
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	public List<Selection> getSelections() {
		return selections;
	}
	public void setSelections(List<Selection> selections) {
		this.selections = selections;
	}
	public void addSelection(Selection selection) {
		this.selections.add(selection);
	}
	@Override
	public String toString() {
		return "Produit [id=" + id + ", version=" + version + ", refProduit=" + refProduit + ", prix=" + prix
				+ ", fournisseur=" + fournisseur + ", stock=" + stock + "]";
	}
	
	
}
