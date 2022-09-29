/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geometrica;

import Dominio.Cubo;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class Geometrica {

    /**
     * @param args the command line argument
     * creamos clase cubo 3 propiedades: alto,ancho,profundo tipo INT, 
     * 2constructores(vacio y otro con 3 argumentos) + metodo calcularVolumen(a.b.c)
     * clase principal instancia el cubo1 para llamar al metodo e imprimirlo.
     * paso a paso estableciendo un punto de ruptura a la hora de llamar a la 
     * funcion 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("CALCULO DEL VOLUMEN DE CUBO");
        System.out.println("===========================");
        
        Cubo calculo = new Cubo();
        
        
        Scanner dato = new Scanner (System.in);
        
        
       
           Cubo cubo1 = new Cubo(12,12,12);
        int res = cubo1.calcularVolumen(cubo1.getAlto(),cubo1.getAncho(),
                cubo1.getProfundo());
        System.out.println("El resultado del volumen de mi cubo es = " + res);
         System.out.println("====================");
        
        System.out.println("Introduzca el Alto del cubo: ");
        int a = dato.nextInt();
        System.out.println("Introduzca el Ancho del cubo: ");
        int b = dato.nextInt();
        System.out.println("Introduzca el Profundo del cubo: ");
        int c = dato.nextInt();
        
        System.out.println("El volumen del Cubo es: "+ calculo.calcularVolumen(a,b,c));
        
        
        
    }
    
}
