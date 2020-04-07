package Test;

import DAO.interfaces.ICaracteristiqueDao;
import DAO.interfaces.IFauneDao;
import DAO.interfaces.IFloreDao;
import DAO.interfaces.IReferentielCaracteristiqueDao;
import DAO.interfaces.IReferentielFauneDao;
import model.Caracteristique;
import model.Faune;
import model.Flore;
import model.ReferentielCaracteristique;
import model.ReferentielFaune;
import model.TypeCarac;

import singleton.Application;

import DAO.JPA.CompteUtilisateurDaoJpa;
import DAO.JPA.HistoriqueDaoJpa;
import DAO.interfaces.ICaracteristiqueDao;
import DAO.interfaces.ICommandeDao;
import DAO.interfaces.ICompteUtilisateurDao;
import DAO.interfaces.IConseilDao;
import DAO.interfaces.IFauneDao;
import DAO.interfaces.IFloreDao;
import DAO.interfaces.IHistoriqueDao;
import DAO.interfaces.IPaiementDao;
import DAO.interfaces.IProduitDao;
import DAO.interfaces.IReferentielCaracteristiqueDao;
import DAO.interfaces.IReferentielFauneDao;
import DAO.interfaces.IReferentielUtilisateurDao;
import DAO.interfaces.ISelectionDao;
import DAO.interfaces.IUtilisateurDao;
import model.CompteUtilisateur;
import model.Historique;
import model.TypeUtilisateur;
import model.Utilisateur;
import singleton.Application;


public class Test_vide {

