package controller;

public class ThreadMatriz extends Thread{
	
	private int M[][];
	private int i;

	public ThreadMatriz(int M [][], int i) {
		this.M = M;
		this.i = i;
	}
	
	public void run() {
		SomaMatriz();
	}
	
	//Soma cada linha do vetor
	public void SomaMatriz() {
		int y, soma = 0;
		for(y = 0; y < 5; y++) {
				soma += M[i][y];
			}
		System.out.println("Linha: " + i + " soma: " + soma);
		}
	}