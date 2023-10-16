package controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import com.example.spring092023.services.iEtudiantService;

@RestController
@AllArgsConstructor
public class EtudiantController {
    private iEtudiantService etudiantService;

}
