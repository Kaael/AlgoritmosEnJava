/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   

   public static void main(String[] args) {
   		int i= 1;
		int r=1;
		int f=Integer.parseInt(args[0].toString());
   		System.out.println("Numero "+args[0]);
		while(i<=f){
		r=r*i;
		i++;
		}
   		System.out.println("el producto es: "+r);
      
   }

}