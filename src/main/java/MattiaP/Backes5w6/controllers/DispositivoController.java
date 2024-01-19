package MattiaP.Backes5w6.controllers;


import MattiaP.Backes5w6.entities.Dipendente;
import MattiaP.Backes5w6.entities.Dispositivo;
import MattiaP.Backes5w6.services.DipendenteService;
import MattiaP.Backes5w6.services.DispositivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/dispositivo")
public class DispositivoController {

    @Autowired
    private DispositivoService dispositivoService;

    @GetMapping
    public List<Dispositivo> getDispositivo(){
        return dispositivoService.getDispositivo();

    }

    @GetMapping("/{dispositivoId}")
    public Dispositivo getDispositivoById(@PathVariable UUID userId) {
        return dispositivoService.findById(userId);

    }

    @PostMapping
    public Dispositivo createDispositivo(@RequestBody Dispositivo newDispositivo) {
        return dispositivoService.save(newDispositivo);

    }

    @PutMapping("/{dispositivoId}")
    public Dispositivo getDispositivoByIdAndUpdate(@PathVariable UUID id, @RequestBody Dispositivo newDispositivo) {
        return dispositivoService.findByIdAndUpdate(id, newDispositivo);

    }

    @DeleteMapping("/{dispositivoId}")
    public void getDispositivoByIdAndDelete(@PathVariable UUID id) {
        dispositivoService.findByIdAndDelete(id);
    }

}