	public static void main(String[] args) {
		ICaracteristiqueDao caracteristiqueDao = Application.getInstance().getCaracteristiqueDao();
		IReferentielCaracteristiqueDao referentielCaracteristiqueDao = Application.getInstance()
				.getReferentielCaracteristiqueDao();
		IReferentielFauneDao referentielFauneDao = Application.getInstance().getReferentielFauneDao();
		IFloreDao floreDao = Application.getInstance().getFloreDao();
		IFauneDao fauneDao = Application.getInstance().getFauneDao();

		Caracteristique cycle1 = new Caracteristique("Cycle de vie", "vivace", TypeCarac.Flore);
		Caracteristique type1 = new Caracteristique("Type de fraisier", "remontant", TypeCarac.Flore);
		Caracteristique plantation1 = new Caracteristique("Plantation", "automne", TypeCarac.Flore);
		Caracteristique recolte1 = new Caracteristique("Récolte", "mi-juin à fin juillet", TypeCarac.Flore);
		Caracteristique usage1 = new Caracteristique("Usage", "comestible", TypeCarac.Utilisation);
		Caracteristique predateur1 = new Caracteristique("Prédateurs", "limaces", TypeCarac.Faune);
		Caracteristique ensoleillement1 = new Caracteristique("Ensoleillement", "plein soleil", TypeCarac.Meteo);
		Caracteristique temperature1 = new Caracteristique("Température idéale", "entre 10 et 25°C", TypeCarac.Meteo);
		Caracteristique texture1 = new Caracteristique("Type de sol", "sol humifère meuble et sableux", TypeCarac.Sol);
		Caracteristique pH1 = new Caracteristique("pH du sol", "5,5 à 7,5 : acide à neutre", TypeCarac.Sol);
		Caracteristique arrosage1 = new Caracteristique("Arrosage", "arrosage sans excès", TypeCarac.Sol);

		cycle1 = caracteristiqueDao.save(cycle1);
		type1 = caracteristiqueDao.save(type1);
		plantation1 = caracteristiqueDao.save(plantation1);
		recolte1 = caracteristiqueDao.save(recolte1);
		usage1 = caracteristiqueDao.save(usage1);
		predateur1 = caracteristiqueDao.save(predateur1);
		ensoleillement1 = caracteristiqueDao.save(ensoleillement1);
		temperature1 = caracteristiqueDao.save(temperature1);
		texture1 = caracteristiqueDao.save(texture1);
		pH1 = caracteristiqueDao.save(pH1);
		arrosage1 = caracteristiqueDao.save(arrosage1);

		ReferentielCaracteristique ref1 = new ReferentielCaracteristique();
		ref1 = referentielCaracteristiqueDao.save(ref1);
		ref1.setCaracteristique(cycle1);
		ref1.setCaracteristique(type1);
		ref1.setCaracteristique(plantation1);
		ref1.setCaracteristique(recolte1);
		ref1.setCaracteristique(usage1);
		ref1.setCaracteristique(predateur1);
		ref1.setCaracteristique(ensoleillement1);
		ref1.setCaracteristique(temperature1);
		ref1.setCaracteristique(texture1);
		ref1.setCaracteristique(pH1);
		ref1.setCaracteristique(arrosage1);

		Flore fraisier = new Flore("Fraisier mariguette");
		fraisier = floreDao.save(fraisier);
		ref1.setFlore(fraisier);
		ref1 = referentielCaracteristiqueDao.save(ref1);

//		Utilisateur uti1 = new Utilisateur(TypeUtilisateur.Visiteur);
//		fraisier.setUtilisateurs(uti1);
//		fraisier = floreDao.save(fraisier);

//		Produit prod1 = new Produit("à compléter");
//		fraisier.setProduit(prod1);
//		fraisier = floreDao.save(fraisier);

//		ReferentielUtilisateur refuti1 = new ReferentielUtilisateur();
//		refuti1.setCompteUtilisateur(compteUtilisateur);
//		refuti1 = referentielUtilisateurDao.save(refuti1);

		Faune limace = new Faune("Limace");
		limace = fauneDao.save(limace);
		ReferentielFaune ref2 = new ReferentielFaune();
		ref2 = referentielFauneDao.save(ref2);
		ref2.setFaune(limace);
		ref2.setCaracteristique(predateur1);
		ref2.setFlore(fraisier);
		ref2 = referentielFauneDao.save(ref2);

//		Produit prod1 = new Produit("à compléter");
//		prod1.setFaune(limace);
//		prod1 = fauneDao.save(limace);
//
//		prod1.setFlore(fraisier);
//		prod1 = fauneDao.save(fraisier);

		
//		ICaracteristiqueDao caracteristiqueDao = Application.getInstance().getCaracteristiqueDao();
//		ICommandeDao commandeDao = Application.getInstance().getCommandeDao();
		ICompteUtilisateurDao compteUtilisateurDao = Application.getInstance().getCompteUtilisateurDao();
//		IConseilDao conseilDao = Application.getInstance().getConseilDao();
//		IFauneDao fauneDao = Application.getInstance().getFauneDao();
//		IFloreDao floreDao = Application.getInstance().getFloreDao();
		IHistoriqueDao historiqueDao = Application.getInstance().getHistoriqueDao();
//		IPaiementDao paiementDao = Application.getInstance().getPaiementDao();
//		IProduitDao produitDao = Application.getInstance().getProduitDao();
//		IReferentielCaracteristiqueDao referentielCaracteristiqueDao =  Application.getInstance().getReferentielCaracteristiqueDao();
//		IReferentielFauneDao referentielFauneDao = Application.getInstance().getReferentielFauneDao();
//		IReferentielUtilisateurDao referentielUtilisateurDao = Application.getInstance().getReferentielUtilisateurDao(); 
//		ISelectionDao selectionDao = Application.getInstance().getSelectionDao(); 
		IUtilisateurDao utilisateurDao = Application.getInstance().getUtilisateurDao(); 
		
			
		
		Historique historique1 = new Historique("faune", "fraises");
		
		historique1 = historiqueDao.save(historique1); 
		
		CompteUtilisateur compte1 = new CompteUtilisateur("manoncharles", "mdp", "charles.manon@yahoo.com", "Charles",
		"21 avenue Colonel Pierre Bourgoin", "Maison D10", "33127", "Martignas sur Jalle", "06.35.24.43.32");
	
		compte1 = compteUtilisateurDao.save(compte1);
		
		historique1.setCompte(compte1);
		historique1 = historiqueDao.save(historique1); 
		
		
		Utilisateur contrib1 = new Utilisateur (TypeUtilisateur.Contributeur); 
		
		contrib1 = utilisateurDao.save(contrib1); 
		
		contrib1.setCompteUtilisateur(compte1);
		contrib1 = utilisateurDao.save(contrib1); 
		
		
	}

}
