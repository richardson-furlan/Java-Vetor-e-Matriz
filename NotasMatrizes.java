 package VetorEMatrizes;

import java.util.Scanner;

public class NotasMatrizes {

	public static void main(String[] args) {

		float part[][] = new float[10][4];
		float media[] = new float[10];
		int lin,col;
		float somaNota=0;
		Scanner leia = new Scanner(System.in);
		
		for(lin=0;lin<10;lin++) {
			for(col=0;col<4;col++) {
				System.out.println("\nEntre com a "+(col+1)+"a. nota: ");
				part[lin][col] = leia.nextFloat();
				somaNota += part[lin][col];
			}
			media[lin] = somaNota/4;
			somaNota = 0;
		}
		
		for(lin=0;lin<10;lin++) {
			System.out.print(media[lin]+" | ");
		}
				
			}
		} 

	


