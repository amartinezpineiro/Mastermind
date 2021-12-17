package com.contornos;

public class Tablero {
    private String cifraAleatoria;
    private String cifraSecuencia;
    private String cifraPista;

    private Tablero() {
    }

    static Tablero tablero;

    static Tablero getInstance() {
        if (tablero == null) {
            tablero = new Tablero();
        }
        return tablero;
    }

    public String getCifraAleatoria() {
        return cifraAleatoria;
    }

    public void setCifraAleatoria(String cifraAleatoria) {
        this.cifraAleatoria = cifraAleatoria;
    }

    public String getCifraSecuencia() {
        return cifraSecuencia;
    }

    public void setCifraSecuencia(String cifraSecuencia) {
        this.cifraSecuencia = cifraSecuencia;
    }

    public String getCifraPista() {
        return cifraPista;
    }

    public void setCifraPista(String cifraPista) {
        this.cifraPista = cifraPista;
    }

}
