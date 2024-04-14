package comandos_basicos;

import java.util.Scanner;

public class NomeIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int ano = 2022;
		int ano_que_nasceu;
		int idade;
		
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		
		System.out.println("Digite o ano que você nasceu: ");
		ano_que_nasceu = sc.nextInt();
		
		idade = (ano - ano_que_nasceu);
		
		System.out.printf(nome + ", você tem %d anos", idade);
		
		
		
	

	}

}
