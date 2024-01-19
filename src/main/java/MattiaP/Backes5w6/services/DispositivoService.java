package MattiaP.Backes5w6.services;

import MattiaP.Backes5w6.dao.DipendenteDao;
import MattiaP.Backes5w6.dao.DispositivoDao;
import MattiaP.Backes5w6.entities.Dipendente;
import MattiaP.Backes5w6.entities.Dispositivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DispositivoService {

    @Autowired
    private DispositivoDao dispositivoDao;

    public List<Dispositivo> getDispositivo(){
        return dispositivoDao.findAll();
    }

    public Dispositivo findById(UUID id){
        return dispositivoDao.findById(id).orElseThrow(null);
    }

    public void findByIdAndDelete(UUID id){
        Dispositivo found = this.findById(id);
        dispositivoDao.delete(found);
    }

    public Dispositivo save(Dispositivo body){
        Dispositivo newDispositivo = new Dispositivo();
        newDispositivo.setAvailable(body.getAvailable());
        newDispositivo.setType(body.getType());
        newDispositivo.setDipendente(body.getDipendente());
        return dispositivoDao.save(newDispositivo);

    }

    public Dispositivo findByIdAndUpdate(UUID id, Dispositivo body){
        Dispositivo found = this.findById(id);

        return dispositivoDao.save(found);
    }

}