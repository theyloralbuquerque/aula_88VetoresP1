package application;

import java.util.Locale;
import java.util.Scanner;

public class Program_MediaAltura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Deseja saber a altura de quantas pessoas? ");
		int np = sc.nextInt();
		
		double[] vect = new double[np];   // criação do vetor
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Digite a altura da %d° pessoa: ", i+1);
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i=0; i<vect.length; i++) {
			soma = vect[i] + soma;
		}
		
		System.out.printf("A soma das alturas digitadas é %.2f.", soma/vect.length);
		
		sc.close();

	}

}
