package estudo;

import java.util.Scanner;

public class Urna_Eletronica {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int idade;

		System.out.println("Qual a sua idade?");
		idade = sc.nextInt();

		if (idade >= 18 && idade <= 69) {
			System.out.println("\n--- Você está incluso na categoria de pessoas que tem que votar obrigatoriamente ---\n");
			System.out.println("Digite o número do candidato à presidência que você deseja votar: ");
			System.out.println("(12) Ciro Gomes"
					+ "\n(27) Constituinte Eymael"
					+ "\n(30) Felipe D'Ávila"
					+ "\n(22) Jair Bolsonaro"
					+ "\n(80) Léo Péricles"
					+ "\n(13) Lula"
					+ "\n(14) Padre Kelmon"
					+ "\n(15) Simone Tebet"
					+ "\n(21) Sofia Manzano"
					+ "\n(44) Soraya Thronicke"
					+ "\n(16) Vera Lúcia"
					+ "\n(Branco) Voto branco"
					+ "\nObs: qualquer outro valor que não seja o numero de nenhum candidato será automaticamente atribuido a voto nulo.");
			String candidato = sc.next();
			switch (candidato){
			case "12":
				System.out.println("\n12 - Ciro Gomes (PDT)");
				System.out.println("Confirme? [S/N]");
				String confirmacao = sc.next();
				if (confirmacao.equalsIgnoreCase("S")) {
					System.out.println("\nVocê votou no candidato Ciro Gomes!");
				}
				else {
					System.out.println("\nVoto cancelado");
				}
				break;
			case "27":
				System.out.println("\n27 - Constituinte Eymael (DC)");
				System.out.println("Confirme? [S/N]");
				String confirmacao1 = sc.next();
				if (confirmacao1.equalsIgnoreCase("S")) {
					System.out.println("\nVocê votou no candidato Constituinte Eymael!");
				}
				else {
					System.out.println("\nVoto cancelado");
				}
				break;
			case "30":
				System.out.println("\n30 - Felipe D'Ávila (Novo)");
				System.out.println("Confirme? [S/N]");
				String confirmacao2 = sc.next();
				if (confirmacao2.equalsIgnoreCase("S")) {
					System.out.println("\nVocê votou no candidato Felipe D'Ávila!");
				}
				else {
					System.out.println("\nVoto cancelado");
				}
				break;
			case "22":
				System.out.println("\n22 - Jair Bolsonaro (PL)");
				System.out.println("Confirme? [S/N]");
				String confirmacao3 = sc.next();
				if (confirmacao3.equalsIgnoreCase("S")) {
					System.out.println("\nVocê votou no candidato Jair Bolsonaro!");
				}
				else {
					System.out.println("\nVoto cancelado");
				}
				break;
			case "80":
				System.out.println("\n80 - Léo Péricles (UP)");
				System.out.println("Confirme? [S/N]");
				String confirmacao4 = sc.next();
				if (confirmacao4.equalsIgnoreCase("S")) {
					System.out.println("\nVocê votou no candidato Léo Péricles!");
				}
				else {
					System.out.println("\nVoto cancelado");
				}
				break;
			case "13":
				System.out.println("\n13 - Lula (PT)");
				System.out.println("Confirme? [S/N]");
				String confirmacao5 = sc.next();
				if (confirmacao5.equalsIgnoreCase("S")) {
					System.out.println("\nVocê votou no candidato Lula!");
				}
				else {
					System.out.println("\nVoto cancelado");
				}
				break;
			case "14":
				System.out.println("\n14 - Padre Kelmon (PTB)");
				System.out.println("Confirme? [S/N]");
				String confirmacao6 = sc.next();
				if (confirmacao6.equalsIgnoreCase("S")) {
					System.out.println("\nVocê votou no candidato Padre Kelmon!");
				}
				else {
					System.out.println("\nVoto cancelado");
				}
				break;
			case "15":
				System.out.println("\n15 - Simone Tebet (MDB)");
				System.out.println("Confirme? [S/N]");
				String confirmacao7 = sc.next();
				if (confirmacao7.equalsIgnoreCase("S")) {
					System.out.println("\nVocê votou na candidata Simone Tebet!");
				}
				else {
					System.out.println("\nVoto cancelado");
				}
				break;
			case "21":
				System.out.println("\n21 - Sofia Manzano (PCB)");
				System.out.println("Confirme? [S/N]");
				String confirmacao8 = sc.next();
				if (confirmacao8.equalsIgnoreCase("S")) {
					System.out.println("\nVocê votou na candidata Sofia Manzano!");
				}
				else {
					System.out.println("\nVoto cancelado");
				}
				break;
			case "44":
				System.out.println("\n44 - Soraya Thronicke (União Brasil)");
				System.out.println("Confirme? [S/N]");
				String confirmacao9 = sc.next();
				if (confirmacao9.equalsIgnoreCase("S")) {
					System.out.println("\nVocê votou na candidata Soraya Thronicke!");
				}
				else {
					System.out.println("\nVoto cancelado");
				}
				break;
			case "16":
				System.out.println("\n16 - Vera Lúcia (PSTU)");
				System.out.println("Confirme? [S/N]");
				String confirmacao10 = sc.next();
				if (confirmacao10.equalsIgnoreCase("S")) {
					System.out.println("\nVocê votou na candidata Vera Lúcia!");
				}
				else {
					System.out.println("\nVoto cancelado");
				}
				break;
			case "Branco":
				System.out.println("\nVoto branco? [S/N]");
				String confirmacao11 = sc.next();
				if (confirmacao11.equalsIgnoreCase("S")) {
					System.out.println("\nVocê votou branco!");
				}
				else {
					System.out.println("\nVoto cancelado");
				}
				break;
			default:
				System.out.println("\nVocê votou nulo!");
			}
		}
		
		
		
		
		if (idade == 16 || idade == 17 || idade >= 70) {
			System.out.println("\n--- Você está incluso na categoria de pessoas que o voto é opcional. ---\nVocê deseja votar? [S/N]");
			String voto = sc.next();
			if (voto.equalsIgnoreCase("S")) {
				System.out.println("\nDigite o número do candidato à presidência que você deseja votar: ");
				System.out.println("(12) Ciro Gomes"
						+ "\n(27) Constituinte Eymael"
						+ "\n(30) Felipe D'Ávila"
						+ "\n(22) Jair Bolsonaro"
						+ "\n(80) Léo Péricles"
						+ "\n(13) Lula"
						+ "\n(14) Padre Kelmon"
						+ "\n(15) Simone Tebet"
						+ "\n(21) Sofia Manzano"
						+ "\n(44) Soraya Thronicke"
						+ "\n(16) Vera Lúcia"
						+ "\n(Branco) Voto branco"
						+ "\nObs: qualquer outro valor que não seja o numero de nenhum candidato será automaticamente atribuido a voto nulo.");
				String candidato1 = sc.next();
				switch (candidato1){
				case "12":
					System.out.println("\n12 - Ciro Gomes (PDT)");
					System.out.println("Confirme? [S/N]");
					String confirmacao = sc.next();
					if (confirmacao.equalsIgnoreCase("S")) {
						System.out.println("\nVocê votou no candidato Ciro Gomes!");
					}
					else {
						System.out.println("\nVoto cancelado");
					}
					break;
				case "27":
					System.out.println("\n27 - Constituinte Eymael (DC)");
					System.out.println("Confirme? [S/N]");
					String confirmacao1 = sc.next();
					if (confirmacao1.equalsIgnoreCase("S")) {
						System.out.println("\nVocê votou no candidato Constituinte Eymael!");
					}
					else {
						System.out.println("\nVoto cancelado");
					}
					break;
				case "30":
					System.out.println("\n30 - Felipe D'Ávila (Novo)");
					System.out.println("Confirme? [S/N]");
					String confirmacao2 = sc.next();
					if (confirmacao2.equalsIgnoreCase("S")) {
						System.out.println("\nVocê votou no candidato Felipe D'Ávila!");
					}
					else {
						System.out.println("\nVoto cancelado");
					}
					break;
				case "22":
					System.out.println("\n22 - Jair Bolsonaro (PL)");
					System.out.println("Confirme? [S/N]");
					String confirmacao3 = sc.next();
					if (confirmacao3.equalsIgnoreCase("S")) {
						System.out.println("\nVocê votou no candidato Jair Bolsonaro!");
					}
					else {
						System.out.println("\nVoto cancelado");
					}
					break;
				case "80":
					System.out.println("\n80 - Léo Péricles (UP)");
					System.out.println("Confirme? [S/N]");
					String confirmacao4 = sc.next();
					if (confirmacao4.equalsIgnoreCase("S")) {
						System.out.println("\nVocê votou no candidato Léo Péricles!");
					}
					else {
						System.out.println("\nVoto cancelado");
					}
					break;
				case "13":
					System.out.println("\n13 - Lula (PT)");
					System.out.println("Confirme? [S/N]");
					String confirmacao5 = sc.next();
					if (confirmacao5.equalsIgnoreCase("S")) {
						System.out.println("\nVocê votou no candidato Lula!");
					}
					else {
						System.out.println("\nVoto cancelado");
					}
					break;
				case "14":
					System.out.println("\n14 - Padre Kelmon (PTB)");
					System.out.println("Confirme? [S/N]");
					String confirmacao6 = sc.next();
					if (confirmacao6.equalsIgnoreCase("S")) {
						System.out.println("\nVocê votou no candidato Padre Kelmon!");
					}
					else {
						System.out.println("\nVoto cancelado");
					}
					break;
				case "15":
					System.out.println("\n15 - Simone Tebet (MDB)");
					System.out.println("Confirme? [S/N]");
					String confirmacao7 = sc.next();
					if (confirmacao7.equalsIgnoreCase("S")) {
						System.out.println("\nVocê votou na candidata Simone Tebet!");
					}
					else {
						System.out.println("\nVoto cancelado");
					}
					break;
				case "21":
					System.out.println("\n21 - Sofia Manzano (PCB)");
					System.out.println("Confirme? [S/N]");
					String confirmacao8 = sc.next();
					if (confirmacao8.equalsIgnoreCase("S")) {
						System.out.println("\nVocê votou na candidata Sofia Manzano!");
					}
					else {
						System.out.println("\nVoto cancelado");
					}
					break;
				case "44":
					System.out.println("\n44 - Soraya Thronicke (União Brasil)");
					System.out.println("Confirme? [S/N]");
					String confirmacao9 = sc.next();
					if (confirmacao9.equalsIgnoreCase("S")) {
						System.out.println("\nVocê votou na candidata Soraya Thronicke!");
					}
					else {
						System.out.println("\nVoto cancelado");
					}
					break;
				case "16":
					System.out.println("\n16 - Vera Lúcia (PSTU)");
					System.out.println("Confirme? [S/N]");
					String confirmacao10 = sc.next();
					if (confirmacao10.equalsIgnoreCase("S")) {
						System.out.println("\nVocê votou na candidata Vera Lúcia!");
					}
					else {
						System.out.println("\nVoto cancelado");
					}
					break;
				case "Branco":
					System.out.println("\nVoto branco? [S/N]");
					String confirmacao11 = sc.next();
					if (confirmacao11.equalsIgnoreCase("S")) {
						System.out.println("\nVocê votou branco!");
					}
					else {
						System.out.println("\nVoto cancelado");
					}
					break;
				default:
					System.out.println("\nVocê votou nulo!");
				}

			}
			else {
				System.out.println("\nFim de operação");
			}

		}
		
		int idade_complementar = 16 - idade;
		if (idade < 16) {
			System.out.println("\nVocê não está apto para votar.");
			System.out.println("tente novamente daqui a " + idade_complementar + "anos ou mais");
		}
		
	}

}


