package dao.interfaces;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.Flore;

public interface IFloreRepository extends JpaRepository<Flore, Long> {
	@Query("from Flore fl where fl.nom = :nom")
//	List<Flore> findByNom(@Param("nom") String nom);
	Flore findByNom(@Param("nom") String nom);
}
