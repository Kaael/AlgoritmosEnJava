/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero 'n' identifique si es par o impar

*/

public class oddEven {   

   public static void main(String[] args) {
		int n=Integer.parseInt(args[0].toString());
		System.out.println("El numero es: "+ args[0]);
		if (n%2!=0){
   			System.out.println("El numero es impar");
		 }else{
   			System.out.println("El numero es par");
			}
		}	
   }