package controller;

import com.example.spring092023.entities.Bloc;
import com.example.spring092023.services.ChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import com.example.spring092023.services.iChambreService;
@RestController
@AllArgsConstructor
@RequestMapping("/chambres")
public class ChambreController {

    private iChambreService chambreService;
}
