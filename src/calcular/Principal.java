
package calcular;

import java.util.Scanner;


public class Principal {
    
     public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in); 
        Calcular c=new Calcular();
        System.out.println("Ingrese el radio del circulo");
        c.setNumero1(sc.nextInt());
        c.circuloA();
        System.out.println("El area del circulo es: "+c.getResultado());
        c.circuloP();
        System.out.println("El perimetro del circulo es: "+c.getResultado());
        System.out.println("Ingrese la base del triangulo");
        c.setNumero2(sc.nextInt());
        System.out.println("Ingrese la altura del triangulo");
        c.setNumero3(sc.nextInt());
         c.trianguloA();
        System.out.println("El area del triangulo es: "+c.getResultado());
         c.trianguloP();
        System.out.println("El perimetro del triangulo es: "+c.getResultado());
        System.out.println("Ingrese el lado del cuadrado");
        c.setNumero2(sc.nextInt());
        c.cuadradoA();
        System.out.println("El area del cuadrado es: "+c.getResultado());
         c.cuadradoP();
        System.out.println("El perimetro del triangulo es: "+c.getResultado());
       
    }   
}
