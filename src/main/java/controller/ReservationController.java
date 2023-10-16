package controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import com.example.spring092023.services.iReservationService;

@RestController
@AllArgsConstructor
public class ReservationController {
    private iReservationService reservationService;
}
