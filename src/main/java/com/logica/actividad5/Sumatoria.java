package com.logica.actividad5;

import javax.swing.JOptionPane;

public class Sumatoria {

    private int number;
    private int totalPares;
    private int totalImpares;
    private int pares;
    private int impares;

    public Sumatoria(int num) {
        this.setNumber(num);
        totalPares = 0;
        totalImpares = 0;
        pares = 0;
        impares = 0;
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
        String message = "##### Resultados #####\n \n" +
        "El total de Numeros Pares: " + this.pares + "\n" +
        "Promedio de Numeros Pares: " + this.totalPares/this.pares + "\n" + 
        "El total de Numeros Impares: " + this.impares + "\n" + 
        "Promedio de Numeros Impares: " + this.totalImpares/this.impares;
        JOptionPane.showMessageDialog(null, message, "Resultado", 1);
    }
}