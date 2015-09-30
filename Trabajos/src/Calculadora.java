import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0 ;
		int num1= 0 ;
		int num2= 0 ;
		double resultado = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			
			System.out.println("Ingrese una opcion");
			System.out.println("1.- Sumar 2 numeros");
			System.out.println("2.- Restar 2 numeros");
			System.out.println("3.- Multiplicar 2 numeros");
			System.out.println("4.- Dividir 2 numeros");
			System.out.println("5.- Salir del programa");
			
			do {
				opcion=teclado.nextInt();
				if (opcion<1 || opcion>5){
					System.out.println("Ingrese una opcion valida");
				}
				
			}while(opcion<1 || opcion>5);
			
			if (opcion == 1){
				System.out.println("Ingrese numero 1");
				num1=teclado.nextInt();
				System.out.println("Ingrese numero 2");
				num2=teclado.nextInt();
				resultado= num1+num2;
				System.out.println("El resultado de su suma es: "+(int)resultado);
			}
			
			else if (opcion == 2){
				System.out.println("Ingrese el numero 1");
				num1=teclado.nextInt();
				System.out.println("Ingrese el numero 2");
				num2=teclado.nextInt();
				resultado=num1-num2;
				System.out.println("El resultado de su resta es: "+(int)resultado);
			}
			
			else if (opcion == 3){
				System.out.println("Ingrese el numero 1");
				num1=teclado.nextInt();
				System.out.println("Ingrese el numero 2");
				num2=teclado.nextInt();
				resultado=num1*num2;
				System.out.println("El resultado de su multiplicaion es "+(int)resultado);
			}
			
			else if (opcion == 4){
				System.out.println("Ingrese el numero 1");
				num1=teclado.nextInt();
				System.out.println("Ingrese el numero 2");
				num2=teclado.nextInt();
                resultado=(double)num1/(double)num2;
				System.out.println("El resultado de su division es: "+resultado);
				
			}
			
			
		}while(opcion>0 & opcion<5);
		System.out.println("A finalizado el programa :)");
		
		
		

		
		
		
		
		
		
		
		
	}

}
