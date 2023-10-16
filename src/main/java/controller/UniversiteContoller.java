package controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import com.example.spring092023.services.iUniversiteService;

@RestController
@AllArgsConstructor
public class UniversiteContoller {
    private iUniversiteService universiteService;
}
