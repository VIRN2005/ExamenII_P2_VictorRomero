
package examenii_p2_victorromero;

import java.util.ArrayList;

public class Torneos {
    private String nombre;
    private ArrayList<Equipos> equipos;
    private ArrayList<Partidos> partidos;
    private String periodo;

    public Torneos() {
    }

    public Torneos(String nombre, ArrayList<Equipos> equipos, ArrayList<Partidos> partidos, String periodo) {
        this.nombre = nombre;
        this.equipos = equipos;
        this.partidos = partidos;
        this.periodo = periodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipos> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipos> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Partidos> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partidos> partidos) {
        this.partidos = partidos;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Torneos{" + "nombre=" + nombre + ", equipos=" + equipos + ", partidos=" + partidos + ", periodo=" + periodo + '}';
    }
    
    
}
