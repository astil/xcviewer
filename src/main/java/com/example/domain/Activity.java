package com.example.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Activity
{
    @Id
    private Long activityId;

    private String type;

    private Double distance;

    private Date date;

    @ManyToOne(fetch= FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name="athlete", referencedColumnName="ATHLETEID")
    Athlete athlete;

    public Athlete getAthlete()
    {
        return athlete;
    }

    public void setAthlete(Athlete athlete)
    {
        this.athlete = athlete;
    }

    public Long getActivityId()
    {
        return activityId;
    }

    public void setActivityId(Long activityId)
    {
        this.activityId = activityId;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public Double getDistance()
    {
        return distance;
    }

    public void setDistance(Double distance)
    {
        this.distance = distance;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }
}
