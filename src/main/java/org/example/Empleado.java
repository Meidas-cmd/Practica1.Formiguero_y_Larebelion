package org.example;

public class Empleado {
    private final String AUX = "EP";
    private int num = 0;

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado (String id,String nombre,String cargo){

        setId();
        this.nombre = nombre;
        this.cargo = cargo;

    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = AUX+Integer.toString(num);
        num++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        boolean estado = true;
        boolean estado2 = true;
        switch (cargo.toLowerCase()){
            case "director":
                setDirector(null);
                estado2 = false;
                break;
            case "técnico":

                break;
            case "presentador":

                break;
            case "colaborador":

                break;
            default:
                estado = false;
                break;
        }
        if (estado){
        this.cargo = cargo;
        }else{
            System.out.println("Ese cargo no existe:");
            this.cargo = "pte";
        }
        if (estado2){
            setDirector();
        }
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
