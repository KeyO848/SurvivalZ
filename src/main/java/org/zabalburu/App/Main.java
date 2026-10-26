package org.zabalburu.App;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("SURVIVAL Z");
        System.out.println("Como te llamas superviviente?");
        String nombre = sc.nextLine().trim();
        System.out.println("""
                Selecciona tu clase:
                1.Médico
                2.Policía
                3.Bombero
                """);
        int clase = sc.nextInt();
        String tipopersonaje;
        int vidapersonaje;
        int botiquines;
        int habilidad;
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
        }
        
    }
}
