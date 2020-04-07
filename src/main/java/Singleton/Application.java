package Singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import DAO.JPA.PaiementDaoJpa;
import DAO.interfaces.IPaiementDao;





public class Application {

	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("vol");

	private final IAeroportDao aeroportDao = new AeroportDaoJpa();



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

