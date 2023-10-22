package controller;

import com.example.spring092023.services.BlocService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@AllArgsConstructor
@RequestMapping("/blocs")
public class BlocController {
    private BlocService blocService;
}
