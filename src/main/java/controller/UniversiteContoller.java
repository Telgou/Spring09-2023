package controller;

import com.example.spring092023.entities.Universite;
import com.example.spring092023.services.UniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universites")
public class UniversiteContoller {
    private final UniversiteService universiteService;

    @GetMapping("/")
    public List<Universite> getAllUniversites() {
        return universiteService.retrieveAllUniversites();
    }

    @GetMapping("/{id}")
    public Universite getUniversiteById(@PathVariable Long id) {
        return universiteService.retrieveUniversites(id);
    }

    @PostMapping("/")
    public Universite addUniversite(@RequestBody Universite universite) {
        return universiteService.addUniversites(universite);
    }

    @PutMapping("/")
    public Universite updateUniversite( @RequestBody Universite universite) {
        return universiteService.updateUniversites(universite);
    }

    @DeleteMapping("/{id}")
    public void deleteUniversite(@PathVariable Long id) {
        universiteService.removeUniversites(id);
    }
}
