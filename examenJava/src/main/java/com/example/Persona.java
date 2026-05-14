package com.example;

import java.time.LocalDate;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;


@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Persona {

    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private LocalDate fechaNacimiento;

        @Override
        public String toString() {
            return "Persona [nombre=" + nombre + ", primerApellido=" + primerApellido
                    + ", segundoApellido=" + segundoApellido + ", fechaNacimiento=" + fechaNacimiento + "]";
        
    }
}