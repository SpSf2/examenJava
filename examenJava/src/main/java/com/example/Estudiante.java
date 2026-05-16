package com.example;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)

public class Estudiante extends Persona implements Comparable<Estudiante> {

    private String nombreFacultad;
    private int totalAsignaturasMatriculadas;
    private LocalDate fechaAltaFacultad;

    @Override
    public int compareTo(Estudiante otro) {
        return Integer.compare(this.totalAsignaturasMatriculadas, otro.totalAsignaturasMatriculadas);
    }
}