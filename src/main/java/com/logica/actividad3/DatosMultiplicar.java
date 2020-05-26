package com.logica.actividad3;

import javax.swing.JOptionPane;

public class DatosMultiplicar {

    public DatosMultiplicar(){

    }

    public void printResult(){
        String valor = JOptionPane.showInputDialog(null, "Por Favor Digite El Multiplo");
        int multiplo = Integer.parseInt(valor);
        Multiplicar instancia = new Multiplicar(multiplo);
        System.out.println("Tabla demultiplicar del " + multiplo);
        JOptionPane.showMessageDialog(null, instancia.imprimirTabla(), "Tabla del " + multiplo, 1);
    }
}