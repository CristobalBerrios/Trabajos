import java.util.Scanner;


public class CalculadoraConMetodos {

	
	
	public static void Menu(){
		System.out.println("Elija una opcion :");
		System.out.println("1.- Sumar 2 numeros");
		System.out.println("2.- Restar 2 numeros");
		System.out.println("3.- Multiplicar 2 numeros");
		System.out.println("4.- Dividir 2 numeros");
		System.out.println("5.- Calcular numero mayor");
		System.out.println("6.- Calcular potencia");
	}
	
	public static int Suma(int num1, int num2){
		int sumar = 0;
		sumar=num1+num2;
		return sumar;	
	}
	
	public static int Resta(int num1, int num2){
		int resta=0;
		resta=num1-num2;
		return resta;
	}
	
	public static int Multiplicacion(int num1, int num2){
		int multiplicacion=0;
		multiplicacion=num1*num2;
		return multiplicacion;
	}
	
	public static double Dividir(double num1, double num2){
	    double division = 0;
	    division=num1/num2;
	    return division;
	}
	
	public static int Mayor(int num1, int num2){
		int mayor=0;
		if (num1>num2){
			mayor=num1;
		}
		
		if (num2>num1){
			mayor=num2;
		}
		return mayor;
	}
	
	public static int Potencia(int num1, int num2){
		int potencia = 0;
		potencia= num1^num2;
		return potencia;
	}
	
	
	public static void main(String[] args) {
	
		int num1 = 0;
		int num2 = 0;
		int opcion = 0;
		int resultado = 0;
		double resultado2 = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		Menu();
		
		do{
			opcion=teclado.nextInt();
			if (opcion<1 || opcion>6){
				System.out.println("Ingrese una opcion valida");
			}
			
		}while(opcion<1 || opcion>6);
		
		
		System.out.println("Ingrese el numero 1");
		num1=teclado.nextInt();
		System.out.println("Ingrese el numero 2");
		num2=teclado.nextInt();
		
		if (opcion==1){
			resultado=Suma(num1,num2);
			System.out.println("El resultado es: "+resultado);
		}
		
		if (opcion==2){
			resultado=Resta(num1,num2);
			System.out.println("El resultado es: "+resultado);
		}
		
		if (opcion==3){
			resultado=Multiplicacion(num1,num2);
			System.out.println("El resultado es: "+resultado);
		}
		
		if (opcion==4){
			resultado2=Dividir(num1,num2);
			System.out.println("El resultado es: "+resultado2);
		}
		
		if (opcion==5){
			resultado=Mayor(num1,num2);
			System.out.println("El numero mayor es: "+resultado);
		}
		
		if (opcion==6){
			resultado=Potencia(num1,num2);
			System.out.println("El resultado es: "+resultado);
		}
	
		

	}

}
