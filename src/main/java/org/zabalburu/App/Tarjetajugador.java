package main.java.org.zabalburu.App;
import org.zabalburu.ichueca.terminalUtils.utils.TerminalANSI;
import org.zabalburu.ichueca.terminalUtils.utils.VisorImagenes;
import org.zabalburu.survivalz.domain.Personaje;

public class TarjetaJugador {
    private VisorImagenes visor;

    public TarjetaJugador() {
        this.visor = new VisorImagenes();
        visor.establecerTamaño(36, 16);
        visor.alinearIzquierda();
    }

    public void mostrarPersonaje(Personaje personaje) {
        System.out.println(
                TerminalANSI.RESET +
                        TerminalANSI.CLEAR_SCREEN +
                        TerminalANSI.GO_HOME);
        escribir(1, 2, TerminalANSI.BOLD + TerminalANSI.CYAN + "SURVIVAL Z" + TerminalANSI.RESET);
    }

    private void escribir(int fila, int columna, String texto) {
        System.out.println(
                TerminalANSI.goTo(fila, columna) +
                        texto);
    }

    public static void main(String[] args) {
        Personaje jugador = new Personaje(
                "Alex",
                "Médico",
                120,
                4,
                2);
        TarjetaJugador tj = new TarjetaJugador();
        tj.mostrarPersonaje(jugador);
    }

}
