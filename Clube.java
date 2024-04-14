package estudo;

import java.util.Scanner;

public class Clube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade,j=1,a=1,b=1,a2=1,b2=1,adu=1;
		do {
			System.out.println("Informe o nome do jogador: ");
			nome=sc.next();
			System.out.println("\nInforme a idade: ");
			idade=sc.nextInt();
			if(idade<=4) {
				System.out.println("Idade Insuficiente!!!");
			}
			else {
				j++;
				switch(idade) {
					case 5: case 6: case 7: 
						if(a<=3) {
							a++;
							System.out.println("-----------------------------------"
									+"\nFaixa Etária ------------ Categoria"
									+"\n-----------------------------------"
									+"\nNome: "+nome
									+"\nIdade: "+idade
									+"\nCategoria: Infantil A");break;
						}
						else {
							System.out.println("Categoria Cheia");
							j--;
						}break;
					case 8: case 9: case 10:
						if(b<=3) {
							b++;
							System.out.println("-----------------------------------"
									+"\nFaixa Etária ------------ Categoria"
									+"\n-----------------------------------"
									+"\nNome: "+nome
									+"\nIdade: "+idade
									+"\nCategoria: Infantil B");break;
						}
						else {
							System.out.println("Categoria Cheia");
							j--;
						}break;
					case 11: case 12: case 13:
						if(a2<=3) {
							a2++;
							System.out.println("-----------------------------------"
									+"\nFaixa Etária ------------ Categoria"
									+"\n-----------------------------------"
									+"\nNome: "+nome
									+"\nIdade: "+idade
									+"\nCategoria: Juvenil A");break;
					}
						else {
							System.out.println("Categoria Cheia");
							j--;
						}break;
					case 14: case 15: case 16:case 17:
						if(b2<=3) {
							b2++;
							System.out.println("-----------------------------------"
									+"\nFaixa Etária ------------ Categoria"
									+"\n-----------------------------------"
									+"\nNome: "+nome
									+"\nIdade: "+idade
									+"\nCategoria: Juvenil B");break;
						}
						else {
							System.out.println("Categoria Cheia");
							j--;
						}break;
					default:
						if(adu<=3) {
							adu++;
							System.out.println("-----------------------------------"
									+"\nFaixa Etária ------------ Categoria"
									+"\n-----------------------------------"
									+"\nNome: "+nome
									+"\nIdade: "+idade
									+"\nCategoria: Adulto");break;
						}
						else {
							System.out.println("Categoria Cheia");
							j--;
						}break;
				}
		}
			}while(j<15);
		System.out.println("\nNumero de jogadores completo!!!");
		}
	}
