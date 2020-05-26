package com.logica.actividad3;

public class Multiplicar {
    private int multiplo;

    public Multiplicar(int mult) {
        this.setMultiplo(mult);
    }

    public void setMultiplo(int mult) {
        this.multiplo = mult;
    }

    public int getMultiplo() {
        return this.multiplo;
    }

    public String imprimirTabla() {
        String tabla = "";
        for (int i = 1; i <= 10; i++) {
            int calc = this.getMultiplo() * i;
            tabla += (this.getMultiplo() + " X " + i + " = " + calc + "\n");
        }
        return tabla;
    }
}