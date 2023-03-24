package examenii_p2_victorromero;

public class Partidos {

    private String[] equipos;
    private int puntEqui1;
    private int puntEqui2;

    public Partidos() {
    }

    public Partidos(String[] equipos, int puntEqui1, int puntEqui2) {
        this.equipos = equipos;
        this.puntEqui1 = puntEqui1;
        this.puntEqui2 = puntEqui2;
    }

    public String[] getEquipos() {
        return equipos;
    }

    public void setEquipos(String[] equipos) {
        this.equipos = equipos;
    }

    public int getPuntEqui1() {
        return puntEqui1;
    }

    public void setPuntEqui1(int puntEqui1) {
        this.puntEqui1 = puntEqui1;
    }

    public int getPuntEqui2() {
        return puntEqui2;
    }

    public void setPuntEqui2(int puntEqui2) {
        this.puntEqui2 = puntEqui2;
    }

    @Override
    public String toString() {
        return "Partidos{" + "equipos=" + equipos + ", puntEqui1=" + puntEqui1 + ", puntEqui2=" + puntEqui2 + '}';
    }

}
