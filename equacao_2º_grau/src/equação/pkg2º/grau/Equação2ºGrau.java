/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equação.pkg2º.grau;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Equação2ºGrau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
        double a,b,c,delta,x1,x2;
        System.out.println("entre com valor A: ");
        a = entrada.nextDouble();
        System.out.println("entre com valor B: ");
        b = entrada.nextDouble();
        System.out.println("entre com valor C: ");
        c = entrada.nextDouble();
        delta = (b * b) -4 * a * c;
        System.out.println("Delta = " + delta );
        if(delta > 0 ){
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Raízes reais e diferentes.");
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);        
        }else if(delta == 0){
            x1 = (-b + Math.sqrt(delta))/(2*a);  
            System.out.println("X1 = " + x1 + " " + "X2 = " + x1);
            System.out.println("Raízes reais e iguais.");
        }else if(delta < 0){
            System.out.println("Não possui raízes reais.");
        }  
    }
}
         
