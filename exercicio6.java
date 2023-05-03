package exercicio;


import java.util.Scanner;
import java.math.*;
public class exercicio6 {

	 public static void main (String[] args) {
		 
		 

		  Scanner s = new Scanner (System.in);
		  
		  double catl, cat2, hip, resutado;
		  
		  
		  System.out.println("Escreva um cateto:") ;
		  catl = s.nextDouble ();
		
		  System.out.println(" Escreva outro cateto :") ;
		  cat2 = s.nextDouble ();
		  
		  resutado = (catl*catl)+(cat2*cat2);
		  
		  resutado = Math.sqrt(resutado);
		  
		  System.out.println ("a Hipotenusa é :" + resutado);
				 
	 }
	 
}
				  
	
		  
		  

