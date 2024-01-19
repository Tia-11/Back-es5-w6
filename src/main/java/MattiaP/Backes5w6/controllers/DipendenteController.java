package MattiaP.Backes5w6.controllers;

import MattiaP.Backes5w6.entities.Dipendente;
import MattiaP.Backes5w6.services.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/dipendente")
public class DipendenteController {

    @Autowired
    private DipendenteService dipendenteService;

    @GetMapping
    public List<Dipendente> getDipendente(){
        return dipendenteService.getDipendente();

    }

    @GetMapping("/{dipendenreId}")
    public Dipendente getDipendenteById(@PathVariable UUID userId) {
        return dipendenteService.findById(userId);

    }

    @PostMapping
    public Dipendente createDipendente(@RequestBody Dipendente newDipendente) {
        return dipendenteService.save(newDipendente);

    }

    @PutMapping("/{dipendenreId}")
    public Dipendente getDipendenteByIdAndUpdate(@PathVariable UUID id, @RequestBody Dipendente body) {
        return dipendenteService.findByIdAndUpdate(id, body);

    }

     @DeleteMapping("/{dipendenreId}")
    public void getDipendenteByIdAndDelete(@PathVariable UUID id) {
     dipendenteService.findByIdAndDelete(id);
     }

}
