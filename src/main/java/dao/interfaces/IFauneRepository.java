package dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Faune;


public interface IFauneRepository extends JpaRepository<Faune, Long>{

	Faune findByNomFaune(String nomFaune);
}
