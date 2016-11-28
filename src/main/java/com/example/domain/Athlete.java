package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Athlete
{
    @Id
    private Long athleteId;

    private String name;

    private Double totalDistance;

    public Long getAthleteId()
    {
        return athleteId;
    }

    public void setAthleteId(Long athleteId)
    {
        this.athleteId = athleteId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Double getTotalDistance()
    {
        return totalDistance;
    }

    public void setTotalDistance(Double totalDistance)
    {
        this.totalDistance = totalDistance;
    }
}
