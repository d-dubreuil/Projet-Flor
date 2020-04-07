package model;

public class Historique {
	private Long id;
	private String recherche;
	private String nomRecherche;
	private CompteUtilisateur compte;
	
	public Historique() {
		super();
	}
	public Historique(String recherche, String nomRecherche) {
		super();
		this.recherche = recherche;
		this.nomRecherche = nomRecherche;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRecherche() {
		return recherche;
	}
	public void setRecherche(String recherche) {
		this.recherche = recherche;
	}
	public String getNomRecherche() {
		return nomRecherche;
	}
	public void setNomRecherche(String nomRecherche) {
		this.nomRecherche = nomRecherche;
	}
	public CompteUtilisateur getCompte() {
		return compte;
	}
	public void setCompte(CompteUtilisateur compte) {
		this.compte = compte;
	}
	@Override
	public String toString() {
		return "Historique [id=" + id + ", recherche=" + recherche + ", nomRecherche=" + nomRecherche + "]";
	}
	

}
