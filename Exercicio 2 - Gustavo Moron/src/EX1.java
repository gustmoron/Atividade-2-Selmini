// ---------------------------------------------------------------------------------------------------- //
// 												Exercicio 1.											//
// ---------------------------------------------------------------------------------------------------- //
//	Escreva um programa em Java que leia inicialmente as dimensões da matriz (número					//
//	de linhas e número de colunas) e, em seguida, faça o preenchimento da matriz com valores inteiros 	//
//	fornecidos pelo usuário. Após o preenchimento da matriz deverá ser lido via teclado um valor X e 	//
//	o seu programa deverá fazer a busca desse valor na matriz. Se o valor for encontrado deverá ser 	//
//	impresso no vídeo a sua localização (número da linha e número da coluna). Caso o valor não esteja 	//
//	na matriz deverá ser impresso no vídeo a mensagem: “X não se encontra na matriz”. 					//
// ---------------------------------------------------------------------------------------------------- //

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // - existe uma maneira de tornar o scanner teclado global?
		
		int[][] matriz = tamanhomatriz();
		preenchimentomatriz(matriz);

		System.out.println("Informe um valor para procurar dentro da matriz: ");
		int numeroprocurado = teclado.nextInt();

		localizador(numeroprocurado, matriz);
	}

// ---------------------------------------------------------------------------------------------------- //
//	Entrada de dados para a altura e largura (numeros de linhas e colunas) da matriz.					//
// ---------------------------------------------------------------------------------------------------- //	
	
	public static int[][] tamanhomatriz() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o numero de linhas da matriz:");
		int linhas = teclado.nextInt();
		
		System.out.print("Informe o numero de colunas da matriz: ");
		int colunas = teclado.nextInt();
		
		int[][] matriz = new int[linhas][colunas];
		return matriz;
	}

// ---------------------------------------------------------------------------------------------------- //
//	Entrada de dados para o preenchimento de numeros na matriz.																	//
// ---------------------------------------------------------------------------------------------------- //

	public static void preenchimentomatriz(int[][] m) {
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println("Informe o valor da linha " + (i + 1) + " e da coluna " + (j + 1) + ": ");
				m[i][j] = teclado.nextInt();
			}
		}
	}

// ---------------------------------------------------------------------------------------------------- //
//	Localizador do numero pedido.																		//
// ---------------------------------------------------------------------------------------------------- //

	public static void localizador(int numeroprocurado, int[][] matriz) {
		boolean validar = false;
		int[][] posicao = new int[1][2];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == numeroprocurado) {
					posicao[0][0] = i + 1;
					posicao[0][1] = j + 1;
					validar = true;
					break;
				}
			}
			
			if (validar) {
				break;
			}
		}

		if (validar) {
			System.out.println(numeroprocurado + " existe dentro da matriz e está na posição " +
		posicao[0][0] + ", " + posicao[0][1] + " da matriz.");
		
		} else {
			System.out.println(numeroprocurado + " não pode ser localizado dentro da matriz");
		}
	}
}
//---------------------------------------------------------------------------------------------------- 	//
//											END - Gustavo Moron											//
//---------------------------------------------------------------------------------------------------- 	//	
