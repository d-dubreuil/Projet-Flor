package dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.Conseil;

public interface IConseilRepository extends JpaRepository<Conseil, Long>{
	@Query ("select c from Conseil c where c.theme = :theme")
	Conseil findByTheme (@Param ("theme") String theme);
	
	@Query ("select c.nom from Conseil c")
	String findName ();
}
