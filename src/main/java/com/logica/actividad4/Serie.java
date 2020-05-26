package com.logica.actividad4;

public class Serie {
    private int numero;

    public Serie(int n) {
        this.setNumero(n);
    } 

    public void setNumero(int num) {
        this.numero = num;
    }

    public int getNumero() {
        return this.numero;
    }

    public void ciclo() {
        int numero = 0;
        System.out.println("Estos son los Primeros " + this.getNumero() + " Numeros de la serie.");
        for (int i = 1; i <= this.getNumero(); i++) {
            int suma = (int) Math.pow(2, (i - 1));
            numero += suma;
            System.out.println(i + " : " + numero);
        }
    }
}