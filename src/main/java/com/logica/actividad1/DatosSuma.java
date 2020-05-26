package com.logica.actividad1;

import javax.swing.JOptionPane;

public class DatosSuma {

    public Suma getSuma() {
        String opc = JOptionPane.showInputDialog(null, "Digite el Numero de digitos que desa conocer en la serie: ");
        int num = Integer.parseInt(opc);
        Suma instancia = new Suma(num);
        return instancia;
    }

    public void printResult() {
        int suma = this.getSuma().calcSuma();
        JOptionPane.showMessageDialog(null, "La suma Total en la serie es: " + suma, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }



}