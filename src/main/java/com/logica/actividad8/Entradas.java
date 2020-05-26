package com.logica.actividad8;

public class Entradas {

    private float SMMLV = 848232;
    
    private float sueldoActual;

    public Entradas (float sueldo) {
        this.setSueldoActual(sueldo);
    }

    public void setSueldoActual(float sueldo) {
        this.sueldoActual = sueldo;
    }

    public float getSueldoActual() {
        return this.sueldoActual;
    }

    //Retorna una tasa de incremento del Sueldo que luego usaremos para calcular el nuevo sueldo.
    public float aumentoSueldo() {
        float aumento;
        if ((this.getSueldoActual() / SMMLV) >= 2 ) {
            aumento = (float) 0.12;
        } else {
            aumento = (float) 0.15;
        }
        return aumento;
    }

    //Retorna el salario actual mas el incremento.
    public float nuevoSueldo() {
        return this.getSueldoActual() + (this.getSueldoActual() * this.aumentoSueldo());
    }

}    

      