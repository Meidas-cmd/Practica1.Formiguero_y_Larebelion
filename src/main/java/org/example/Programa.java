package org.example;

import java.util.ArrayList;

public class Programa {

    private String nombre;
    private Cadena cadena;
    private  int temporadas;
    private Empleado director;
    private ArrayList<Empleado> listaEmpleado;
    private ArrayList<Invitado> listaInvitados;


    public Programa (String nombre,int temporadas,Cadena cadena,String director){

        this.nombre = nombre;
        this.temporadas = temporadas;
        this.cadena = cadena;
        Empleado jefe = new Empleado(director,"director",null);
        this.director = jefe;
        this.listaEmpleado = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();
    }

    public void invitadosTemporada(int temporada){

        int cont = 0;


        for (Invitado i : listaInvitados){
            if (i.getTemporada() == temporada){
                cont++;
                System.out.println("El nombre del invitado es " + i.getNombre() + "y su prfesion es " + i.getProfesion());

            }

        }
        System.out.println("Han habido un total de " + cont + " invitados.");

    }

//    public int vecesInvitado(){
//        int cont = 0;
//
//
//
//
//        return
//    }


    public boolean buscarInvitado(String nombre){
        boolean esta = false;

        for (Invitado i : listaInvitados){
            if (i.getNombre().toLowerCase().equals(nombre.toLowerCase())){
                esta = true;
                return esta;
            }
        }

        return esta;
    }

    public void agregarEmpleado(String nombre,String cargo){

        Empleado nuevo = new Empleado(nombre,cargo,director);
        listaEmpleado.add(nuevo);

    }
    public void agregarInvitado(String nombre,String profesion, int temporada){

        Invitado invi = new Invitado(nombre,profesion,temporada);
        listaInvitados.add(invi);

    }
    public int vecesInvitado(String nombre) {
        int cont = 0;
        for (Invitado i : listaInvitados) {
            if (i.getNombre().equals(nombre)) {

                cont++;

            }

        }
        System.out.println("El invitado  "+nombre+" ha sido intadodo  "+cont+" veces");

        return cont;
    }

    public void rastrearInvitado(String nombre) {
        int veces= vecesInvitado(nombre);
        System.out.println(nombre+" ha sido invitado "+veces+" veces");
        for (Invitado i : listaInvitados) {
            if (i.getNombre().equals(nombre)) {


                System.out.println(nombre+" vino en la temporada"+i.getTemporada()+ " en la fecha "+i.getFecha_visita());

            }


        }

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
                ", director=" + director +
                ", listaEmpleado=" + listaEmpleado +
                ", listaInvitados=" + listaInvitados +
                '}';
    }


}

