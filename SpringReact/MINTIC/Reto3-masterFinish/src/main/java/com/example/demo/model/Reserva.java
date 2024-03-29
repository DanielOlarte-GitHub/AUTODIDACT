package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;


import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "reservation")
public class Reserva implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;
    private Date startDate;
    private Date devolutionDate;
    private String status="created";
    @ManyToOne
    @JoinColumn(name = "id")
        @JsonIgnoreProperties({"reservations"})
        private Bicicleta bike;
    @ManyToOne
    @JoinColumn(name="idClient")
    @JsonIgnoreProperties({"reservations","messages"})
    private usuario client;
    private Integer score;



    public Integer getIdReservation() {
        return idReservation;
    }
    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }
    public usuario getClient() {
        return client;
    }
    public void setClient(usuario client) {
        this.client = client;
    }
    public Bicicleta getBike() {
        return bike;
    }
    public void setBike(Bicicleta bike) {
        this.bike = bike;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getDevolutionDate() {
        return devolutionDate;
    }
    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Integer getScore() {
        return score;
    }
    public void setScore(Integer score) {
        this.score = score;
    }
    
}
