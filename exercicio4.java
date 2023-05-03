package exercicio;



import java.util.Scanner;
import java.math.*;
public class exercicio4 {

	 public static void main (String[] args) {
		 

		 
		 System.out.println ("Vou adivinhar seu nome e sua idade");
		 

		  Scanner s = new Scanner (System.in);
		  
		  String nome;
		  Integer idade;
		  
		  
		 System.out.println ("Escreva seu nome :");
		  nome = s.next () ;
		  
		  
		  
		  System.out.println("Seu ano de nascimeno:") ;
		  idade = s.nextInt ();
		
		  System.out.println("Seu Nome É:" + nome );
		  
		  System.out.println ( "Sua nome É :" + (2023-idade)); 
		  
		  
		
		  }
}