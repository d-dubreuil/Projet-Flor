package Test;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
