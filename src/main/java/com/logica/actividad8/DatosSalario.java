package com.logica.actividad8;

import javax.swing.JOptionPane;

public class DatosSalario {

    public Nomina getData() {
        String entrada = JOptionPane.showInputDialog(null, "Ingrese el numero de trabajadores: ");
        int trabajadores = Integer.parseInt(entrada);
        return new Nomina(trabajadores);
    }

    public void printResult() {
        this.getData().imprimirResultado();
    }
}