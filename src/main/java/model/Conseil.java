package model;

public class Conseil {
	private Long id;
	private String nom;
	private Utilisateur utilisateur;
	
	public Conseil() {
		super();
	}
	public Conseil(String nom) {
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
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	@Override
	public String toString() {
		return "Conseil [id=" + id + ", nom=" + nom + "]";
	}

	


}
