package com.logica.actividad6;

import javax.swing.JOptionPane;

public class Pagos {
    
    private float primerPago;

    public Pagos() {
        this.setPrimerPago(10);
    }

    public void setPrimerPago(float pago) {
        this.primerPago = pago;
    }

    public float getPrimerPago() {
        return this.primerPago;
    }

    //El pago de cada mes 
    public void calcularPago() {
        String message = "";
        float total = 0;
        for (int i = 1; i <= 10; i++) {
            float factor = (float) Math.pow(2,(i - 1));
            float pago = this.getPrimerPago() * factor;
            message += "El pago para el mes N° " + i + " Sera de: " + pago + "\n";
            total = total + pago;
        }
        String messageTotal = "\n El Valor Total pagado fue de: " + total;
        JOptionPane.showMessageDialog(null,  message + messageTotal);
    }
}