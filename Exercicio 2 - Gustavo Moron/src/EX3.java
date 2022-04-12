// ---------------------------------------------------------------------------------------------------- //
// 												Exercicio 3.											//
// ---------------------------------------------------------------------------------------------------- //
//	Escreva um programa em Java para fazer a correção de uma prova contendo 10 questões de múltipla		// 
//	escolha (a, b, c, d ou e) de uma turma contendo X alunos (o número de alunos deverá ser 			//
//	informado pelo usuário da aplicação). O programa deverá gerar as respostas dos alunos 				//
//	de forma aleatória e as respostas deverão ser impressas no vídeo no formato de uma tabela 			//
//	(conforme apresentado durante as aulas). Em seguida, o programa deverá ler o gabarito da prova 		//
//	(a entrada deverá ser informada pelo usuário da aplicação). O seu programa deverá emitir um 		//
//	relatório contendo a nota de cada aluno e a sua situação (aprovado ou reprovado) considerando 		//
//	que a nota para aprovação deverá ser maior ou igual a 7.											//
// ---------------------------------------------------------------------------------------------------- //

import java.util.*;

public class EX3 {


	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de alunos na sala: ");
		int alunos = teclado.nextInt();
		
		System.out.println();
		
		char[][] prova = new char[alunos][10];
		char[] nota = new char[10];

		respostasalunos(prova);
		System.out.println();
		
		respostascorretas(nota);
		System.out.println();
		
		boletim(prova, nota);
		System.out.println();
	}

// ---------------------------------------------------------------------------------------------------- //
//	Preenchimento das respostas da prova (de modo aleatório)	
// ---------------------------------------------------------------------------------------------------- //
	
	public static void respostasalunos(char[][] prova) {
		Random aleatorio = new Random();

		int[] multiplaescolha = new int[10];
		
		for (int i = 0; i < prova.length; i++) {
			System.out.print("Aluno " + (i + 1) + ": ");
			
			for (int j = 0; j < prova[i].length; j++) {
				multiplaescolha[j] = aleatorio.nextInt(5);
				
				switch (multiplaescolha[j]) {
				case 0:
					prova[i][j] = 'a';
					break;
				case 1:
					prova[i][j] = 'b';
					break;
				case 2:
					prova[i][j] = 'c';
					break;
				case 3:
					prova[i][j] = 'd';
					break;
				case 4:
					prova[i][j] = 'e';
					break;
				}
			
				System.out.print(prova[i][j] + "\t");
				
			}
			
			System.out.println();
		}
	}

// ---------------------------------------------------------------------------------------------------- //	
// Respostas corretas da prova de multipla escolha.
// ---------------------------------------------------------------------------------------------------- //
	
	public static void respostascorretas(char[] respostascorretas) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe as respostas corretas: ");
		System.out.println();
		
		for (int i = 0; i < respostascorretas.length; i++) {
			
			System.out.print("Resposta " + (i + 1) + ": ");
			
			respostascorretas[i] = teclado.next().charAt(0);
			
			System.out.println();
		}
	}

// ---------------------------------------------------------------------------------------------------- //
//	Verificação se os alunos passaram na prova o não.	
// ---------------------------------------------------------------------------------------------------- //

	public static void boletim(char[][] prova, char[] nota) {
		int notareal = 0;
		for (int i = 0; i < prova.length; i++) {
			for (int j = 0; j < prova[i].length; j++) {
				if (nota[j] == prova[i][j]) {
					notareal++;
				}
			}
			
			System.out.println("Aluno " + (i + 1) + " Nota: " + notareal + "\t Passou: " 
			+ (notareal >= 7 ? "S" : "N"));
			
			notareal = 0;
		}
	}
}

//---------------------------------------------------------------------------------------------------- 	 //
// 									END - Gustavo Moron													//
//---------------------------------------------------------------------------------------------------- //