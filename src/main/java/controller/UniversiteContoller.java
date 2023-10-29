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
    private iUniversiteService universiteService;
}
