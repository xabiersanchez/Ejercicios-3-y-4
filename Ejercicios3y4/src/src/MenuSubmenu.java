/* XABIER SANCHEZ VALERO
 https://github.com/xabiersanchez/Ejercicios-3-y-4.git */

package src;

import java.util.Scanner;

public class MenuSubmenu{

	public static void mostrarSubMenu() {
		System.out.println("\t SubMenu:");
		System.out.println("\t 1. Abrir programa");
		System.out.println("\t 2. Cerrar programa");
		System.out.println("\t 3. Guardar");
		System.out.println("\t 4. Volver al menu");
		System.out.println("\t Opcion: ");
	}
	
	public static void submenu(){
		int opcion1;
		Scanner sc = new Scanner(System.in);
		
		do{
			mostrarSubMenu();
			
			opcion1 = sc.nextInt();
			
			switch(opcion1) {
			case 1:
				System.out.println("ABRIR");
				break;
			case 2:
				System.out.println("CERRAR");
				break;
			case 3:
				System.out.println("GUARDAR");
				break;
			case 4:
				main(null);
				break;
			default:
				System.out.println("ELIGE UN VALOR ENTRE 1 Y 4");
			}
		}while(opcion1 != 4);
		sc.close();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continuar=true;
		int opcion;
		
		do {
			System.out.println("Elige una opción:");
			System.out.println("1. Abrir programa");
			System.out.println("2. Cerrar programa");
			System.out.println("3. Guardar");
			System.out.println("4. Salir");
			System.out.println("5. Mostrar SubMenu");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("ABRIR");
				//abrirPrograma();
				break;
			case 2:
				System.out.println("CERRAR");
				break;
			case 3:
				System.out.println("GUARDAR");
				break;
			case 4:
				System.out.println("SALIR");
				continuar=false;
				break;
			case 5: 
				submenu();
				break;
			default:
				System.out.println("ELIGE UN VALOR ENTRE 1 Y 4");
			}
			
		} while (continuar);
		sc.close();
	}
}
