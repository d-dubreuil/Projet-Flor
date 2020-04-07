package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table
public class Panier {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private Float total;
	@OneToOne(mappedBy = "panier")
	private Commande commande;
	@OneToMany(mappedBy = "panier")
	private Selection selection;
	@ManyToOne
	@JoinColumn(name= "utilisateur_id")
	private Utilisateur utilisateur;
	
	
	public Panier() {
		super();
	}
	public Panier(Float total) {
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
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	
	
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public Selection getSelection() {
		return selection;
	}
	public void setSelection(Selection selection) {
		this.selection = selection;
	}
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	@Override
	public String toString() {
		return "Panier [id=" + id + ", version=" + version + ", total=" + total + "]";
	}
	
}
