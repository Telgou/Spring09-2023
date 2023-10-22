package controller;

import com.example.spring092023.services.ChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@AllArgsConstructor
@RequestMapping("/chambres")
public class ChambreController {

    private ChambreService chambreService;
}
