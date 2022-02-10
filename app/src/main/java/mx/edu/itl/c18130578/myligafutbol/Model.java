package mx.edu.itl.c18130578.myligafutbol;

public class Model {

    String equipo1name;
    String equipo2name;
    int eqiopo1Photo;
    int eqiopo2Photo;
    String fecha;

    public Model(String equipo1name, String equipo2name, int eqiopo1Photo, int eqiopo2Photo, String fecha) {
        this.equipo1name = equipo1name;
        this.equipo2name = equipo2name;
        this.eqiopo1Photo = eqiopo1Photo;
        this.eqiopo2Photo = eqiopo2Photo;
        this.fecha = fecha;
    }

    public String getEquipo1name() {
        return equipo1name;
    }

    public void setEquipo1name(String equipo1name) {
        this.equipo1name = equipo1name;
    }

    public String getEquipo2name() {
        return equipo2name;
    }

    public void setEquipo2name(String equipo2name) {
        this.equipo2name = equipo2name;
    }

    public int getEqiopo1Photo() {
        return eqiopo1Photo;
    }

    public void setEqiopo1Photo(int eqiopo1Photo) {
        this.eqiopo1Photo = eqiopo1Photo;
    }

    public int getEqiopo2Photo() {
        return eqiopo2Photo;
    }

    public void setEqiopo2Photo(int eqiopo2Photo) {
        this.eqiopo2Photo = eqiopo2Photo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
