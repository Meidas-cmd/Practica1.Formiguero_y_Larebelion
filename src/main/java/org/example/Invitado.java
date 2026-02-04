package org.example;

import java.time.LocalDateTime;

public class Invitado {

    private String nombre;
    private String profesion;
    private LocalDateTime fecha_visita;
    private int temporada;

    public Invitado(String nombre, String profesion,int temporada){

        this.nombre = nombre;
        this.profesion = profesion;
        //fecha_visita por defecto el día que se crea el Invitado
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

    public void setFecha_visita(LocalDateTime fecha_visita) {
        this.fecha_visita = fecha_visita;
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