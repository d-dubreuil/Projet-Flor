package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class Utilisateur {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String type;
	private TypeUtilisateur disc;
	@OneToOne
	@JoinColumn(name="compteUtilisateurId")
	private CompteUtilisateur compteUtilisateur;
	@OneToMany (mappedBy = "utilisateur")
	private Conseil conseil;
	@OneToMany (mappedBy = "utilisateur")
	private Panier panier;
	@OneToMany (mappedBy = "utilisateur")
	private Produit produit;
	@ManyToMany
	@JoinTable (name = "recherches",joinColumns = @JoinColumn(name="utilisateur_id"),inverseJoinColumns = @JoinColumn(name="flore_id"))
	private Flore flore;
	
	public Utilisateur() {
		super();
	}
	public Utilisateur(String type, TypeUtilisateur disc) {
		super();
		this.type = type;
		this.disc = disc;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public TypeUtilisateur getDisc() {
		return disc;
	}
	public void setDisc(TypeUtilisateur disc) {
		this.disc = disc;
	}
	public CompteUtilisateur getCompteUtilisateur() {
		return compteUtilisateur;
	}
	public void setCompteUtilisateur(CompteUtilisateur compteUtilisateur) {
		this.compteUtilisateur = compteUtilisateur;
	}
	public Conseil getConseil() {
		return conseil;
	}
	public void setConseil(Conseil conseil) {
		this.conseil = conseil;
	}
	public Panier getPanier() {
		return panier;
	}
	public void setPanier(Panier panier) {
		this.panier = panier;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public Flore getFlore() {
		return flore;
	}
	public void setFlore(Flore flore) {
		this.flore = flore;
	}
	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", type=" + type + ", disc=" + disc + "]";
	}
	
	
	

}
