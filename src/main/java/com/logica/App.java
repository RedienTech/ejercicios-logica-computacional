package com.logica;

import javax.swing.JOptionPane;

import com.logica.actividad1.DatosSuma;
import com.logica.actividad3.DatosMultiplicar;
import com.logica.actividad4.DatosSerie;
import com.logica.actividad5.DatosSumatoria;
import com.logica.actividad6.DatosPago;
import com.logica.actividad7.DatosConteo;
import com.logica.actividad8.DatosSalario;

public class App 
{
    public static void main( String[] args )
    {
        int opt = menu();
        switch (opt) {
            case 1:
                DatosSuma instanciaSuma = new DatosSuma();
                instanciaSuma.printResult();
                break;
            case 3: 
                DatosMultiplicar instanciaMultiplos = new DatosMultiplicar();
                instanciaMultiplos.printResult();
                break;
            case 4:   
                DatosSerie instanciaSerie = new DatosSerie();
                instanciaSerie.printResult();
                break;
            case 5: 
                DatosSumatoria instanciaSumatoria = new DatosSumatoria();
                instanciaSumatoria.printResult();
                break;
            case 6:
                DatosPago instanciaPago = new DatosPago();
                instanciaPago.printResult();
                break;
            case 7: 
                DatosConteo instanciaConteo = new DatosConteo();
                instanciaConteo.printResult();
            case 8: 
                DatosSalario instanciaSalario = new DatosSalario();
                instanciaSalario.printResult();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Gracias, Vuelva Pronto");
                break;
        }
    }

    public static int menu() {
        String opciones = 
        "Lista de Programas: \n" +  
        "1: Numeros de la serie 0, 3, 6, 9, 12 ... \n" + 
        "2: Actividad 2 (inhabilitado) \n" + 
        "3: Tabla de Multiplicar de un Digito. \n" + 
        "4: N Terminos de la serie 1, 3, 7, 15, 31 ... \n" + 
        "5: Suma y Promedio de pares e impares. \n" + 
        "6: Cuotas de un Producto \n" + 
        "7: Ingresa Numeros y recibe el conteo de positivos, negativos y ceros. \n" + 
        "8: Calculo de salarios y nomina. \n" + 
        "Cualquier otra entrada para salir"; 
        
        String opt = JOptionPane.showInputDialog(null, opciones);
        return Integer.parseInt(opt);
    }
}
