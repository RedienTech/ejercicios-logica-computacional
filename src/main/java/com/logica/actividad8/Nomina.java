package com.logica.actividad8;

import javax.swing.JOptionPane;

public class Nomina {

    private int numeroTrabajadores;

    public Nomina(int n) {
        this.setNumero(n);
    }

    public void setNumero(int num) {
        this.numeroTrabajadores = num;
    }

    public int getNumeroTrabajadore() {
        return this.numeroTrabajadores;
    }
    
    public void imprimirResultado() {
        String message = "";
        float nomina = 0;
        for (int i = 1; i <= getNumeroTrabajadore(); i++) {
            String entrada = JOptionPane.showInputDialog(null, "Ingresar Salario del trabajador N°: " + i);
            float salario = Float.parseFloat(entrada);
            Salario instancia = new Salario(salario);
            nomina += instancia.nuevoSueldo();
            message += "El nuevo sueldo del trabajador N° " + i + " Sera: $ " + instancia.nuevoSueldo() + " Pesos\n";
        }
        JOptionPane.showMessageDialog(null, message + "\n El valor de la nueva nomina sera: " + nomina);
    }
}