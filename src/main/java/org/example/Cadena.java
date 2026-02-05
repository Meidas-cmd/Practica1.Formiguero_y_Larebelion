package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaProgramas;

    public Cadena (String nombre){

        this.nombre = nombre;
        this.listaProgramas = new ArrayList<>();

    }

    public void agregarPrograma(String nombre,int temporadas,String director){

        Programa nuevo = new Programa(nombre,temporadas,this,director);
        listaProgramas.add(nuevo);

    }

    public void invitadoAntes(String nombreInvitado) {
        Programa primerPrograma = null;
        LocalDateTime fechaPrimera = null;

        for (Programa p : listaProgramas) {
            for (Invitado i : p.getListaInvitados()) {
                if (i.getNombre().equalsIgnoreCase(nombreInvitado)) {
                    if (fechaPrimera == null || i.getFecha_visita().isBefore(fechaPrimera)) {
                        fechaPrimera = i.getFecha_visita();
                        primerPrograma = p;
                    }
                }
            }
        }

        if (primerPrograma != null) {
            System.out.println(nombreInvitado + " estuvo primero en " + primerPrograma.getNombre() +
                    " el día " + fechaPrimera.toLocalDate());
        } else {
            System.out.println("El invitado " + nombreInvitado + " no ha estado en ningún programa de esta cadena.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    @Override
    public String toString() {
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                ", listaProgramas=" + listaProgramas +
                '}';
    }

}
