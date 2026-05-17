package com.example;

import java.util.List;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Facultad {

    private String nombre;
    private List<Profesor> profesores;
    private List<Estudiante> estudiantes;

    @Override
    public String toString() {
        return "Facultad: " + nombre
                + " | Profesores: " + profesores.size()
                + " | Estudiantes: " + estudiantes.size();
    }
}