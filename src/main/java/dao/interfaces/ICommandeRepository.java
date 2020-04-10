package dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Commande;

public interface ICommandeRepository extends JpaRepository<Commande, Long>{

}
