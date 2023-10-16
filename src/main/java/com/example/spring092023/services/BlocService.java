package com.example.spring092023.services;

import com.example.spring092023.repositories.Blocrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlocService {
    @Autowired
    Blocrepo blocrepo;
}
