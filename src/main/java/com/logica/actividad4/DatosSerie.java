package com.logica.actividad4;

import javax.swing.JOptionPane;

public class DatosSerie {
    public DatosSerie() {

    }

    public void printResult() {
        String valor = JOptionPane.showInputDialog(null, "Por Favor Digite Los digitos dela serie que desear ver", "Serie", 1);
        int numero = Integer.parseInt(valor);

        Serie instancia = new Serie(numero);
        instancia.ciclo();
    }
}