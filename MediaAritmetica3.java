package faculdade1;

import java.util.Scanner;

public class MediaAritmetica3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float valor1;
		float valor2;
		float valor3;
		float media;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = sc.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		valor2 = sc.nextFloat();
		
		System.out.println("Digite o terceiro valor: ");
		valor3 = sc.nextFloat();
		
		media = (valor1 + valor2 + valor3) / 3;
		
		
		if (media >=6) {
			System.out.println("Você foi aprovado!");
		}
		else {
			System.out.println("Você foi reprovado!");
		}
		
		
		
	}

}
