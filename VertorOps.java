package VetorEMatrizes;

import java.util.Scanner;

public class VertorOps {

	public static void main(String[] args) { 
		int vetor[] = new int[10];
        int posicao,soma = 0;
        float media;
        
        Scanner ler = new Scanner(System.in);

        for (posicao = 0; posicao < 10; posicao++) {
            System.out.print("\nDigite o número " + (posicao + 1) + ": ");
            vetor[posicao] = ler.nextInt();
        }

        System.out.println("\nElementos dos índices ímpares: ");
        for (posicao  = 0; posicao < vetor.length; posicao++) {
            if (posicao % 2 == 1) {System.out.print(vetor[posicao] + " ");
            }
        }

        System.out.println("\nElementos pares:");
        for (int numero : vetor) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }
        
        for (int numero : vetor) {
            soma += numero;
        }

        System.out.println("\nSoma: " + soma);

        media = soma / vetor.length;

        System.out.println("\nMédia: " + media);
	}

}
