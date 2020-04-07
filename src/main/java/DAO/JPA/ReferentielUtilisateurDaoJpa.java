package DAO.JPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import DAO.interfaces.IReferentielUtilisateurDao;
import Singleton.Application;
import model.ReferentielUtilisateur;

public class ReferentielUtilisateurDaoJpa implements IReferentielUtilisateurDao{

	@Override
	public List<ReferentielUtilisateur> findAll() {
		List<ReferentielUtilisateur> referentielUtilisateurs = null;

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			TypedQuery<ReferentielUtilisateur> query = em.createQuery("from ReferentielUtilisateur", ReferentielUtilisateur.class);

			referentielUtilisateurs = query.getResultList();

			tx.commit();
		} catch (Exception e) {
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}

		return referentielUtilisateurs;
	}

	@Override
	public ReferentielUtilisateur find(Long id) {
		ReferentielUtilisateur referentielUtilisateur = null;

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			referentielUtilisateur = em.find(ReferentielUtilisateur.class, id);

			tx.commit();
		} catch (Exception e) {
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}

		return referentielUtilisateur;
	}

	@Override
	public ReferentielUtilisateur save(ReferentielUtilisateur obj) {
		ReferentielUtilisateur referentielUtilisateur = null;

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			referentielUtilisateur = em.merge(obj);

			tx.commit();
		} catch (Exception e) {
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}

		return referentielUtilisateur;
	}

	@Override
	public void delete(ReferentielUtilisateur obj) {
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			em.remove(em.merge(obj));

			tx.commit();
		} catch (Exception e) {
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}

}
