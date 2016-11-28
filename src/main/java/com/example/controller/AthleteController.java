package com.example.controller;

import java.util.List;

import com.example.domain.Athlete;
import com.example.repo.AthleteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AthleteController {

    @Autowired
    private AthleteRepository athleteRepository;

    @RequestMapping("/athletes")
    public List<Athlete> greeting() {
        return athleteRepository.findAll();
    }
}