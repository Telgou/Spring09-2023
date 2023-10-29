package controller;

import com.example.spring092023.entities.Bloc;
import com.example.spring092023.services.ChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/chambres")
public class ChambreController {
    private ChambreService chambreService;

    @PostMapping("/setchambres/{nombloc}")
    public Bloc setchambres(@PathVariable("nombloc") String nombloc, @RequestBody Map<String, List<Long>> requestBody) {
        List<Long> numchambre = requestBody.get("numchambre");
        return chambreService.affecterChambresABloc(numchambre,nombloc);
    }

}
