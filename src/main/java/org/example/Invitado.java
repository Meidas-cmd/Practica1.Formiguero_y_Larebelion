package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Invitado {

    Scanner entrada = new Scanner(System.in);

    private String nombre;
    private String profesion;
    private LocalDateTime fecha_visita;
    private int temporada;

    public Invitado(String nombre, String profesion,int temporada){

        this.nombre = nombre;
        this.profesion = profesion;
        setFecha_visita();
        this.temporada = temporada;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public LocalDateTime getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita() {
        System.out.println("Dime el año que vino el invitado: ");
        int año = entrada.nextInt();

        System.out.println("En que mes vino el invitado:");
        int mes = entrada.nextInt();

        System.out.println("Introduce el dia que vino el invitado:");
        int dia = entrada.nextInt();

        this.fecha_visita = LocalDateTime.of(año,mes,dia,0,0);
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }


    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", temporada=" + temporada +
                '}';
    }

}