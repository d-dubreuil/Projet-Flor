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
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class Panier {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private Float total;
	@OneToOne(mappedBy = "panier")
	private List<Commande> commandes= new ArrayList<Commande>();
	@OneToMany(mappedBy = "panier")
	private List<Selection> selections= new ArrayList<Selection>();
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
	
	
	public List<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public List<Selection> getSelections() {
		return selections;
	}
	public void setSelections(List<Selection> selections) {
		this.selections = selections;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	public void addSelection(Selection selection) {
		this.selections.add(selection);
	}
	public void addCommande(Commande commande) {
		this.commandes.add(commande);
	}
	@Override
	public String toString() {
		return "Panier [id=" + id + ", version=" + version + ", total=" + total + "]";
	}
	
}
