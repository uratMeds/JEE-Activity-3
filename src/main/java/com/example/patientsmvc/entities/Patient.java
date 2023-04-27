package com.example.patientsmvc.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data                                   //Genere les Getters et Setters
@AllArgsConstructor @NoArgsConstructor @Builder  //Genere constructeur avec parametres et constructeur sans parametres

public class Patient {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(min = 4, max = 20)
    private String nom;

    @Temporal(TemporalType.DATE)       //Pour garder la date en format Date
    private Date dateNaissance;

    private boolean malade;

    @Min(10)
    private int score;

}
