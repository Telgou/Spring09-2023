package controller;

import com.example.spring092023.services.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.spring092023.services.iReservationService;

@RestController
@AllArgsConstructor
@RequestMapping("/reservations")
public class ReservationController {
    private ReservationService reservationService;
}
