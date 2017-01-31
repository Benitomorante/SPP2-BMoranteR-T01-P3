/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.bmoranter.t01.p3;
import java.util.Scanner;
/**
 *
 * @author Benito Mv
 */
public class SPP2BMoranteRT01P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //ingreso variables
    double x1,x2,y1,y2,D;
    Scanner sc= new Scanner(System.in);
    
    //ingresa x1
        System.out.println("Ingresa x1");
        x1= sc.nextDouble();
    //ingresa x2
        System.out.println("Ingresa x2");
        x2= sc.nextDouble();
    //ingresa y1
        System.out.println("Ingresa y1");
        y1= sc.nextDouble();
    //ingresa y2
        System.out.println("Ingresa y2");
        y2= sc.nextDouble();
        
    //Operaciones
    D= Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
    
    //Distanica
        System.out.println("la distancia es "+ D);
    }
    
}
