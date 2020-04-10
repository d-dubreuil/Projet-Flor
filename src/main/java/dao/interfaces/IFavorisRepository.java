package dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Favoris;

public interface IFavorisRepository extends JpaRepository<Favoris, Long>{

}
