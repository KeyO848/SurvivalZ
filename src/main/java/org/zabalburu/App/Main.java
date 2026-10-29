package main.java.org.zabalburu.App;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("""
                    ==============================================
                        SURVIVAL Z 🧟
                    ______________________________________________
                """);
        System.out.println("Como te llamas superviviente?");
        String nombre = sc.nextLine().trim();
        System.out.println("""
                =============================================================
                    Selecciona tu clase:
                    1.Médico
                    2.Policía
                    3.Bombero
                =============================================================
                    """);
        int clase = sc.nextInt();
        String tipopersonaje = null;
        int vidapersonaje = 0;
        int botiquines = 0;
        int habilidad = 0;
        sc.nextLine();
        switch (clase) {
            case 1:
                tipopersonaje = "Médico";
                vidapersonaje = 120;
                botiquines = 3;
                habilidad = 6;
                break;
            case 2:
                tipopersonaje = "Policía";
                vidapersonaje = 100;
                botiquines = 2;
                habilidad = 6;
                break;
            case 3:
                tipopersonaje = "Bombero";
                vidapersonaje = 140;
                botiquines = 1;
                habilidad = 7;
                break;
            default:
                tipopersonaje = "Policía";
                vidapersonaje = 100;
                botiquines = 2;
                habilidad = 6;

        }
        System.out.println("""
                -------------------------------------
                |    Bienvenido %s,                 |
                |    Tu profesión es %s             |
                |    tu vida es %d                  |
                |    tu número de botiquines es %d  |
                |    tu habilidad es %d             |
                -------------------------------------
                    """.formatted(
                nombre, tipopersonaje, vidapersonaje, botiquines, habilidad));

        int tipoAleatorio = (int) (Math.random() * 3 + 1);
        int vidazombie = 0;
        String tipozombie = null;

        switch (tipoAleatorio) {

            case 1:
                tipozombie = "Caminante";
                vidazombie = 20;
                break;
            case 2:
                tipozombie = "Corredor";
                vidazombie = 35;
                break;
            case 3:
                tipozombie = "Tanque";
                vidazombie = 50;
                break;

        }

        int Día = 1;
        for (int i = 1; i < 6; i++) {
            System.out.println("Día " + i);
            if (vidapersonaje < 30) {
                System.out.println("""
                        ======================================
                            ESTADO CRÍTICO
                        """);
            } else if (vidapersonaje <= 70) {
                System.out.println("""
                        ======================================
                                HERIDA
                            """);
            } else {
                System.out.println("""
                        ======================================
                                ESTABLE
                            """);

            }

            int puntos = 0;
            int opcion = 0;
            do {

                System.out.println("========================================");
                System.out.println("1. hacer una mision");
                System.out.println("2. Explorar");
                System.out.print("Seleccione opción: ");
                System.out.println();
                System.out.println("========================================");
                opcion = sc.nextInt();
                if (opcion == 1) {
                    System.out.println("has completado una misión"); /* Meter misiones antes de esta linea */
                    puntos += 30;
                    System.out.println("===================================================================");
                    System.out.println("Puntos totales: " + puntos);
                } else if (opcion == 2) {
                    System.out.println("No has encontrado nada");
                    System.out.println("__________________________________________________________________");

                }

            } while (puntos <= 100);

            String nombremision = switch ((int) (Math.random() * 2 + 1)) {
                case 1 ->
                    """
                            ====================================
                                combatir zombies
                            ____________________________________
                                """;
                case 2 ->
                    """
                            ____________________________________
                                Explorar vivienda
                            ====================================
                                """;
                default ->
                    throw new AssertionError();
            };
            System.out.println(nombremision);
            System.out.println("=============================================================================");

            System.out.println("""
                    Al estar distraido buscando suministros, pisaste una lata y llamaste la atención de un %s,
                    gracias a tu habilidad sabes que el zombie tiene %d de vida, que acción tomas:
                    1. Atacar
                    2. Huir
                    3. Usar Botiquín
                    """.formatted(
                    tipozombie, vidazombie));

        }

        int dañopersonaje = 0;
        int dañozombie = 0;
        Boolean huida = false;
        int opcion = 0;

        while (vidazombie > 0 && vidapersonaje > 0 && huida == false) {
            switch (key) {
                case value:

                default:

            }

        }

        switch (sc.nextInt()) {

        }

    }

}