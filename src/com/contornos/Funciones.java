package com.contornos;

import java.util.Random;
import java.util.Scanner;

public class Funciones {
    public static void generarAleatorio(Tablero tablero) {
        Random aux = new Random();
        String cifra = "";
        for (int i = 0; i < 5; i++) {
            cifra += aux.nextInt(10) + "";
        }
        tablero.setCifraAleatoria(cifra);
    }

    public static void pedirSec(Tablero tablero) {
        Scanner aux = new Scanner(System.in);
        System.out.println("Introduce un numero de 5 cifras");
        tablero.setCifraSecuencia(aux.nextLine());
    }

    public static String comprobarSec(String a, String b) {
        String pista = "";
        for (int i = 0, k = 0, l = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                k = 0;
                if (a.charAt(i) == b.charAt(j)) {
                    if (i == j) {
                        pista += "O";
                        k++;
                        break;
                    } else {
                        for (j = 0; j < 5; j++) {
                            if (a.charAt(i) == b.charAt(j)) {
                                if (i == j) {
                                    pista += "O";
                                    l++;
                                    k++;
                                    break;
                                }
                            }
                        }
                        if (l == 0) {
                            pista += "X";
                            k++;
                            break;
                        } else {
                            break;
                        }
                    }

                }
            }
            if (k == 0) {
                pista += "_";
            }
        }
        return pista;
    }

    public static void mostrar(String a) {
        if (a.equals("win")) {
            System.out.println("HAS GANADO");
        } else {
            System.out.println("HAS PERDIDO");
        }
    }

    public static void mostrarPista(String pista) {
        System.out.println(pista);
    }
}
