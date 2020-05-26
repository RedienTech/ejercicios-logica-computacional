package com.logica.actividad7;

import javax.swing.JOptionPane;

public class DatosConteo {
    
    private int cantidad;
    private int negativos;
    private int positivos;
    private int ceros;

    public DatosConteo() {
        this.cantidad = this.setCantidad();
        this.positivos = 0;
        this.negativos = 0;
        this.ceros = 0;
    }

    public int setCantidad() {
        String entrada = JOptionPane.showInputDialog(null, "Ingrese La Cantidad de Numeros a evaluar: ");
        return Integer.parseInt(entrada);
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void evaluar(Conteo number) {
        if (number.esCero()) {
            this.ceros++;
        }
        if (number.postivoNegativo()) {
            this.positivos++;
        } else {
            this.negativos++;
        }
    }

    public void printResult() {
        for (int i = 1; i <= this.getCantidad(); i++) {
            String numero = JOptionPane.showInputDialog(null, "IIngrese el Numero N° " + i);
            Conteo instancia = new Conteo(Integer.parseInt(numero));
            this.evaluar(instancia);
        }
        JOptionPane.showMessageDialog(null, "Numeros Positivos: " + this.positivos + 
        "\n Numeros Negativos: " + this.negativos + "\n Ceros: " + this.ceros);
    }
    


}