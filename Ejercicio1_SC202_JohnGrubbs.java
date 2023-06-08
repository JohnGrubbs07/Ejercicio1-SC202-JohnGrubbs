/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_sc202_.johngrubbs;

/**
 *
 * @author LABORATORIO 04
 */
public class Ejercicio1_SC202_JohnGrubbs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int cantidadEmpleados = 3;
      double[] salarios = {300000, 250000, 350000};
      
      double montoTotal = 0;
      
      for (int i =0; i < cantidadEmpleados; i ++){
       double salario = salarios [i];
       
       double montoSEM = salario * 0.0925;
       double montoIVM = salario * 0.0508;
       double montoTotalEmpleado = montoSEM + montoIVM;
        
       montoTotal = montoTotalEmpleado;
       
       //no lo termine 
      }
    }
    
}
