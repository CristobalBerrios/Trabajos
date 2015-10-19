import java.util.Scanner;


public class Football {

	public static void main(String[] args) {
		// Torneo de caridad Cristobal Berrios
		
		
		int n = 0;
		int i = 0;
		int j = 0;
		int g = 0;
		int cont = 1;
		int ptj = 0;
		int derrotas =0;
	
		Scanner teclado = new Scanner(System.in);
		
		n=teclado.nextInt(); //Ingreso la cantidad de partidos !
		
		int [][] matriz = new int [n][2]; //Creo la matriz para guardar los resultados de los partidos
		
		g=teclado.nextInt(); //leo los goles que se compraran
		
		for (i=0;i<n;i++){
			for (j=0;j<2;j++){
				matriz[i][j]=teclado.nextInt();
			}
		}
	
		//Ciclo que me recorre la matriz y suma goles en los empates y calcula derrotas 
		for (i=0;i<n;i++){
			if(matriz[i][0]==matriz[i][1]){
				if(g>0){
					matriz[i][0]=matriz[i][0]+1;
					g=g-1;
				}
			}
			
			if (matriz[i][0]<matriz[i][1]){
				derrotas=derrotas+1;
			}
			
		}
		
		//Ciclo que recorre la matriz si tengo goles disponibles y me suma goles en orden de menor diferencia de partidos
		
		if(derrotas>0){
			while(g>0){
				for(i=0;i<n;i++){
					if(matriz[i][1]-matriz[i][0]==cont){
						do{
							if(g>0){
								matriz[i][0]=matriz[i][0]+1;
								g=g-1;
							}
							if(g==0){
								break;
							}
						}while(matriz[i][1]>=matriz[i][0]);
						derrotas=derrotas-1;
					}
				}
				if(g==0){
					break;
				}
				if(derrotas<1){
					break;
				}
				cont=cont+1;
			}
		}
		
		
		//Ciclo que calcula los puntos de los partidos
		
		for(i=0;i<n;i++){
			if(matriz[i][0]>matriz[i][1]){
				ptj=ptj+3;
			}
			if(matriz[i][0]==matriz[i][1]){
				ptj=ptj+1;
			}
		}
		
        System.out.println(ptj);
        
	}

}
