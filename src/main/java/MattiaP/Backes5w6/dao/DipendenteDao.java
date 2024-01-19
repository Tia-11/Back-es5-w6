package MattiaP.Backes5w6.dao;

import MattiaP.Backes5w6.entities.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DipendenteDao extends JpaRepository<Dipendente, UUID> {
}
