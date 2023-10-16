package controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import com.example.spring092023.repositories.BlocRepository;
@RestController
@AllArgsConstructor
public class BlocController {
    private BlocRepository blocService;
}
