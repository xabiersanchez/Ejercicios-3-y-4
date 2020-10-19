/* XABIER SANCHEZ VALERO
 https://github.com/xabiersanchez/Ejercicios-3-y-4.git */

package src;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		int num;
		int resultado = 1;
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("Escribe un numero del que quieras saber el factorial: ");
	    num = sc.nextInt();
	    sc.close();
	    
	    if(num == 0) {
	    	resultado = 0;
	    }
	    else {
	    	for(int i = num; i >= 1; i--) {
	    		resultado = resultado * (i);
	    	}
	    }
	    System.out.println(num + "! = " + resultado);
	}
}
