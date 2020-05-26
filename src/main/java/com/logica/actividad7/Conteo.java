package com.logica.actividad7;

public class Conteo {
    private int numero;

    public Conteo(int num) {
        this.setNumero(num);
    }

    public void setNumero(int num) {
        this.numero = num;
    }

    public int getNumero() {
        return this.numero;
    }

    //Retorna TRUE si el numero es positivo y FALSE si es negativo.
    public boolean postivoNegativo() {
        return (this.getNumero() >= 0);
    }

    public boolean esCero(){
        return (this.getNumero() == 0);
    }
}