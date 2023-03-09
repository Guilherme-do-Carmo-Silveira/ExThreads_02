package view;

import java.util.Random;

import controller.ThreadMatriz;

public class main {

	public static void main(String[] args) {
		
		Random Gerador = new Random();
		int M [][] = new int [3][5];
		
		for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 5; y++) {
				M [x][y] = Gerador.nextInt(20);
			}
		}
		
		for(int x = 0; x < 3; x++){
            for(int y = 0; y < 5; y++) {
                System.out.print(M[x][y] + " ");
            }
            System.out.print("\n");
        }
		
		for(int i = 0; i < 3; i++) {
			Thread ThreadMatriz = new ThreadMatriz (M, i);
			ThreadMatriz.start();
		}
	}

}
