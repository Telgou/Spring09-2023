package com.example.spring092023.repositories;

import com.example.spring092023.entities.Bloc;
import com.example.spring092023.entities.Chambre;
import com.example.spring092023.entities.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface UniversiteRepository {

Set<Bloc> findByFoyeridFoyer();


}
