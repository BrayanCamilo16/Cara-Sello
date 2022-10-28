package com.mycompany.cara_sello;

import java.util.Scanner;

public class Cara_Sello {

    public static void main(String[] args) {
        boolean seguir = true;
        int dineroJugador = 0;
        int dineroX = 0;
        int contador = 0;
        int ganancias = 0;
        int perdidas = 0;
        do {
            contador = contador + 1;
            System.out.println("\nBienvenidos al juego cara o sello!!");
            Scanner escribir = new Scanner(System.in);
            String eleccion = " ";
            int apuesta;

//        int moneda = (int) (Math.random() * 2) + 1;
            System.out.println("Escriba el dinero que desee apostar");
            apuesta = Integer.parseInt(escribir.nextLine());
            if (apuesta >= 10000) {
                System.out.println("Escriba cara si quiere cara");
                System.out.println("Escriba sello si quiere sello");
                eleccion = escribir.nextLine();

                int moneda = (int) (Math.random() * 2) + 1;

                if (moneda == 1 && eleccion.equalsIgnoreCase("cara")) {
                    System.out.println("Ha Salio Cara");
                    ganancias = ganancias + 1;
                    System.out.println("En hora buena, ha Ganado!!");
                    //aqui lo que hace es lo que aposto se le duplique
                    dineroJugador = dineroJugador + (apuesta * 2);
                } else if (moneda == 2 && eleccion.equalsIgnoreCase("sello")) {
                    System.out.println("Ha Salio Sello");
                    ganancias = ganancias + 1;
                    System.out.println("En hora buena, ha Ganado!!");
                    dineroJugador = dineroJugador + (apuesta * 2);
                } else if (moneda == 1 && eleccion.equalsIgnoreCase("sello")) {
                    System.out.println("Ha Salio Cara");
                    perdidas = perdidas + 1;
                    System.out.println("Lo sentimos, ha Perdido!!");
                    //aqui si el jugador pierde le quita lo que aposto.
                    dineroX = dineroX + (apuesta - apuesta);
                } else if (moneda == 2 && eleccion.equalsIgnoreCase("cara")) {
                    System.out.println("Ha Salio Sello");
                    perdidas = perdidas + 1;
                    System.out.println("Lo sentimos, ha Perdido!!");
                    dineroX = dineroX + (apuesta - apuesta);
                } else {
                    System.out.println("NO hay nada, porfavor escriba bien");
                }
                System.out.println("Quiere  seguir jugando");
                String jugando = escribir.next();
                if (!jugando.equalsIgnoreCase("si")) {
                    seguir = false;
                }

            } else {
                System.out.println("La apuesta debe ser mayor a 10000, verifique!!");
            }
        } while (seguir);
        {
            System.out.println("Usted ha hecho" + " " + contador + " " + "partidas");
            System.out.println("Usted ha ganado" + ganancias + " "+ "partidas");
            System.out.println("Usted ha perdido" + perdidas + " "+ "partidas");
            System.out.println("Su total de dinero por haber jugado es:" + dineroJugador);
        }
    }

//        cara = (int) (Math.random() * 100 + 2);
//        sello = (int) (Math.random() * 100 + 2);
//        if (cara == sello) {
//            cara = cara - 1;
//        }
//        Scanner escribir = new Scanner(System.in);
//        System.out.println("A quien apuesta, cara o sello");
//        eleccion = escribir.nextLine();
//        //el ignore case es para que no tome mayusculas o minusculas
//        if (eleccion.equalsIgnoreCase("cara") || eleccion.equalsIgnoreCase("sello")) {
//            if (moneda == cara || moneda == sello) {
//                String QueQuiere = escribir.nextLine();
//                if (Integer.parseInt(QueQuiere) != moneda) {
//                    System.out.println("Los sentimos, Ha perdido!");
//                } else {
//                    System.out.println("Usted Ha ganado");
//                }
//            }
//        }
//        escribir.close();
}
