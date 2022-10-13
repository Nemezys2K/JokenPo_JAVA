import java.util.Scanner;

public class JokenPoo {
	// Placar
	private static int placarJogador = 0;
	private static int placarComputador = 0;
	// Escolhas
	// 1 = Pedra, 2 = Papel, 3 = Tesoura feita pelo jogador
	private static int escolhaJogador;
	private static int escolhaComputador;
	//Varieavel que demonstra valor de continuar ou parar
	private static int numero;
	// Método Principal
	public static void main(String[] args) {
		int reinicia = 0;
		Scanner insere = new Scanner(System.in);
		System.out.println(":::Bem vindo ao jogo :::");
		System.out.println("::: Para começar digite :::");
		System.out.println("(1) SIM (0)Não");
		reinicia = insere.nextInt();
		//Reinicia o jogo
		while(reinicia == 1) {
			insereNumero();
			System.out.println("Deseja jogar novamente?");
			System.out.println("(1) SIM (0)Não");
			reinicia = insere.nextInt();
		}
		}
		//Confirma se deseja reiniciar
	public static void insereNumero() {
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 1;++i) {
			System.out.println("::: Confrime Por Favor! (1)SIM :::");
			numero = input.nextInt();
			
		}
	// Quantidade de radadas / jogadas
	int rodadas = 0;
	// Interface do jogo
	// Perguntar para o jogador a quantidade de rodadas
	System.out.println(":::::::::::::::");
	System.out.println("::: JOKENPO :::");
	System.out.println(":::::::::::::::");
	//Pergunta quantas rodadas ele deseja
	System.out.println("Insira a quantidade de rodadas: ");
	//Digitar a quantidade
	rodadas = input.nextInt();
	//Loop de rodadas
	for(int i = 1; i <= rodadas; ++i) {
			//Escolha do computador e aleatória com codigo Math.random que importa da biblioteca do JAVA
			escolhaComputador = (int) (Math.random()*3)+1;
			rotuloEscolhaJogador();
			//Escolha do jogador onde ele digita
			escolhaJogador = input.nextInt();
			//Função para verificar o resultado
			verificaResultado();
			//Função para exibir o placar final e mostrar o vencedor
			exibePlacar();
			}
			
	}
	
		private static void rotuloEscolhaJogador() {
			// TODO Auto-generated method stub
			System.out.println("::: Hora de Jogar - Escolha: ");
			System.out.println("::: 1 - Pedra - (@):::");
			System.out.println("::: 2 - Papel - |_| :::");
			System.out.println("::: 3 - Tesoura - 8<:::");
			System.out.println("::: Escolha uma opção: ");
		}
		//Verifica condi��o de vit�ria e derrota
		private static void verificaResultado() {
			// TODO Auto-generated method stub
			//Usar o if para comparar as ecolhas
			if (escolhaJogador == 1 && escolhaComputador == 1) {
				System.out.println("--- Empatou! ---");
				System.out.println("\n");
				
		      }
			// Else if para continuar comparando se jogador vence ou maquina ou empata
		      else if (escolhaJogador == 1 && escolhaComputador == 2) {
		    	  placarComputador = placarComputador + 1;
		    	  System.out.println("--- Ponto para Computador ---");
		    	  System.out.println("\n");
		    	  
		      }
			// Else if para continuar comparando se jogador vence ou maquina ou empata
		      else if (escolhaJogador == 1 && escolhaComputador == 3) {
		    	  placarJogador = placarJogador +1;
		    	  System.out.println("--- Ponto para Jogador ---");
		    	  System.out.println("\n");
		    	  
		      }
			// Else if para continuar comparando se jogador vence ou maquina ou empata
		      else if (escolhaJogador == 2 && escolhaComputador == 1) {
		    	  placarJogador = placarJogador +1;
		    	  System.out.println("--- Ponto para Jogador ---");
		    	  System.out.println("\n");
		    	  
		      }
			// Else if para continuar comparando se jogador vence ou maquina ou empata
		      else if (escolhaJogador == 2 && escolhaComputador == 2) {
		    	  System.out.println("--- Empatou! ---");
		    	  System.out.println("\n");
		      }
			// Else if para continuar comparando se jogador vence ou maquina ou empata
		      else if (escolhaJogador == 2 && escolhaComputador == 3) {
		    	  placarComputador = placarComputador + 1;
		    	  System.out.println("--- Ponto para Computador ---");
		    	  System.out.println("\n");
		    	  
		      }
			// Else if para continuar comparando se jogador vence ou maquina ou empata
		      else if (escolhaJogador == 3 && escolhaComputador == 1) {
		    	  placarComputador = placarComputador + 1;
		    	  System.out.println("--- Ponto para Computador ---");
		    	  System.out.println("\n");
		    	 
		      }
			// Else if para continuar comparando se jogador vence ou maquina ou empata
		      else if (escolhaJogador == 3 && escolhaComputador == 2) {
		    	  placarJogador = placarJogador +1;
		    	  System.out.println("--- Ponto para Jogador ---");
		    	  System.out.println("\n");
		    	  
		      }
			// Else if para continuar comparando se jogador vence ou maquina ou empata
		      else if (escolhaJogador == 3 && escolhaComputador == 3) {
		    	  System.out.println("--- Empatou! ---");
		    	  System.out.println("\n");
		    	// Else if para continuar comparando se jogador vence ou maquina ou empata
		      }else if(escolhaJogador >= 4){
		    	  System.out.println("\n");
		    	  System.out.println("Invalido");
		      }
		    }
		
				
		//Exibe o resultado do placar
		private static void exibePlacar() {
			// TODO Auto-generated method stub
			// Demonstra a somatoria de pontos do jogador e deretmina que ele venceu
			if(placarJogador > placarComputador) {
				System.out.println("\n");
				System.out.println("--> O player venceu! - ;)");
				System.out.println("\n");
				// Demonstra a somatoria de pontos do computador e deretmina que ele venceu
			}else if(placarComputador > placarJogador){
				System.out.println("\n");
				System.out.println("--> A CPU venceu! - :(");
				System.out.println("\n");
			}else{
				// Demonstra a somatoria de pontos de ambos e declara empate
				System.out.println("\n");
				System.out.println("--> Empate total... - :0");
				System.out.println("\n");
			}
			}
		}

