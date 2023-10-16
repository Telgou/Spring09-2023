package com.example.spring092023.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spring092023.entities.*;

public interface ReservationRespository extends JpaRepository<Reservation,Long> {
}
