package dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Conseil;

public interface IConseilRepository extends JpaRepository<Conseil, Long>{

}
