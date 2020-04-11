package dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Faune;


public interface IFauneRepository extends JpaRepository<Faune, Long>{

	List <Faune> findByNomFaune(String nomFaune);
}
