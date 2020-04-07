package DAO.JPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import DAO.interfaces.IReferentielCaracteristiqueDao;
import model.ReferentielCaracteristique;
import singleton.Application;

public class ReferentielCaracteristiqueDaoJpa implements IReferentielCaracteristiqueDao{

	@Override
	public List<ReferentielCaracteristique> findAll() {
		List<ReferentielCaracteristique> referentielCaracteristiques = null;

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			TypedQuery<ReferentielCaracteristique> query = em.createQuery("from ReferentielCaracteristique", ReferentielCaracteristique.class);

			referentielCaracteristiques = query.getResultList();

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

		return referentielCaracteristiques;
	}

	@Override
	public ReferentielCaracteristique find(Long id) {
		ReferentielCaracteristique referentielCaracteristique = null;

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			referentielCaracteristique = em.find(ReferentielCaracteristique.class, id);

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

		return referentielCaracteristique;
	}

	@Override
	public ReferentielCaracteristique save(ReferentielCaracteristique obj) {
		ReferentielCaracteristique referentielCaracteristique = null;

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			referentielCaracteristique = em.merge(obj);

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

		return referentielCaracteristique;
	}

	@Override
	public void delete(ReferentielCaracteristique obj) {
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
