package com.contornos;

public class Main {

    public static void main(String[] args) {
        Tablero tablero = Tablero.getInstance();
        Funciones.generarAleatorio(tablero);
        //System.out.println(tablero.getCifraAleatoria());
        for (int i = 0; i < 10; i++) {
            Funciones.pedirSec(tablero);
            if (tablero.getCifraSecuencia().equals(tablero.getCifraAleatoria())) {
                Funciones.mostrar("win");
                break;
            } else if (i == 9) {
                Funciones.mostrar("lose");
                break;
            } else {
                Funciones.mostrarPista(Funciones.comprobarSec(tablero.getCifraSecuencia(), tablero.getCifraAleatoria()));
            }
        }
        System.out.println(tablero.getCifraAleatoria());
    }
}
