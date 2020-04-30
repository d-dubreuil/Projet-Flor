package dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.Caracteristique;
import model.TypeCarac;

public interface ICaracteristiqueRepository extends JpaRepository<Caracteristique, Long>{
	@Query ("select c from Caracteristique c where c.typeCarac = :type and c.nom = :nom and c.valeur = :valeur")
	Caracteristique findByAttribut (@Param("type")TypeCarac typeCarac, @Param("nom") String nom, @Param("valeur") String valeur );
	
	@Query ("select c from Caracteristique c join c.referentielCaracteristiques rc join rc.flore fl where fl.nom = :nom")
	List<Caracteristique> findByFlore (@Param ("nom") String nom);
	
	@Query ("select c from Caracteristique c where c.typeCarac = :type")
	Caracteristique findByType (@Param ("type") TypeCarac typeCarac);
}