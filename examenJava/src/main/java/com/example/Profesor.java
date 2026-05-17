package com.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
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
    @Override
    public String toString() {
        return getNombre() + " " + getPrimerApellido() + " " + getSegundoApellido()
                + " | Dpto: " + dpto
                + " | Salario: " + salario
                + " | Inicio: " + fechaInicioFacultad;
    }
}