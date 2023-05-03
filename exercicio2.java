package exercicio;

import java.util.Scanner;
public class exercicio2 {


public static void main (String[] args) { 




	  Scanner s = new Scanner (System.in);
	  
	  double numero1;
	  
	  System.out.println ("Entre com um numero");
	  numero1 = s.nextDouble ();
	  
	  System.out.println ("O Numero :" + numero1 + "elevado ao quadrado:");
	  
	  System.out.println (Math.pow( numero1, 2));
	   
	}
	}