package com.logica.actividad6;

public class Pagos {
    
    private float primerPago = 10;

    public Pagos(float pago) {
        this.setPrimerPago(pago);
    }

    public void setPrimerPago(float pago) {
        this.primerPago = pago;
    }

    public float getPrimerPago() {
        return this.primerPago;
    }

    //El pago de cada mes 
    public void calcularPago() {
        float total = 0;
        for (int i = 1; i <= 10; i++) {
            float factor = (float) Math.pow(2,(i - 1));
            float pago = this.getPrimerPago() * factor;
            System.out.println("El pago para el mes N° " + i + " Sera de: " + pago);
            total = total + pago;
        }
        System.out.println("El Valor Total pagado fue de: " + total);
    }
}