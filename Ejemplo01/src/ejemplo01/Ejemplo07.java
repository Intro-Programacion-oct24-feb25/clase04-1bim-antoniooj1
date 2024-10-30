/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo07 {
    public static void main(String[] args) {
        // Ejemplo de uso de printf con decimales
        
        double numerador = 10.0;
        double denominador = 3.0;
        double resultado = numerador / denominador;
        
        System.out.printf("El resultados es: %f\n", resultado);
         //se ocupa el %. para indicar el numero de decimales que quieres poner
        
        System.out.printf("El resultados es: %.2f\n", resultado);
              
    }
}
