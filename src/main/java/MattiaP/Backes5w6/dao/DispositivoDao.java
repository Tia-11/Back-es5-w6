package MattiaP.Backes5w6.dao;

import MattiaP.Backes5w6.entities.Dispositivo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DispositivoDao extends JpaRepository<Dispositivo, UUID>{

}
