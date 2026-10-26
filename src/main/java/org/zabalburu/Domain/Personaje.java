package org.zabalburu.Domain;

public class Personaje {

    private static String nombre;
    private static String tipo;
    private static int vida;
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

    public String getTipo() {
        return tipo;
    }

    public int getVida() {
        return vida;
    }


    public Personaje(String nombre, String tipo, int vida, int daño, int botiquines) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.habilidad = habilidad;
        this.botiquines = botiquines;
    }

    @Override
    public String toString() {
        return "Personaje [nombre=" + nombre + ", tipo=" + tipo + ", vida=" + vida + ", habilidad=" + habilidad + ", botiquines="
                + botiquines + "]";
    }

}
