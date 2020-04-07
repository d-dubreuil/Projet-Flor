package Singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import DAO.JPA.CaracteristiqueDaoJpa;
import DAO.JPA.CommandeDaoJpa;
import DAO.JPA.CompteUtilisateurDaoJpa;
import DAO.JPA.ConseilDaoJpa;
import DAO.JPA.FauneDaoJpa;
import DAO.JPA.FloreDaoJpa;
import DAO.JPA.HistoriqueDaoJpa;
import DAO.JPA.PaiementDaoJpa;
import DAO.JPA.PanierDaoJpa;
import DAO.JPA.ProduitDaoJpa;
import DAO.JPA.ReferentielCaracteristiqueDaoJpa;
import DAO.JPA.ReferentielFauneDaoJpa;
import DAO.JPA.ReferentielUtilisateurDaoJpa;
import DAO.JPA.SelectionDaoJpa;
import DAO.JPA.UtilisateurDaoJpa;
import DAO.interfaces.ICaracteristiqueDao;
import DAO.interfaces.ICommandeDao;
import DAO.interfaces.ICompteUtilisateurDao;
import DAO.interfaces.IConseilDao;
import DAO.interfaces.IFauneDao;
import DAO.interfaces.IFloreDao;
import DAO.interfaces.IHistoriqueDao;
import DAO.interfaces.IPaiementDao;
import DAO.interfaces.IPanierDao;
import DAO.interfaces.IProduitDao;
import DAO.interfaces.IReferentielCaracteristiqueDao;
import DAO.interfaces.IReferentielFauneDao;
import DAO.interfaces.IReferentielUtilisateurDao;
import DAO.interfaces.ISelectionDao;
import DAO.interfaces.IUtilisateurDao;





public class Application {

	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("vol");

	private final ICaracteristiqueDao CaracteristiqueDao = new CaracteristiqueDaoJpa();
	
	private final ICommandeDao commandeDao = new CommandeDaoJpa();

	private final ICompteUtilisateurDao compteUtilisateurDao = new CompteUtilisateurDaoJpa();

	private final IConseilDao conseilDao = new ConseilDaoJpa();

	private final IFauneDao fauneDao = new FauneDaoJpa();

	private final IFloreDao floreDao = new FloreDaoJpa();

	private final IHistoriqueDao historiqueDao = new HistoriqueDaoJpa();

	private final IPaiementDao paiementDao = new PaiementDaoJpa();

	private final IPanierDao panierDao = new PanierDaoJpa();

	private final IProduitDao produitDao = new ProduitDaoJpa();

	private final IReferentielCaracteristiqueDao referentielCaracteristiqueDao = new ReferentielCaracteristiqueDaoJpa();

	private final IReferentielFauneDao referentielFauneDao = new ReferentielFauneDaoJpa();

	private final IReferentielUtilisateurDao referentielUtilisateurDao = new ReferentielUtilisateurDaoJpa();

	private final ISelectionDao selectionDao = new SelectionDaoJpa();

	private final IUtilisateurDao utilisateurDao = new UtilisateurDaoJpa();




	public ICaracteristiqueDao getCaracteristiqueDao() {
		return CaracteristiqueDao;
	}


	public ICommandeDao getCommandeDao() {
		return commandeDao;
	}


	public ICompteUtilisateurDao getCompteUtilisateurDao() {
		return compteUtilisateurDao;
	}


	public IConseilDao getConseilDao() {
		return conseilDao;
	}


	public IFauneDao getFauneDao() {
		return fauneDao;
	}


	public IFloreDao getFloreDao() {
		return floreDao;
	}


	public IHistoriqueDao getHistoriqueDao() {
		return historiqueDao;
	}


	public IPaiementDao getPaiementDao() {
		return paiementDao;
	}


	public IPanierDao getPanierDao() {
		return panierDao;
	}


	public IProduitDao getProduitDao() {
		return produitDao;
	}


	public IReferentielCaracteristiqueDao getReferentielCaracteristiqueDao() {
		return referentielCaracteristiqueDao;
	}


	public IReferentielFauneDao getReferentielFauneDao() {
		return referentielFauneDao;
	}


	public IReferentielUtilisateurDao getReferentielUtilisateurDao() {
		return referentielUtilisateurDao;
	}


	public ISelectionDao getSelectionDao() {
		return selectionDao;
	}


	public IUtilisateurDao getUtilisateurDao() {
		return utilisateurDao;
	}


	private Application() {

	}


	public static Application getInstance() {

		if (instance == null) {

			instance = new Application();

		}


		return instance;

	}


	public EntityManagerFactory getEmf() {

		return emf;

	}



	public static void setInstance(Application instance) {
		Application.instance = instance;
	}




}

