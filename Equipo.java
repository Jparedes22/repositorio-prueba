package Estaticos;

public class Equipo {
    private String nombre;
    private int posicion;

    public Equipo(String nombre, int posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
