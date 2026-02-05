package org.example;

public class AppProgramas {

    public static void main(String[] args) {

        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);

        Programa el_hormiguero = new Programa("El Hormiguero",11,antena3,"Director1");
        System.out.println(el_hormiguero);
        System.out.println(antena3);

        el_hormiguero.agregarEmpleado("Pablo Motos","presentador");
        System.out.println(el_hormiguero);

        System.out.println(el_hormiguero.getListaEmpleado());

        el_hormiguero.agregarInvitado("Aitana","cantante",1);

        System.out.println(el_hormiguero.getListaInvitados());
    }
}
