package org.zabalburu.Domain;

public class Zombies {

    public static String Tipozombie;
    public static int vidazombie;

    public static String getTipozombie() {
        return Tipozombie;
    }

    public static void setTipozombie(String Tipozombie) {
        Zombies.Tipozombie = Tipozombie;
    }

    public static int getVidazombie() {
        return vidazombie;
    }

    public static void setVidazombie(int vidazombie) {
        Zombies.vidazombie = vidazombie;
    }

    public Zombies(String tipo, int vida) {
        Tipozombie = tipo;
        vidazombie = vida;
    }

}
