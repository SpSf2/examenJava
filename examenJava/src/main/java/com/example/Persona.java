package com.example;

import java.time.LocalDate;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;


@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
public class Persona {

    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private LocalDate fechaNacimiento;

    @Override
    public String toString() {
        return nombre + " " + primerApellido + " " + segundoApellido
                + " | Nacimiento: " + fechaNacimiento;
    }
}