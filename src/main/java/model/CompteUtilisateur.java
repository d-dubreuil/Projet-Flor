package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class CompteUtilisateur {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String identifiant;
	private String motDePasse;
	private String mail;
	private String nom;
	private String rue;
	private String complement;
	private String codePostal;
	private String ville;
	private String telephone;
	@OneToMany (mappedBy = "compte")
	private Historique historique;
	@OneToOne (mappedBy = "compteUtilisateur")
	private Utilisateur utilisateur;
	@OneToMany (mappedBy = "compteUtilisateur")
	private ReferentielUtilisateur referentielUtiliseur;
	
	public CompteUtilisateur() {
		super();
	}
	public CompteUtilisateur(String identifiant, String motDePasse, String mail, String nom, String rue,
			String complement, String codePostal, String ville, String telephone) {
		super();
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
		this.mail = mail;
		this.nom = nom;
		this.rue = rue;
		this.complement = complement;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Historique getHistorique() {
		return historique;
	}
	public void setHistorique(Historique historique) {
		this.historique = historique;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public ReferentielUtilisateur getReferentielUtiliseur() {
		return referentielUtiliseur;
	}
	public void setReferentielUtiliseur(ReferentielUtilisateur referentielUtiliseur) {
		this.referentielUtiliseur = referentielUtiliseur;
	}
	@Override
	public String toString() {
		return "CompteUtilisateur [id=" + id + ", identifiant=" + identifiant + ", motDePasse=" + motDePasse + ", mail="
				+ mail + ", nom=" + nom + ", rue=" + rue + ", complement=" + complement + ", codePostal=" + codePostal
				+ ", ville=" + ville + ", telephone=" + telephone + "]";
	}
	
	
	
	
}
