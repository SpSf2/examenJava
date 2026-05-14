package com.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Facultad> facultades = new ArrayList<Facultad>();
        
        List<Profesor> profesoresIngenieria = Arrays.asList(

                Profesor.builder()
                        .nombre("Laura")
                        .primerApellido("Sanchez")
                        .segundoApellido("Martin")
                        .fechaNacimiento(LocalDate.of(1980, Month.MAY, 10))
                        .totalEstudiantes(120)
                        .dpto(Dpto.INFORMATICA)
                        .fechaInicioFacultad(LocalDate.of(2015, Month.SEPTEMBER, 1))
                        .salario(new BigDecimal("3200"))
                        .build(),

                Profesor.builder()
                        .nombre("Andres")
                        .primerApellido("Ruiz")
                        .segundoApellido("Lopez")
                        .fechaNacimiento(LocalDate.of(1978, Month.MARCH, 22))
                        .totalEstudiantes(95)
                        .dpto(Dpto.INDUSTRIAL)
                        .fechaInicioFacultad(LocalDate.of(2018, Month.FEBRUARY, 12))
                        .salario(new BigDecimal("3400"))
                        .build(),
                        
                Profesor.builder()
                        .nombre("Carlos")
                        .primerApellido("Sanchez")
                        .segundoApellido("Ortiz")
                        .fechaNacimiento(LocalDate.of(1980, Month.APRIL, 2))
                        .totalEstudiantes(85)
                        .dpto(Dpto.MECANICA)
                        .fechaInicioFacultad(LocalDate.of(2010, Month.JANUARY, 19))
                        .salario(new BigDecimal("3700"))
                        .build(),
                         
                Profesor.builder()
                        .nombre("José")
                        .primerApellido("Mtnez")
                        .segundoApellido("Ruiz")
                        .fechaNacimiento(LocalDate.of(1981, Month.OCTOBER, 7))
                        .totalEstudiantes(105)
                        .dpto(Dpto.CIVIL)
                        .fechaInicioFacultad(LocalDate.of(2012, Month.SEPTEMBER, 29))
                        .salario(new BigDecimal("3800"))
                        .build(),
                        
                Profesor.builder()
                        .nombre("Victor")
                        .primerApellido("Machado")
                        .segundoApellido("Cáceres")
                        .fechaNacimiento(LocalDate.of(1972, Month.DECEMBER, 24))
                        .totalEstudiantes(125)
                        .dpto(Dpto.INFORMATICA)
                        .fechaInicioFacultad(LocalDate.of(2002, Month.JULY, 15))
                        .salario(new BigDecimal("4000"))
                        .build()
        );
        
        List<Estudiante> estudiantesIngenieria = Arrays.asList(

                Estudiante.builder()
                        .nombre("Ana")
                        .primerApellido("Lopez")
                        .segundoApellido("Garcia")
                        .fechaNacimiento(LocalDate.of(2002, Month.APRIL, 12))
                        .nombreFacultad("Ingeniería")
                        .totalAsignaturasMatriculadas(8)
                        .fechaAltaFacultad(LocalDate.of(2024, Month.SEPTEMBER, 1))
                        .build(),

                Estudiante.builder()
                        .nombre("Pedro")
                        .primerApellido("Martin")
                        .segundoApellido("Sanchez")
                        .fechaNacimiento(LocalDate.of(2001, Month.AUGUST, 20))
                        .nombreFacultad("Ingeniería")
                        .totalAsignaturasMatriculadas(6)
                        .fechaAltaFacultad(LocalDate.of(2023, Month.SEPTEMBER, 1))
                        .build(),

                Estudiante.builder()
                        .nombre("Lucia")
                        .primerApellido("Navarro")
                        .segundoApellido("Perez")
                        .fechaNacimiento(LocalDate.of(2003, Month.JANUARY, 5))
                        .nombreFacultad("Ingeniería")
                        .totalAsignaturasMatriculadas(10)
                        .fechaAltaFacultad(LocalDate.of(2024, Month.SEPTEMBER, 1))
                        .build()
        );

    }
}
