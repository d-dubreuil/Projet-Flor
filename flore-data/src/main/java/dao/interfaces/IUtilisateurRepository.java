package dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Utilisateur;

public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long>{

}
