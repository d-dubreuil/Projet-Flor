package singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.interfaces.ICaracteristiqueDao;
import dao.interfaces.ICommandeDao;
import dao.interfaces.ICompteUtilisateurDao;
import dao.interfaces.IConseilDao;
import dao.interfaces.IFauneDao;
import dao.interfaces.IFavorisDao;
import dao.interfaces.IFloreDao;
import dao.interfaces.IHistoriqueDao;
import dao.interfaces.IJardinDao;
import dao.interfaces.IPaiementDao;
import dao.interfaces.IPanierDao;
import dao.interfaces.IProduitDao;
import dao.interfaces.IReferentielCaracteristiqueDao;
import dao.interfaces.IReferentielFauneDao;
import dao.interfaces.IReferentielUtilisateurDao;
import dao.interfaces.ISelectionDao;
import dao.interfaces.IUtilisateurDao;
import dao.jpa.CaracteristiqueDaoJpa;
import dao.jpa.CommandeDaoJpa;
import dao.jpa.CompteUtilisateurDaoJpa;
import dao.jpa.ConseilDaoJpa;
import dao.jpa.FauneDaoJpa;
import dao.jpa.FavorisDaoJpa;
import dao.jpa.FloreDaoJpa;
import dao.jpa.HistoriqueDaoJpa;
import dao.jpa.JardinDaoJpa;
import dao.jpa.PaiementDaoJpa;
import dao.jpa.PanierDaoJpa;
import dao.jpa.ProduitDaoJpa;
import dao.jpa.ReferentielCaracteristiqueDaoJpa;
import dao.jpa.ReferentielFauneDaoJpa;
import dao.jpa.ReferentielUtilisateurDaoJpa;
import dao.jpa.SelectionDaoJpa;
import dao.jpa.UtilisateurDaoJpa;

public class Application {

	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("flore");

	private final ICaracteristiqueDao caracteristiqueDao = new CaracteristiqueDaoJpa();

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

	private final IFavorisDao favorisDao = new FavorisDaoJpa();

	private final IJardinDao jardinDao = new JardinDaoJpa();

	public ICaracteristiqueDao getCaracteristiqueDao() {
		return caracteristiqueDao;
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

	public IFavorisDao getFavorisDao() {
		return favorisDao;
	}

	public IJardinDao getJardinDao() {
		return jardinDao;
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
