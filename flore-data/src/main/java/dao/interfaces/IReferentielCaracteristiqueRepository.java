package dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.Flore;
import model.ReferentielCaracteristique;

public interface IReferentielCaracteristiqueRepository extends JpaRepository<ReferentielCaracteristique, Long>{


}
