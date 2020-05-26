package com.logica.actividad5;

public class Sumatoria {

    private int number;
    private int totalPares = 0;
    private int totalImpares = 0;
    private int pares = 0;
    private int impares = 0;

    public Sumatoria(int num) {
        this.setNumber(num);
    }

    public void setNumber(int n) {
        this.number = n;
    }

    public int getNumber() {
        return this.number;
    }

    public void evaluarNumeros() {
        for (int i = 1; i <= this.getNumber(); i++) {
            if ((i % 2) == 0) {
                this.pares += 1;
                this.totalPares += i;    
            } else {
                this.impares += 1;
                this.totalImpares += i;
            }
        }
    }

    public void imprimirResult() {
        this.evaluarNumeros();
        System.out.println("##### Resultados #####\n \n" +
        "El total de Numeros Pares: " + this.pares + "\n" +
        "Promedio de Numeros Pares: " + this.totalPares/this.pares + "\n" + 
        "El total de Numeros Impares: " + this.impares + "\n" + 
        "Promedio de Numeros Impares: " + this.totalImpares/this.impares);
    }
}