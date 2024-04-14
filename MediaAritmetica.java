package estudo;

import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float valor1, valor2, media_aritmetica;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = sc.nextInt();
		
		System.out.println("Digite o primeiro valor: ");
		valor2 = sc.nextInt();
		
		media_aritmetica = (valor1 + valor2) / 2;
		
		System.out.println("\no resultado é: " + media_aritmetica);
		
		
		

	}

}
