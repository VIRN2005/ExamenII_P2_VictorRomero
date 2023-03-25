package examenii_p2_victorromero;

import java.util.ArrayList;

public class Deportes {

    private String nombre;
    private ArrayList<Torneos> torneos;

    public Deportes() {
    }

    public Deportes(String nombre) {
        this.nombre = nombre;
    }
    

    public Deportes(String nombre, ArrayList<Torneos> torneos) {
        this.nombre = nombre;
        this.torneos = torneos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Torneos> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<Torneos> torneos) {
        this.torneos = torneos;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
