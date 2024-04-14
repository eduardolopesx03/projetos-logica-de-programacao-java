package estudo;
import java.util.Scanner;
import java.util.Random;

public class AlgoritimoAmor {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		System.out.println("Qual a sua idade?: ");
		int idade = sc.nextInt();

		System.out.println("Escolher uma frase romântica: [1]"
				+"\nEscolher músicas aleatórias:  [2]");
		int esc = sc.nextInt();

		if (esc == 1) {
			System.out.println("De qual gênero musical?"
					+"\n        Sertanejo [1]"
							+"\n        MPB       [2]"
							+"\n        Rock      [3]"
							+"\n        Forró     [4]"
							+"\n        Jazz      [5]"
							+"\n        Reaggue   [6]");
			int resp = sc.nextInt();
			switch (resp) {

			case 1 :

				String [] sertanejo =  new String [7];
				sertanejo[0] ="\"A noite toda eu não sei, mas eu sei que te quero\" — Dengo, Luckhaos.";
				sertanejo[1] ="\"Mas amei, amei sozinho mas por dois\" — Ausência, Marília Mendonça.";
				sertanejo[2] ="\"Eu busco às vezes nos detalhes encontrar você\" — Amo noite e dia, Jorge e Mateus.";
				sertanejo[3] ="\"Quem ama dá valor e pensa no que faz, quando existe amor o coração não trai\" — Termina Comigo Antes, Gusttavo Lima.";
				sertanejo[4] ="\"Tem amores da vida que não são pra vida\" — A Maior Saudade, Henrique e Juliano.";
				sertanejo[5] ="\"Eu não vou negar que sou louco por você\" — É o Amor, Zezé Di Camargo e Luciano.";
				sertanejo[6] ="\"Tanto amor guardado tanto tempo a gente se prendendo à toa\" — Medo Bobo, Maiara e Maraisa.";
				Random r = new Random();
				int x = r.nextInt(sertanejo.length);
				System.out.println(sertanejo[x]);
				break;

			case 2 :

				String [] MPB =  new String [7];
				MPB[0] ="\"Te ver e não te querer é improvável, é impossível…\" — Te ver, Skank";
				MPB[1] ="\"Se decidir bater asa, me leva contigo para passear\" — Trevo, Anavitória";
				MPB[2] ="\"Você que me faz feliz, você que me faz cantar assim\" — Ainda bem, Marisa Monte";
				MPB[3] ="\"O que é um beijo, se eu posso ter o teu olhar?\" — Malemolência, Céu";
				MPB[4] ="\"Quando a gente gosta é claro que a gente cuida\" — Sozinho, Caetano Veloso";
				MPB[5] ="\"O teu abraço que me enlaça devagar enfeita todos os meus dias e horas\" — Singular, Anavitória";
				MPB[6] ="\"Meu riso é tão feliz contigo\" — Velha Infância, Os Tribalistas";
				Random r1 = new Random();
				int x1 = r1.nextInt(MPB.length);
				System.out.println(MPB[x1]);
				break;

			case 3 :

				String [] Rock =  new String [7];
				Rock[0] ="\"She’s got a smile that it seems to me reminds me of childhood memories\" — Sweet Child O’ Mine, Guns N’ Roses";
				Rock[1] ="\"Because, maybe, you’re gonna be the one that saves me, and after all, you’re my wonderwall\" — Wonderwall, Oasis";
				Rock[2] ="\"For love, we’ll give it a shot\" — Livin’ On a Prayer, Bon Jovi";
				Rock[3] ="\"When I find myself in times of trouble, Mother Mary comes to me, speaking words of wisdom\" — Let It Be, The Beatles";
				Rock[4] ="\"The only heaven I’ll be sent to is when I’m alone with you\" — Take Me To Church, Hozier";
				Rock[5] ="\"I could stay lost in this moment forever, every moment spent with you is a moment I treasure\" — I Don’t Want To Miss a Thing, Aerosmith";
				Rock[6] ="\"More than words is all you have to do to make it real, then you wouldn’t have to say that you love me, ‘cause I’d already know\" — More Than Words, Extreme";
				Random r2 = new Random();
				int x2 = r2.nextInt(Rock.length);
				System.out.println(Rock[x2]);
				break;

			case 4 :

				String [] Forró =  new String [7];
				Forró[0] ="\"Hoje me deu uma vontade louca, alucinada de me declarar pra você\" — Declaração de amor, Calcinha Preta.";
				Forró[1] ="\"Você sabe sem você eu não consigo nem respirar\" — Não Me Faça Chorar, Priscila Senna.";
				Forró[2] ="\"Todo tempo quanto houver pra mim é pouco pra dançar com meu benzinho numa sala de reboco\" — Numa Sala de reboco, Dominguinhos";
				Forró[3] ="\"Senti no peito o amor surgir Quando olhei pra você eu logo senti que o meu coração ia ser todo seu\" — Pra sempre, Limão com Mel";
				Forró[4] ="\"Eu to com medo de me apaixonar\" — Eu tenho medo, Zé Vaqueiro";
				Forró[5] ="\"Vou te dar carinho, vou te pegar no talento\" — Mete um block nele, João Gomes";
				Forró[6] ="\"Amor eu sempre estive sozinha, eu nunca me importei até lhe conhecer e agora você me escolhe, como deixá-lo sozinho?\" — Hoje é noite, Calcinha Preta";
				Random r3 = new Random();
				int x3 = r3.nextInt(Forró.length);
				System.out.println(Forró[x3]);
				break;

			case 5 :

				String [] Jazz =  new String [7];
				Jazz[0] ="\"And so all else above/I'm dreaming of the man I love\" — The man i love, Billie Holiday";
				Jazz[1] ="\"No greater love/Than what I feel for you\" — There is no greater love, Chet baker";
				Jazz[2] ="\"And I'd like to know it's more than love at first sight/I want a Sunday Kind of Love\" — Sunday Kind of love, Etta James";
				Jazz[3] ="\"It's very clear our love is here to stay/Not for a year, but ever and a day\" — Love is here to stay, Diana Krall e Tony Bennett";
				Jazz[4] ="\"I love the looks of you, the lure of you/The sweet of you, the pure of you\" — All of you, Helen merril";
				Jazz[5] ="\"So while there's music and moonlight and love and romance/Let's face the music and dance\" — Let's face the music and dance, Seth MacFarlane";
				Jazz[6] ="\"Two in love can make it, take my heart and please don't break it/Love was made for me and you\" — L-O-V-E, Nat king cole";
				Random r4 = new Random();
				int x4 = r4.nextInt(Jazz.length);
				System.out.println(Jazz[x4]);
				break;

			case 6 :

				String [] Reggae =  new String [7];
				Reggae[0] ="\"Quando o amor bate a porta, eu deixo o tempo dizer\" — Quando O Amor Bate A Porta, Chimarruts";
				Reggae[1] ="\"Nada me resta a não ser a vontade de te encontrar\" — Mensagem de Amor, Natiruts";
				Reggae[2] ="\"See I wanna love you, I wanna love and treat you Love and treat you right I wanna love you Every day and every night\" — Is This Love?, Bob Marley";
				Reggae[3] ="\"De repente rola uma canção, é o que me faz lembrar você\" — A Dois Passos do Paraíso, Planta e Raiz";
				Reggae[4] ="\"Chego, e sinto o gosto do teu beijo É muito mais do que desejo Me dá vontade de ficar\" — Quero ser feliz também, Natiruts";
				Reggae[5] ="\"Quero sorrir com você, quero estar com você, amor\" — Estar Com Você, Ponto De Equilibrio";
				Reggae[6] ="\"Love is a memory, and in these last days, when iniquity blazing, truth love speaks\" — True love, SOJA";
				Random r5 = new Random();
				int x5 = r5.nextInt(Reggae.length);
				System.out.println(Reggae[x5]);
				break;
				
			default : System.out.println("Opção inválida");

			}
		}
		else {

			if(idade >= 0 && idade <= 10) {

				String [] crianças =  new String [5];
				crianças[0] ="Baby Shark — Pinkfong";
				crianças[1] ="Cinco Patinhos — Xuxa";
				crianças[2] ="O sapo não lava o pé — Galinha Pintadinha";
				crianças[3] ="Dona aranha — Galinha Pintadinha";
				crianças[4] ="Eu sou o Gummy Bear — Gummy Bear";
				Random r = new Random();
				int x = 0;
				int y = 0;
				int z = 0;
				do {
					x = r.nextInt(crianças.length);
					y = r.nextInt(crianças.length);
					z = r.nextInt(crianças.length);
				}while(x == y || x == z || z == y);
				System.out.println(crianças[x]);
				System.out.println(crianças[y]);
				System.out.println(crianças[z]);

			}
			if(idade > 11 && idade <= 30) {

				String [] jovem =  new String [5];
				jovem[0] ="Look At Her Now — Selena Gomez";
				jovem[1] ="Backstabber — Kesha ";
				jovem[2] ="Numb — Linkin Park";
				jovem[3] ="Meu parceiro, olha o que essa mina fez — LUCKHAOS";
				jovem[4] ="Party Rock Anthem — LMFAO";
				Random r = new Random();
				int x = 0;
				int y = 0;
				int z = 0;
				do {
					x = r.nextInt(jovem.length);
					y = r.nextInt(jovem.length);
					z = r.nextInt(jovem.length);
				}while(x == y || x == z || z == y);
				System.out.println(jovem[x]);
				System.out.println(jovem[y]);
				System.out.println(jovem[z]);



			}
			if(idade > 30 && idade <= 59) {

				String [] adulto =  new String [5];
				adulto[0] ="B.Y.O.B — System of a Down";
				adulto[1] ="Hey Jude — The Beatles";
				adulto[2] ="Wonderwall — Oasis";
				adulto[3] ="Sweet child 'o mine — Guns and Roses";
				adulto[4] ="Burguesinha — Seu jorge";
				Random r = new Random();
				int x = 0;
				int y = 0;
				int z = 0;
				do {
					x = r.nextInt(adulto.length);
					y = r.nextInt(adulto.length);
					z = r.nextInt(adulto.length);
				}while(x == y || x == z || z == y);
				System.out.println(adulto[x]);
				System.out.println(adulto[y]);
				System.out.println(adulto[z]);

			}
			if(idade > 59) {

				String [] idoso =  new String [5];
				idoso[0] ="Como é grande o meu amor por você — Roberto Carlos";
				idoso[1] ="Homem de rua — Erasmo Carlos";
				idoso[2] ="Você é linda — Roberto carlos";
				idoso[3] ="Put your head on my shoulder — Paul Anka";
				idoso[4] ="Naquela Mesa — Nelson Gonçalves";
				Random r = new Random();
				int x = 0;
				int y = 0;
				int z = 0;
				do {
					x = r.nextInt(idoso.length);
					y = r.nextInt(idoso.length);
					z = r.nextInt(idoso.length);
				}while(x == y || x == z || z == y);
				System.out.println(idoso[x]);
				System.out.println(idoso[y]);
				System.out.println(idoso[z]);
			}
		}
	}
}











