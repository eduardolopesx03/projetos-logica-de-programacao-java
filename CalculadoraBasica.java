package comandos_basicos;

import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		float valor1;
		float valor2;
		float ResultadoAdicao;
		float ResultadSubtracao;
		float ResultadoMultiplicacao;
		float ResultadoDivisao;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = sc.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		valor2 = sc.nextFloat();
		
		ResultadoAdicao = (valor1 + valor2);
		ResultadSubtracao = (valor1 - valor2);
		ResultadoMultiplicacao = (valor1 * valor2);
		ResultadoDivisao = (valor1 / valor2);
		
		System.out.printf("A adição é: %.2f \n", ResultadoAdicao);
		System.out.printf("A subtração é: %.2f \n", ResultadSubtracao);
		System.out.printf("A multiplicação é: %.2f \n", ResultadoMultiplicacao);
		System.out.printf("A divisão é: %.2f \n", ResultadoDivisao);
		
		

	}

}
