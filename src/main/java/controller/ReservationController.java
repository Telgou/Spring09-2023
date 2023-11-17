package controller;

import com.example.spring092023.entities.Reservation;
import com.example.spring092023.entities.Universite;
import com.example.spring092023.services.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import com.example.spring092023.services.iReservationService;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservations")
public class ReservationController {
    private ReservationService reservationService;

    @GetMapping("/byyear")
    public List<Reservation> getReservationParAnneeUniversitaire(@RequestParam(name = "dateDebut") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateDebut,
                                                                 @RequestParam(name = "dateFin") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateFin) {
        return reservationService.getReservationParAnneeUniversitaire(dateDebut, dateFin);
    }

    @PutMapping("/update")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

}
