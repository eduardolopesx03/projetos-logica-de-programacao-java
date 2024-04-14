package estudo;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float valor1, valor2;
		int peso1 = 4, peso2 = 6;
		float media_ponderada;
		
		System.out.println("Digite a primeira nota: ");
		valor1 = sc.nextFloat();
		
		while (valor1 < 0 || valor1 > 10) {
			System.out.println("\nDigite a primeira nota: ");
			valor1 = sc.nextFloat();
		}
		
		System.out.println("\nDigite a segunda nota: ");
		valor2 = sc.nextFloat();
		
		while (valor2 < 0 || valor2 > 10) {
			System.out.println("\nDigite a segunda nota: ");
			valor2 = sc.nextFloat();
		}
		
		media_ponderada = (valor1*peso1 + valor2*peso2) / (peso1 + peso2);
		
		if (media_ponderada >= 6) {
			System.out.println("\nAprovado");
		}
		else if (media_ponderada < 6 && media_ponderada > 4) {
			System.out.println("\nProva final");
		}
		else {
			System.out.println("\nReprovado");
		}
		
		

	}

}
