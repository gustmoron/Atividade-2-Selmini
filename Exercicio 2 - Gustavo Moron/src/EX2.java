// ---------------------------------------------------------------------------------------------------- //
// 												Exercicio 2.											//
// ---------------------------------------------------------------------------------------------------- //
// Escreva um programa em Java que preencha uma matriz quadrada de ordem 4 com                          //
// valores inteiros aleat�rios (gerados a partir da classe Random) e, em seguida, fa�a a impress�o dos  //
// elementos no formato de uma tabela (impress�o como apresentado durante as aulas). Ap�s a				//
// impress�o o seu programa dever� trocar os elementos armazenados no tri�ngulo superior da matriz 		//
// com os elementos armazenados no tri�ngulo inferior. Imprima novamente a matriz no v�deo para 		//
// confer�ncia. Veja o exemplo abaixo indicando como a troca dos elementos dever� ser realizada. 		//
// ---------------------------------------------------------------------------------------------------- //

import java.util.Random;

public class EX2 {
	
	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		
		prenchermatriz(matriz);
		printmatriz(matriz);
		inverterdiagonal(matriz);
		printmatriz(matriz);
	}

// ---------------------------------------------------------------------------------------------------- //
// Prenchimento da matriz:																				//
// ---------------------------------------------------------------------------------------------------- //
	
	public static void prenchermatriz(int[][] matriz) {
		Random aleatorio = new Random();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = aleatorio.nextInt(101);
			}
		}
	}
	
// ---------------------------------------------------------------------------------------------------- //
// Print da matriz no console com formata��o.															//
// ---------------------------------------------------------------------------------------------------- //
	
	public static void printmatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

// ---------------------------------------------------------------------------------------------------- //
// Inverter diagonal direita.																			//
// ---------------------------------------------------------------------------------------------------- //
	
	public static void inverterdiagonal(int[][] matriz) {
		int aux;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (i != j) {
					aux = matriz[i][j];
					matriz[i][j] = matriz[j][i];
					matriz[j][i] = aux;
				}
			}
		}
	}
}

//-------------------------------------------------------------------------------------------------------//
// 										END - Gustavo Moron												//
//-----------------------------------------------------------------------------------------------------//