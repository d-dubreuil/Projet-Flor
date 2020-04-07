package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class Jardin {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String nom;
	@ManyToMany
	@JoinTable (name = "Plante_Jardin",joinColumns = @JoinColumn(name="jardin_id"),inverseJoinColumns = @JoinColumn(name="flore_id"))
	private List<Flore> flores = new ArrayList<Flore>();
	@OneToOne
	@JoinColumn (name = "compteUtilisateru_id")
	private CompteUtilisateur compteUtilisateur;
	public Jardin(String nom) {
		super();
		this.nom = nom;
	}
	public Jardin() {
		super();
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
	public List<Flore> getFlores() {
		return flores;
	}
	public void setFlores(List<Flore> flores) {
		this.flores = flores;
	}
	public void addFlores (Flore flore) {
		this.flores.add(flore);
	}
	public CompteUtilisateur getCompteUtilisateur() {
		return compteUtilisateur;
	}
	public void setCompteUtilisateur(CompteUtilisateur compteUtilisateur) {
		this.compteUtilisateur = compteUtilisateur;
	}
	

}
