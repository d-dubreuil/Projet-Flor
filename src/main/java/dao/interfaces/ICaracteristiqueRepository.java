package dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Caracteristique;

public interface ICaracteristiqueRepository extends JpaRepository<Caracteristique, Long>{

}
