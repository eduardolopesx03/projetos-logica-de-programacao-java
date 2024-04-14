package estudo;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		float peso;
		float altura;
		float imc;

		System.out.println("Qual é o seu peso?");
		peso = sc.nextFloat();

		System.out.println("\nQual é a sua altura?");
		altura = sc.nextFloat();

		imc = peso/(altura*altura);

		System.out.printf("\nseu imc é: " + imc);

		if (imc < 18.5) {
			System.out.println("\nAbaixo do peso");
		}
		else if (imc >= 18.6 && imc <= 24.5){
			System.out.println("\nPeso ideal");
		}
		else if (imc >= 25 && imc <= 29.9) {
			System.out.println("\nLevemente acima do peso");
		}
		else if (imc >= 30 && imc <= 34.9) {
			System.out.println("\nObesidade grau 1");
		}
		else if (imc >= 35 && imc <= 39.9) {
			System.out.println("\nObesidade gra 2 (severa)");
		}
		else if (imc > 40) {
			System.out.println("\nObesidade 3 (mórbida");
		}
	}

}
