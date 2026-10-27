package main.java.org.zabalburu.App;

import org.zabalburu.ichueca.terminal.utils.VisorImagenes;

public class Tarjetajugador {
    private VisorImagenes visor;

    public Tarjetajugador() {
        this.visor = new VisorImagenes();
        visor.establecerTamaño(36, 16);
        visor.alinearIzquierda();

    }

    public void mostrarPersonaje(Personaje personaje) {
        System.out.println(
            TerminalANSI.RESET +
            TerminalANSI.CLEAR_SCREEN +
            TerminalANSI.GO_HOME
        );

    }
    public static void main(String[] args) {
        Personaje jugador = new Personaje (

            "Alex",
            "Médico",
            120,
            4,
            6
        );
        Tarjetajugador tj = new Tarjetajugador();
        tj.mostrarPersonaje(jugador);
    }

}
