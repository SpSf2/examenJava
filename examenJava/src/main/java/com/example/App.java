package com.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
    	
    	System.out.println("**********           GESTION DE MATRICULAS EN UNA UNIVERSIDAD FICTICIA          **********\n");
    	
    	/* 1. Crear una lista de facultades, considerando que un estudiante solo se puede matricular en una facultad 
    	 * y que un profesor solo puede trabajar en una facultad. */


        List<Facultad> facultades = new ArrayList<Facultad>(); //Esta será la lista de Facultades
        
        // FACULTAD INGENIERIA
        List<Profesor> profesoresIngenieria = Arrays.asList( // Esta será la lista de Prof. Ingeniería

                Profesor.builder()
                        .nombre("Laura")
                        .primerApellido("Sánchez")
                        .segundoApellido("Martín")
                        .fechaNacimiento(LocalDate.of(1980, Month.MAY, 10))
                        .totalEstudiantes(120)
                        .dpto(Dpto.INFORMATICA)
                        .fechaInicioFacultad(LocalDate.of(2026, Month.MAY, 29))
                        .salario(new BigDecimal("3200"))
                        .build(),

                Profesor.builder()
                        .nombre("Andrés")
                        .primerApellido("Ruíz")
                        .segundoApellido("López")
                        .fechaNacimiento(LocalDate.of(1978, Month.MARCH, 22))
                        .totalEstudiantes(95)
                        .dpto(Dpto.INDUSTRIAL)
                        .fechaInicioFacultad(LocalDate.of(2018, Month.FEBRUARY, 12))
                        .salario(new BigDecimal("3400"))
                        .build(),
                        
                Profesor.builder()
                        .nombre("Carlos")
                        .primerApellido("Sánchez")
                        .segundoApellido("Ortíz")
                        .fechaNacimiento(LocalDate.of(1980, Month.APRIL, 2))
                        .totalEstudiantes(85)
                        .dpto(Dpto.MECANICA)
                        .fechaInicioFacultad(LocalDate.of(2010, Month.JANUARY, 19))
                        .salario(new BigDecimal("3700"))
                        .build(),
                         
                Profesor.builder()
                        .nombre("José")
                        .primerApellido("Martínez")
                        .segundoApellido("Ruíz")
                        .fechaNacimiento(LocalDate.of(1981, Month.OCTOBER, 7))
                        .totalEstudiantes(105)
                        .dpto(Dpto.CIVIL)
                        .fechaInicioFacultad(LocalDate.of(2012, Month.SEPTEMBER, 29))
                        .salario(new BigDecimal("3800"))
                        .build(),
                        
                Profesor.builder()
                        .nombre("Víctor")
                        .primerApellido("Machado")
                        .segundoApellido("Arteaga")
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
                        .primerApellido("López")
                        .segundoApellido("García")
                        .fechaNacimiento(LocalDate.of(2002, Month.APRIL, 12))
                        .nombreFacultad("Ingeniería")
                        .totalAsignaturasMatriculadas(8)
                        .fechaAltaFacultad(LocalDate.of(2024, Month.AUGUST, 1))
                        .build(),

                Estudiante.builder()
                        .nombre("Pedro")
                        .primerApellido("Martín")
                        .segundoApellido("Sánchez")
                        .fechaNacimiento(LocalDate.of(2001, Month.AUGUST, 20))
                        .nombreFacultad("Ingeniería")
                        .totalAsignaturasMatriculadas(6)
                        .fechaAltaFacultad(LocalDate.of(2023, Month.SEPTEMBER, 1))
                        .build(),

                Estudiante.builder()
                        .nombre("Lucía")
                        .primerApellido("Navarro")
                        .segundoApellido("Pérez")
                        .fechaNacimiento(LocalDate.of(2003, Month.JANUARY, 5))
                        .nombreFacultad("Ingeniería")
                        .totalAsignaturasMatriculadas(10)
                        .fechaAltaFacultad(LocalDate.of(2024, Month.MARCH, 1))
                        .build(),
                        
                Estudiante.builder()
                        .nombre("Lisa")
                        .primerApellido("Ramírez")
                        .segundoApellido("Contreras")
                        .fechaNacimiento(LocalDate.of(2005, Month.FEBRUARY, 11))
                        .nombreFacultad("Ingeniería")
                        .totalAsignaturasMatriculadas(7)
                        .fechaAltaFacultad(LocalDate.of(2023, Month.JUNE, 14))
                        .build(),

                Estudiante.builder()
                        .nombre("Pablo")
                        .primerApellido("Gil")
                        .segundoApellido("Hernández")
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
                        .primerApellido("Suárez")
                        .segundoApellido("López")
                        .fechaNacimiento(LocalDate.of(1979, Month.JUNE, 18))
                        .totalEstudiantes(90)
                        .dpto(Dpto.MATEMATICAS)
                        .fechaInicioFacultad(LocalDate.of(2011, Month.SEPTEMBER, 5))
                        .salario(new BigDecimal("3300"))
                        .build(),

                Profesor.builder()
                        .nombre("Ricardo")
                        .primerApellido("Méndez")
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
                        .fechaInicioFacultad(LocalDate.of(2026, Month.MAY, 30))
                        .salario(new BigDecimal("3900"))
                        .build(),

                Profesor.builder()
                        .nombre("Daniel")
                        .primerApellido("Ortega")
                        .segundoApellido("Ruíz")
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
                        .nombre("Raúl")
                        .primerApellido("Herrera")
                        .segundoApellido("Navarro")
                        .fechaNacimiento(LocalDate.of(2001, Month.JULY, 19))
                        .nombreFacultad("Ciencias")
                        .totalAsignaturasMatriculadas(5)
                        .fechaAltaFacultad(LocalDate.of(2023, Month.JANUARY, 18))
                        .build(),

                Estudiante.builder()
                        .nombre("Irene")
                        .primerApellido("Domínguez")
                        .segundoApellido("Santos")
                        .fechaNacimiento(LocalDate.of(2003, Month.JANUARY, 27))
                        .nombreFacultad("Ciencias")
                        .totalAsignaturasMatriculadas(8)
                        .fechaAltaFacultad(LocalDate.of(2024, Month.SEPTEMBER, 11))
                        .build(),

                Estudiante.builder()
                        .nombre("Tomás")
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
        
        // FACULTAD HUMANIDADES
        
        List<Profesor> profesoresHumanidades = Arrays.asList(  // Esta será la lista de Prof. de Humanidades

                Profesor.builder()
                        .nombre("Beatríz")
                        .primerApellido("Romero")
                        .segundoApellido("Santos")
                        .fechaNacimiento(LocalDate.of(1977, Month.APRIL, 8))
                        .totalEstudiantes(92)
                        .dpto(Dpto.ECONOMIA)
                        .fechaInicioFacultad(LocalDate.of(2026, Month.MAY, 27))
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
                        .segundoApellido("Vaca")
                        .fechaNacimiento(LocalDate.of(2002, Month.FEBRUARY, 17))
                        .nombreFacultad("Humanidades")
                        .totalAsignaturasMatriculadas(7)
                        .fechaAltaFacultad(LocalDate.of(2024, Month.JUNE, 1))
                        .build(),

                Estudiante.builder()
                        .nombre("Adrián")
                        .primerApellido("Réyes")
                        .segundoApellido("Martínez")
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
                        .nombre("Héctor")
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
        
        Map<String, Map<Dpto, List<Profesor>>> profesoresPorFacultadYDpto = new LinkedHashMap<>();

        for (Facultad fac : facultades) {
            for (Profesor prof : fac.getProfesores()) {
                profesoresPorFacultadYDpto
                        .computeIfAbsent(fac.getNombre(), k -> new LinkedHashMap<>())
                        .computeIfAbsent(prof.getDpto(), k -> new ArrayList<>())
                        .add(prof);
            }
        }

        System.out.println("\nProfesores por facultad y departamento:");
        for (Map.Entry<String, Map<Dpto, List<Profesor>>> entradaFacultad : profesoresPorFacultadYDpto.entrySet()) {
            System.out.println("\nFacultad: " + entradaFacultad.getKey());

            for (Map.Entry<Dpto, List<Profesor>> entradaDpto : entradaFacultad.getValue().entrySet()) {
                System.out.println("  Dpto: " + entradaDpto.getKey());

                for (Profesor profe : entradaDpto.getValue()) {
                    System.out.println("    " + profe);
                }
            }
        }
   
  /*  4. Recorrer la lista de estudiantes, agrupada por facultad, y mostrar la lista de estudiantes de cada facultad 
   * ordenada por el total de asignaturas, según el orden natural.*/      
        
        Map<String, List<Estudiante>> estudiantesOrdenadosPorFacultad = facultades.stream()
                .flatMap(facultad -> facultad.getEstudiantes().stream())
                .collect(Collectors.groupingBy(
                        estudiante -> estudiante.getNombreFacultad()
                ));

        System.out.println("\nEstudiantes por facultad ordenados por total de asignaturas:");
        estudiantesOrdenadosPorFacultad.forEach((nombreFacultad, listaEstudiantes) -> {
            System.out.println("\nFacultad: " + nombreFacultad);
            listaEstudiantes.stream()
                    .sorted()
                    .forEach(System.out::println);
        });
        
  /* 5. Recorrer la colección que agrupa profesores por facultad y Dpto y mostrar la lista de profesores de cada 
   * facultad ordenada por salario y antigüedad del profesor, según el orden natural.*/
        
        System.out.println("\nProfesores por facultad y departamento ordenados por salario y antigüedad:");
        for (Map.Entry<String, Map<Dpto, List<Profesor>>> entradaFacultad : profesoresPorFacultadYDpto.entrySet()) {
            System.out.println("\nFacultad: " + entradaFacultad.getKey());

            for (Map.Entry<Dpto, List<Profesor>> entradaDpto : entradaFacultad.getValue().entrySet()) {
                System.out.println("  Dpto: " + entradaDpto.getKey());

                entradaDpto.getValue().stream()
                        .sorted()
                        .forEach(profesor -> System.out.println("    " + profesor));
            }
        }
        
        
        // 6.  Mostrar el nombre y los apellidos del profesor que tiene mayor salario de todas las facultades.
        
        Profesor profesorMayorSalario = facultades.stream()
                .flatMap(facultad -> facultad.getProfesores().stream())
                .max(Comparator.comparing(Profesor::getSalario))
                .orElse(null);

        if (profesorMayorSalario != null) {
            System.out.println("\nProfesor con mayor salario:");
            System.out.println(profesorMayorSalario.getNombre() + " " +
                    profesorMayorSalario.getPrimerApellido() + " " +
                    profesorMayorSalario.getSegundoApellido() + " " + ", con un Salario de: "  + 
                    profesorMayorSalario.getSalario() + " Eurazos");
        }
        
   // 7. Obtener una colección que agrupe estudiantes por total de asignaturas  matriculadas.
                       
        Map<Integer, List<Estudiante>> estudiantesPorTotalAsignaturas = facultades.stream()
                .flatMap(facultad -> facultad.getEstudiantes().stream())
                .collect(Collectors.groupingBy(
                        Estudiante::getTotalAsignaturasMatriculadas,
                        TreeMap::new,
                        Collectors.toList()
                ));

        System.out.println("\nEstudiantes agrupados por total de asignaturas matriculadas:");
        estudiantesPorTotalAsignaturas.forEach((totalAsignaturas, listaEstudiantes) -> {
            System.out.println("\nTotal asignaturas: " + totalAsignaturas);
            listaEstudiantes.forEach(System.out::println);
        });
        
      // 8. Crear una colección que permita almacenar estudiantes y profesores en la misma colección.  
        
        List<Persona> personas = facultades.stream()
                .flatMap(facultad -> Stream.concat(
                        facultad.getEstudiantes().stream(),
                        facultad.getProfesores().stream()
                ))
                .collect(Collectors.toList());

        System.out.println("\nColección conjunta de estudiantes y profesores:");
        personas.forEach(persona -> {
            if (persona instanceof Estudiante estudiante) {
                System.out.println("Estudiante: " +
                        estudiante.getNombre() + " " +
                        estudiante.getPrimerApellido() + " " +
                        estudiante.getSegundoApellido() +
                        " | Facultad: " + estudiante.getNombreFacultad() +
                        " | Asignaturas: " + estudiante.getTotalAsignaturasMatriculadas());
            } else if (persona instanceof Profesor profesor) {
                System.out.println("Profesor: " +
                        profesor.getNombre() + " " +
                        profesor.getPrimerApellido() + " " +
                        profesor.getSegundoApellido() +
                        " | Dpto: " + profesor.getDpto() +
                        " | Salario: " + profesor.getSalario());
            }
        });
        
        
 /*  9. Recorrer la colección creada en el punto anterior y mostrar solamente los profesores que tengan salario
  *  superior a la media y hayan comenzado a trabajar en la facultad en los últimos 5 días del mes en curso.*/
        
        List<Persona> personas1 = facultades.stream()
                .flatMap(facultad -> Stream.concat(
                        facultad.getEstudiantes().stream(),
                        facultad.getProfesores().stream()
                ))
                .collect(Collectors.toList());

        BigDecimal mediaSalarios = facultades.stream()
                .flatMap(facultad -> facultad.getProfesores().stream())
                .map(Profesor::getSalario)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .divide(BigDecimal.valueOf(
                        facultades.stream().flatMap(facultad -> facultad.getProfesores().stream()).count()
                ), 2, RoundingMode.HALF_UP);

        LocalDate hoy = LocalDate.now();
        YearMonth mesActual = YearMonth.from(hoy);
        LocalDate inicioUltimos5Dias = mesActual.atEndOfMonth().minusDays(4);

        System.out.println("\nProfesores con salario superior a la media y alta en los últimos 5 días del mes:");
        personas1.stream()
                .filter(persona1 -> persona1 instanceof Profesor)
                .map(persona1 -> (Profesor) persona1)
                .filter(profesor -> profesor.getSalario().compareTo(mediaSalarios) > 0)
                .filter(profesor -> !profesor.getFechaInicioFacultad().isBefore(inicioUltimos5Dias)
                        && !profesor.getFechaInicioFacultad().isAfter(mesActual.atEndOfMonth()))
                .forEach(profesor -> System.out.println(
                        profesor.getNombre() + " "
                        + profesor.getPrimerApellido() + " "
                        + profesor.getSegundoApellido()
                        + " | Salario: " + profesor.getSalario()
                        + " | Inicio: " + profesor.getFechaInicioFacultad()
                ));
        
 /*  10. Recorrer la lista de facultades y obtener una nueva colección que agrupe
		 por el total de asignaturas matriculadas por facultad*/
  
        Map<String, Map<Integer, List<Estudiante>>> estudiantesPorFacultadYTotalAsignaturas =
                facultades.stream()
                        .collect(Collectors.toMap(
                                Facultad::getNombre,
                                facultad -> facultad.getEstudiantes().stream()
                                        .collect(Collectors.groupingBy(
                                                Estudiante::getTotalAsignaturasMatriculadas,
                                                TreeMap::new,
                                                Collectors.toList()
                                        ))
                        ));

        System.out.println("\nEstudiantes agrupados por facultad y total de asignaturas:");
        estudiantesPorFacultadYTotalAsignaturas.forEach((nombreFacultad, mapaTotales) -> {
            System.out.println("\nFacultad: " + nombreFacultad);
            mapaTotales.forEach((totalAsignaturas, listaEstudiantes) -> {
                System.out.println("  Total asignaturas: " + totalAsignaturas);
                listaEstudiantes.forEach(estudiante -> System.out.println("    " + estudiante));
            });
        });
        
        
        
    }
}
