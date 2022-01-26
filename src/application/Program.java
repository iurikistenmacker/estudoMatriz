package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero de linhas: ");
		int M = sc.nextInt();
		System.out.print("Numero de colunas:");
		int N = sc.nextInt();
		
		int[][] mat = new int[M][N];
		
		System.out.println("Digite os elementos da matriz: ");
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("-----------------------------------");
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(mat[i][j] + "     ");
			}
			System.out.println();
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		System.out.println();
		
		System.out.print("Digite um elemento da matriz: ");
		int X = sc.nextInt();
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(mat[i][j] == X) {
					System.out.println("Position: " + i + " , " + j);
					if(i == 0 && j == 0) {
						System.out.println("Right: " + mat[i][j+1]);
						System.out.println("Down: " + mat[i+1][j]);
					}
					else if(i == 0 && j == N-1) {
						System.out.println("Left: " + mat[i][j-1]);
						System.out.println("Down: " + mat[i+1][j]);
					}
					else if(i == 0) {
						System.out.println("Right: " + mat[i][j+1]);
						System.out.println("Down: " + mat[i+1][j]);
						System.out.println("Left: " + mat[i][j-1]);
					}
					else if(i == M-1 && j == 0) {
						System.out.println("Right: " + mat[i][j+1]);
						System.out.println("Up: " + mat[i-1][j]);
					}
					else if(i == M-1 && j == N-1) {
						System.out.println("Left: " + mat[i][j-1]);
						System.out.println("Up: " + mat[i-1][j]);
					}
					else if(i == M-1) {
						System.out.println("Right: " + mat[i][j+1]);
						System.out.println("Up: " + mat[i-1][j]);
						System.out.println("Left: " + mat[i][j-1]);
					}
					else if(j == 0) {
						System.out.println("Right: " + mat[i][j+1]);
						System.out.println("Down: " + mat[i+1][j]);
						System.out.println("Up:  " + mat[i-1][j]);
					}
					else if(j == N-1) {
						System.out.println("Left: " + mat[i][j-1]);
						System.out.println("Down: " + mat[i+1][j]);
						System.out.println("Up: " + mat[i-1][j]);
					}
					else {
						System.out.println("Right: " + mat[i][j+1]);
						System.out.println("Down: " + mat[i+1][j]);
						System.out.println("Up: " + mat[i-1][j]);
						System.out.println("Left: " + mat[i][j-1]);
					}
				}
			}
		}
		
		
		
		
		
		
		
		
		sc.close();

	}

}
