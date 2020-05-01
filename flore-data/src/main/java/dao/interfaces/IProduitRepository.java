package dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Produit;

public interface IProduitRepository extends JpaRepository<Produit, Long>{

}
