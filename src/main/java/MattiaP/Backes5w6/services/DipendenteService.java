package MattiaP.Backes5w6.services;

import MattiaP.Backes5w6.dao.DipendenteDao;
import MattiaP.Backes5w6.entities.Dipendente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DipendenteService {

    @Autowired
    private DipendenteDao dipendenteDao;

    public List<Dipendente> getDipendente(){
        return dipendenteDao.findAll();
    }

    public Dipendente findById(UUID id){
        return dipendenteDao.findById(id).orElseThrow(null);
    }

    public void findByIdAndDelete(UUID id){
        Dipendente found = this.findById(id);
        dipendenteDao.delete(found);
    }

    public Dipendente save(Dipendente body){
        Dipendente newDipendente = new Dipendente();
        newDipendente.setUsername(body.getUsername());
        newDipendente.setName(body.getName());
        newDipendente.setSurname(body.getSurname());
        newDipendente.setEmail(body.getEmail());
        return dipendenteDao.save(newDipendente);

    }

    public Dipendente findByIdAndUpdate(UUID id, Dipendente body){
        Dipendente found = this.findById(id);
        found.setUsername(body.getUsername());
        found.setName(body.getName());
        found.setSurname(body.getSurname());
        found.setEmail(body.getEmail());
        found.setDispositivi(body.getDispositivi());
        return dipendenteDao.save(found);
    }

}


