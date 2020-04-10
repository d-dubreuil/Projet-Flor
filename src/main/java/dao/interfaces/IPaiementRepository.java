package dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Paiement;

public interface IPaiementRepository extends JpaRepository<Paiement, Long>{

}
