package com.example.visao.models;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200, nullable = false)
    private String descricao;

    @Column(nullable = false)
    private int cargaHoraria;

    @Column(length = 200, nullable = false)
    private String objetivos;

    @Column(length = 200, nullable = false)
    private String ementa;

    @ManyToMany
    private List<Professor> professor;

    @OneToMany(mappedBy = "curso")
    List<Agenda> agenda;
    
}
