package com.logica.actividad5;

import javax.swing.JOptionPane;

public class DatosSumatoria {
    public void printResult() {
        String input = JOptionPane.showInputDialog(null, "Ingrese El valor de X: ");
        int n = Integer.parseInt(input);
        Sumatoria instancia = new Sumatoria(n);
        instancia.imprimirResult();
    }
}