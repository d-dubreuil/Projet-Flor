package model;

public class Utilisateur {
	private Long id;
	private String type;
	private TypeUtilisateur disc;
	private CompteUtilisateur compteUtilisateur;
	private Conseil conseil;
	private Panier panier;
	private Produit produit;
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
