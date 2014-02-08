/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/

public class whileValue {   

   public static void main(String[] args) {
   		int i = 0;
   		int f=Integer.parseInt(args[0].toString());
		f=f-1;
		if(f>0){
		while(i<f){
		System.out.println("el numero actual es: "+i);
		i++;
		}}else{
			System.out.println("Ingrese un valor diferente de cero");
		}
   		//si valor actual < args[0]
   			System.out.println("el valor actual es: "+i);
      
   }

}