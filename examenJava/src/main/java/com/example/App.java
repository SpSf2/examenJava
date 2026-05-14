package com.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
    	
    	/* 1. Crear una lista de facultades, considerando que un estudiante solo se puede matricular en una facultad 
    	 * y que un profesor solo puede trabajar en una facultad. */


        List<Facultad> facultades = new ArrayList<Facultad>(); //Esta será la lista de Facultades
        
        // FACULTAD INGENIERIA
        List<Profesor> profesoresIngenieria = Arrays.asList( // Esta será la lista de Prof. Ingeniería

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
        
        List<Estudiante> estudiantesIngenieria = Arrays.asList( // Esta será la lista De Est. de Ingeniería

                Estudiante.builder()
                        .nombre("Ana")
                        .primerApellido("Lopez")
                        .segundoApellido("Garcia")
                        .fechaNacimiento(LocalDate.of(2002, Month.APRIL, 12))
                        .nombreFacultad("Ingeniería")
                        .totalAsignaturasMatriculadas(8)
                        .fechaAltaFacultad(LocalDate.of(2024, Month.AUGUST, 1))
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
                        .fechaAltaFacultad(LocalDate.of(2024, Month.MARCH, 1))
                        .build(),
                        
                Estudiante.builder()
                        .nombre("Lisa")
                        .primerApellido("Ramirez")
                        .segundoApellido("Contreras")
                        .fechaNacimiento(LocalDate.of(2005, Month.FEBRUARY, 11))
                        .nombreFacultad("Ingeniería")
                        .totalAsignaturasMatriculadas(7)
                        .fechaAltaFacultad(LocalDate.of(2023, Month.JUNE, 14))
                        .build(),

                Estudiante.builder()
                        .nombre("Pablo")
                        .primerApellido("Gil")
                        .segundoApellido("Hernandez")
                        .fechaNacimiento(LocalDate.of(2000, Month.AUGUST, 26))
                        .nombreFacultad("Ingeniería")
                        .totalAsignaturasMatriculadas(6)
                        .fechaAltaFacultad(LocalDate.of(2022, Month.NOVEMBER, 1))
                        .build(),

                Estudiante.builder()
                        .nombre("Cristina")
                        .primerApellido("Sierra")
                        .segundoApellido("Luján")
                        .fechaNacimiento(LocalDate.of(2005, Month.MAY, 24))
                        .nombreFacultad("Ingeniería")
                        .totalAsignaturasMatriculadas(10)
                        .fechaAltaFacultad(LocalDate.of(2025, Month.MAY, 15))
                        .build()
        );

        
        Facultad facultad1 = Facultad.builder() // aqui agregamos los listados a la facultad
                .nombre("Ingeniería")
                .profesores(profesoresIngenieria)
                .estudiantes(estudiantesIngenieria)
                .build();

        facultades.add(facultad1);
        
        // FACULTAD CIENCIAS
        
        List<Profesor> profesoresCiencias = Arrays.asList( // Esta será la lista de Prof. de Ciencias

                Profesor.builder()
                        .nombre("Marina")
                        .primerApellido("Suarez")
                        .segundoApellido("Lopez")
                        .fechaNacimiento(LocalDate.of(1979, Month.JUNE, 18))
                        .totalEstudiantes(90)
                        .dpto(Dpto.MATEMATICAS)
                        .fechaInicioFacultad(LocalDate.of(2011, Month.SEPTEMBER, 5))
                        .salario(new BigDecimal("3300"))
                        .build(),

                Profesor.builder()
                        .nombre("Ricardo")
                        .primerApellido("Mendez")
                        .segundoApellido("Torres")
                        .fechaNacimiento(LocalDate.of(1983, Month.FEBRUARY, 9))
                        .totalEstudiantes(100)
                        .dpto(Dpto.FISICA)
                        .fechaInicioFacultad(LocalDate.of(2014, Month.JANUARY, 20))
                        .salario(new BigDecimal("3600"))
                        .build(),

                Profesor.builder()
                        .nombre("Elena")
                        .primerApellido("Castro")
                        .segundoApellido("Vega")
                        .fechaNacimiento(LocalDate.of(1976, Month.NOVEMBER, 30))
                        .totalEstudiantes(88)
                        .dpto(Dpto.QUIMICA)
                        .fechaInicioFacultad(LocalDate.of(2008, Month.MARCH, 12))
                        .salario(new BigDecimal("3900"))
                        .build(),

                Profesor.builder()
                        .nombre("Daniel")
                        .primerApellido("Ortega")
                        .segundoApellido("Ruiz")
                        .fechaNacimiento(LocalDate.of(1985, Month.AUGUST, 14))
                        .totalEstudiantes(110)
                        .dpto(Dpto.BIOLOGIA)
                        .fechaInicioFacultad(LocalDate.of(2017, Month.OCTOBER, 2))
                        .salario(new BigDecimal("3100"))
                        .build()
        );
        
        List<Estudiante> estudiantesCiencias = Arrays.asList(// Esta será la lista de Est. de Ciencias

                Estudiante.builder()
                        .nombre("Sonia")
                        .primerApellido("Gil")
                        .segundoApellido("Moreno")
                        .fechaNacimiento(LocalDate.of(2002, Month.MARCH, 3))
                        .nombreFacultad("Ciencias")
                        .totalAsignaturasMatriculadas(9)
                        .fechaAltaFacultad(LocalDate.of(2024, Month.FEBRUARY, 15))
                        .build(),

                Estudiante.builder()
                        .nombre("Raul")
                        .primerApellido("Herrera")
                        .segundoApellido("Navarro")
                        .fechaNacimiento(LocalDate.of(2001, Month.JULY, 19))
                        .nombreFacultad("Ciencias")
                        .totalAsignaturasMatriculadas(5)
                        .fechaAltaFacultad(LocalDate.of(2023, Month.JANUARY, 18))
                        .build(),

                Estudiante.builder()
                        .nombre("Irene")
                        .primerApellido("Dominguez")
                        .segundoApellido("Santos")
                        .fechaNacimiento(LocalDate.of(2003, Month.JANUARY, 27))
                        .nombreFacultad("Ciencias")
                        .totalAsignaturasMatriculadas(8)
                        .fechaAltaFacultad(LocalDate.of(2024, Month.SEPTEMBER, 11))
                        .build(),

                Estudiante.builder()
                        .nombre("Tomas")
                        .primerApellido("Prieto")
                        .segundoApellido("Lara")
                        .fechaNacimiento(LocalDate.of(2000, Month.DECEMBER, 10))
                        .nombreFacultad("Ciencias")
                        .totalAsignaturasMatriculadas(6)
                        .fechaAltaFacultad(LocalDate.of(2022, Month.OCTOBER, 21))
                        .build()
        );
        
        Facultad facultad2 = Facultad.builder()// Agregamos las listas a la facultad
                .nombre("Ciencias")
                .profesores(profesoresCiencias)
                .estudiantes(estudiantesCiencias)
                .build();

        facultades.add(facultad2);
        
        // FACULTAD DE HUMANIDADES
        
        List<Profesor> profesoresHumanidades = Arrays.asList(  // Esta será la lista de Prof. de Humanidades

                Profesor.builder()
                        .nombre("Beatriz")
                        .primerApellido("Romero")
                        .segundoApellido("Santos")
                        .fechaNacimiento(LocalDate.of(1977, Month.APRIL, 8))
                        .totalEstudiantes(92)
                        .dpto(Dpto.ECONOMIA)
                        .fechaInicioFacultad(LocalDate.of(2009, Month.SEPTEMBER, 14))
                        .salario(new BigDecimal("3500"))
                        .build(),

                Profesor.builder()
                        .nombre("Fernando")
                        .primerApellido("Lozano")
                        .segundoApellido("Gil")
                        .fechaNacimiento(LocalDate.of(1980, Month.JULY, 21))
                        .totalEstudiantes(87)
                        .dpto(Dpto.DERECHO)
                        .fechaInicioFacultad(LocalDate.of(2013, Month.FEBRUARY, 11))
                        .salario(new BigDecimal("3400"))
                        .build(),

                Profesor.builder()
                        .nombre("Patricia")
                        .primerApellido("Mora")
                        .segundoApellido("Herrera")
                        .fechaNacimiento(LocalDate.of(1982, Month.JANUARY, 16))
                        .totalEstudiantes(98)
                        .dpto(Dpto.CIENCIAS_POLITICAS)
                        .fechaInicioFacultad(LocalDate.of(2016, Month.OCTOBER, 6))
                        .salario(new BigDecimal("3300"))
                        .build(),

                Profesor.builder()
                        .nombre("Alberto")
                        .primerApellido("Vega")
                        .segundoApellido("Navarro")
                        .fechaNacimiento(LocalDate.of(1975, Month.DECEMBER, 2))
                        .totalEstudiantes(80)
                        .dpto(Dpto.LABORAL)
                        .fechaInicioFacultad(LocalDate.of(2007, Month.MARCH, 19))
                        .salario(new BigDecimal("3600"))
                        .build()
        );
        
        List<Estudiante> estudiantesHumanidades = Arrays.asList( // Esta será la lista de Est. de Humanidades

                Estudiante.builder()
                        .nombre("Nuria")
                        .primerApellido("Campos")
                        .segundoApellido("Lopez")
                        .fechaNacimiento(LocalDate.of(2002, Month.FEBRUARY, 17))
                        .nombreFacultad("Humanidades")
                        .totalAsignaturasMatriculadas(7)
                        .fechaAltaFacultad(LocalDate.of(2024, Month.JUNE, 1))
                        .build(),

                Estudiante.builder()
                        .nombre("Adrian")
                        .primerApellido("Reyes")
                        .segundoApellido("Martinez")
                        .fechaNacimiento(LocalDate.of(2001, Month.JUNE, 9))
                        .nombreFacultad("Humanidades")
                        .totalAsignaturasMatriculadas(6)
                        .fechaAltaFacultad(LocalDate.of(2023, Month.JANUARY, 15))
                        .build(),

                Estudiante.builder()
                        .nombre("Paula")
                        .primerApellido("Iglesias")
                        .segundoApellido("Serrano")
                        .fechaNacimiento(LocalDate.of(2003, Month.MARCH, 28))
                        .nombreFacultad("Humanidades")
                        .totalAsignaturasMatriculadas(9)
                        .fechaAltaFacultad(LocalDate.of(2024, Month.DECEMBER, 1))
                        .build(),

                Estudiante.builder()
                        .nombre("Hector")
                        .primerApellido("Medina")
                        .segundoApellido("Ortega")
                        .fechaNacimiento(LocalDate.of(2000, Month.NOVEMBER, 4))
                        .nombreFacultad("Humanidades")
                        .totalAsignaturasMatriculadas(5)
                        .fechaAltaFacultad(LocalDate.of(2022, Month.MAY, 15))
                        .build()
        );
        
        Facultad facultad3 = Facultad.builder()// Agregamos las lista a la facultad
                .nombre("Humanidades")
                .profesores(profesoresHumanidades)
                .estudiantes(estudiantesHumanidades)
                .build();

        facultades.add(facultad3);
        
        System.out.println("Listado de facultades:");
        facultades.forEach(System.out::println);
        
       // 2. Recorrer la lista de facultades y crear una nueva colección que agrupe estudiantes por facultad.

        Map<String, List<Estudiante>> estudiantesPorFacultad = facultades.stream()
                .flatMap(facultad -> facultad.getEstudiantes().stream())
                .collect(Collectors.groupingBy(Estudiante::getNombreFacultad));

        System.out.println("\nEstudiantes por facultad:");
        estudiantesPorFacultad.forEach((facultad, listaEstudiantes) -> {
            System.out.println("\nFacultad: " + facultad);
            listaEstudiantes.forEach(System.out::println);
        });
        
        // Punto 3.  Agrupar profesores por facultad y por departamento.
        
   
    }
}
