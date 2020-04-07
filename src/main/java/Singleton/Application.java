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
import DAO.interfaces.ICaracteristiqueDao;
import DAO.interfaces.ICommandeDao;
import DAO.interfaces.ICompteUtilisateurDao;
import DAO.interfaces.IConseilDao;
import DAO.interfaces.IFauneDao;
import DAO.interfaces.IFloreDao;
import DAO.interfaces.IHistoriqueDao;
import DAO.interfaces.IPaiementDao;
import DAO.interfaces.IPanierDao;





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

	private final IPanierDao panierDao = new CaracteristiqueDaoJpa();

	private final ICaracteristiqueDao aeroportDao = new CaracteristiqueDaoJpa();

	private final ICaracteristiqueDao aeroportDao = new CaracteristiqueDaoJpa();

	private final ICaracteristiqueDao aeroportDao = new CaracteristiqueDaoJpa();

	private final ICaracteristiqueDao aeroportDao = new CaracteristiqueDaoJpa();

	private final ICaracteristiqueDao aeroportDao = new CaracteristiqueDaoJpa();

	private final ICaracteristiqueDao aeroportDao = new CaracteristiqueDaoJpa();




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

