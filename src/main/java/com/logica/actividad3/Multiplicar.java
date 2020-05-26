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

    public void imprimirTabla() {
        System.out.println("Tabla demultiplicar del " + this.getMultiplo());
        for (int i = 1; i < 10; i++) {
            int calc = this.getMultiplo() * i;
            System.out.println(this.getMultiplo() + " X " + i + " = " + calc);
        }
    }
}