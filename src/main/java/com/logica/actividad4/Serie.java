package com.logica.actividad4;

import javax.swing.JOptionPane;

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
        String message = "";
        for (int i = 1; i <= this.getNumero(); i++) {
            int suma = (int) Math.pow(2, (i - 1));
            numero += suma;
            message += (i + " : " + numero + "\n");
        }
        JOptionPane.showMessageDialog(null, "Estos son los Primeros " + this.getNumero() + " Numeros de la serie. \n " + 
        message);
    }
}