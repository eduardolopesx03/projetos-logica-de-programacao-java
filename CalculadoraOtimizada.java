package revisandoconteudo;

import java.util.Scanner;

public class CalculadoraOtimizada {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double valor[] = new double [2];
		int operacao;
		
		System.out.println("Usuário, informe um valor entre 0 a 10: ");
		valor[0] = sc.nextDouble();
		
		System.out.println("\nInforme outro valor: ");
		valor[1]  = sc.nextDouble();
		
		while (valor[0] < 0 || valor[0] > 10 || valor[1] < 0 || valor[1] > 10) {
			System.out.println("\nVocê digitou algum dos valores fora do intervalo solicitado!!");
			
			System.out.println("\nUsuário, informe um valor entre 0 a 10: ");
			valor[0] = sc.nextDouble();
			
			System.out.println("\nInforme outro valor: ");
			valor[1]  = sc.nextDouble();
		}
		
		while (valor[0] >= 0 && valor[0] <= 10 && valor[1] >= 0 && valor[1] <= 10) {
			System.out.println("\nAgora informe qual operação você irá querer efetuar: "
							+ "\n(1) Soma"
							+ "\n(2) Subtração"
							+ "\n(3) Multiplicação"
							+ "\n(4) Divisão");
			operacao = sc.nextInt();
			
			if (operacao == 1) {
				System.out.println("\n" + valor[0] + " + " + valor[1] + " = " + (valor[0] + valor[1]));
			}
			else if (operacao == 2) {
				System.out.println("\n" + valor[0] + " - " + valor[1] + " = " + (valor[0] - valor[1]));
			}
			else if (operacao == 3) {
				System.out.println("\n" + valor[0] + " * " + valor[1] + " = " + (valor[0] * valor[1]));
			}
			else if (operacao == 4) {
				System.out.println("\n" + valor[0] + " / " + valor[1] + " = " + (valor[0] / valor[1]));
			}
			else {
				System.out.println("\nOperação inexistente!!");
			}
			
			System.out.println("\nUsuário, informe um valor entre 0 a 10: ");
			valor[0] = sc.nextDouble();
			
			System.out.println("\nInforme outro valor: ");
			valor[1]  = sc.nextDouble();
			
			while (valor[0] < 0 || valor[0] > 10 || valor[1] < 0 || valor[1] > 10) {
				System.out.println("\nVocê digitou algum dos valores fora do intervalo solicitado!!");
				
				System.out.println("\nUsuário, informe um valor entre 0 a 10: ");
				valor[0] = sc.nextDouble();
				
				System.out.println("\nInforme outro valor: ");
				valor[1]  = sc.nextDouble();
			}
		}
	}

}
