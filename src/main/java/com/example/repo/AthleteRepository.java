package com.example.repo;

import com.example.domain.Athlete;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AthleteRepository extends JpaRepository<Athlete, Long>
{
}
