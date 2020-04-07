package model;

public class Flore {
	private Long id;
	private String nom;
	private ReferentielCaracteristique referentielCaracteristique;
	private ReferentielFaune referentielFaune;
	private Utilisateur utilisateur;
	private Produit produit;
	
	public Flore() {
		super();
	}
	public Flore(String nom) {
		super();
		this.nom = nom;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ReferentielCaracteristique getReferentielCaracteristique() {
		return referentielCaracteristique;
	}
	public void setReferentielCaracteristique(ReferentielCaracteristique referentielCaracteristique) {
		this.referentielCaracteristique = referentielCaracteristique;
	}
	public ReferentielFaune getReferentielFaune() {
		return referentielFaune;
	}
	public void setReferentielFaune(ReferentielFaune referentielFaune) {
		this.referentielFaune = referentielFaune;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	@Override
	public String toString() {
		return "Flore [id=" + id + ", nom=" + nom + "]";
	}
	
	
	
	
}
