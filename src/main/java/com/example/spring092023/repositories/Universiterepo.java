package com.example.spring092023.repositories;

import com.example.spring092023.entities.Bloc;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class Universiterepo implements UniversiteRepository {
    @Override
    public Set<Bloc> findByFoyeridFoyer() {
        return null;
    }
}
