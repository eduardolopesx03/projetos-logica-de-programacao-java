package estudo;

import java.util.Scanner;

public class QuestaoProva3Certa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		String nome;
		int idade, geral = 0, infantila = 0, infantilb = 0, juvenila = 0, juvenilb = 0;

		while (geral < 15) {

			System.out.println("\nQual o nome do jogador?");
			nome = sc.next();

			System.out.println("\nQual a sua idade?");
			idade = sc.nextInt();

			while (idade < 5) {
				System.out.println("Idade insuficiente");

				System.out.println("\nQual o nome do jogador?");
				nome = sc.next();

				System.out.println("\nQual a sua idade?");
				idade = sc.nextInt();
			}

			switch (idade) {
			case 5, 6, 7:
				if (infantila < 3) {
					System.out.println("\n" + nome + " por você ter " + idade + " anos fará parte da categoria Infantil A.");
					infantila++;
					geral++;
					System.out.println("\ninfantila: " + infantila);
					System.out.println("\ninfantilb: " + infantilb);
					System.out.println("\njuvenila: " + juvenila);
					System.out.println("\njuvenilb: " + juvenilb);
					System.out.println("\ngeral: " + geral);
				}
				else {
					System.out.println("\nCategoria cheia!!");
				}
			break;

			case 8, 9, 10:
				if (infantilb < 3) {
					System.out.println("\n" + nome + " por você ter " + idade + " anos fará parte da categoria Infantil B.");
					infantilb++;
					geral++;
					System.out.println("\ninfantila: " + infantila);
					System.out.println("\ninfantilb: " + infantilb);
					System.out.println("\njuvenila: " + juvenila);
					System.out.println("\njuvenilb: " + juvenilb);
					System.out.println("\ngeral: " + geral);
				}
				else {
					System.out.println("\nCategoria cheia!!");
				}
			break;
			
			case 11, 12, 13:
				if (juvenila < 3) {
					System.out.println("\n" + nome + " por você ter " + idade + " anos fará parte da categoria Juvenil A.");
					juvenila++;
					geral++;
					System.out.println("\ninfantila: " + infantila);
					System.out.println("\ninfantilb: " + infantilb);
					System.out.println("\njuvenila: " + juvenila);
					System.out.println("\njuvenilb: " + juvenilb);
					System.out.println("\ngeral: " + geral);
				}
				else {
					System.out.println("\nCategoria cheia!!");
				}
			break;

			case 14, 15, 16, 17:
				if (juvenilb < 4) {
					System.out.println("\n" + nome + " por você ter " + idade + " anos fará parte da categoria Juvenil B.");
					juvenilb++;
					geral++;
					System.out.println("\ninfantila: " + infantila);
					System.out.println("\ninfantilb: " + infantilb);
					System.out.println("\njuvenila: " + juvenila);
					System.out.println("\njuvenilb: " + juvenilb);
					System.out.println("\ngeral: " + geral);
				}
				else {
					System.out.println("\nCategoria cheia!!");
				}
			break;
			
			default:
				System.out.println("\n" + nome + " por você ter " + idade + " anos fará parte da categoria Adulto.");
				geral++;
				System.out.println("\ninfantila: " + infantila);
				System.out.println("\ninfantilb: " + infantilb);
				System.out.println("\njuvenila: " + juvenila);
				System.out.println("\njuvenilb: " + juvenilb);
				System.out.println("\ngeral: " + geral);
		break;
			
			}

		}

		if (geral == 15) {
			System.out.println("\nCategorias complestas!!");
		}







	}

}
