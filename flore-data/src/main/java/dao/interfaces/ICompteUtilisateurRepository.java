package dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import model.CompteUtilisateur;

public interface ICompteUtilisateurRepository extends JpaRepository<CompteUtilisateur, Long> {

}
