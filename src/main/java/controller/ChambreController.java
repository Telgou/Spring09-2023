package controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import com.example.spring092023.services.iChambreService;
@RestController
@AllArgsConstructor
public class ChambreController {

    private iChambreService chambreService;
}
