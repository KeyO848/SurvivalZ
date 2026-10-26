package org.zabalburu.Domain;

public class Personaje {

    private static String nombre;
    private static String tipopersonaje;
    private static int vidapersonaje;
    private static int habilidad;
    private static int botiquines;

    public int getBotiquines() {
        return botiquines;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipopersonaje() {
        return tipopersonaje;
    }

    public int getVida() {
        return vidapersonaje;
    }


    public Personaje(String nombre, String tipopersonaje, int vidapersonaje, int daño, int botiquines) {
        this.nombre = nombre;
        this.tipopersonaje = tipopersonaje;
        this.vidapersonaje = vidapersonaje;
        this.habilidad = habilidad;
        this.botiquines = botiquines;
    }

    @Override
    public String toString() {
        return "Personaje [nombre=" + nombre + ", tipo=" + tipopersonaje + ", vida=" + vidapersonaje + ", habilidad=" + habilidad + ", botiquines="
                + botiquines + "]";
    }

}
