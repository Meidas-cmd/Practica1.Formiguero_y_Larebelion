package org.example;

import java.util.ArrayList;

public class Programa {

    private String nombre;
    private Cadena cadena;
    private  int temporadas;
    private ArrayList<Empleado> listaEmpleado;
    private ArrayList<Invitado> listaInvitados;


    public Programa (String nombre,int temporadas){

        this.nombre = nombre;
        this.temporadas = temporadas;


    }





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(ArrayList<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena +
                ", temporadas=" + temporadas +
                ", listaEmpleado=" + listaEmpleado +
                ", listaInvitados=" + listaInvitados +
                '}';
    }

}
