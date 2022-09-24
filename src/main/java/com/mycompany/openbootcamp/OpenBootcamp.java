/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.openbootcamp;

/**
 *
 * @author Sebastian
 */
public class OpenBootcamp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        
        int resultado = sumar3(a,b,c);
        System.out.println("El resultado de sumar 'a', 'b' y 'c' es: " + resultado);
        
        Coche miCoche = new Coche();
        System.out.println("miCoche tiene: " + miCoche.puertas + " puertas");
        miCoche.incrementarPuertas();
        System.out.println("Luego de llamar a incrementarPuertas() ahora miCoche tiene: " + miCoche.puertas +" puertas");
        
    }
    
  
    public static int sumar3(int num1,int num2, int num3){

        int resultado = num1 + num2 + num3;
        return resultado;
    };
    
    
    
}

