package com.example;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class Profesor extends Persona implements Comparable<Profesor> {

    private int totalEstudiantes;
    private Dpto dpto;
    private LocalDate fechaInicioFacultad;
    private BigDecimal salario;

    @Override
    public int compareTo(Profesor otro) {
        int comparacionSalario = this.salario.compareTo(otro.salario);

        if (comparacionSalario != 0) {
            return comparacionSalario;
        }

        return this.fechaInicioFacultad.compareTo(otro.fechaInicioFacultad);
    }
}