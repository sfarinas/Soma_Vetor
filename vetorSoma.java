package arranjos;

import java.util.Scanner;

public class vetorSoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0;
		double soma = 0;
		
		System.out.println("Quantos numero vc vai digitar : ");
		n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero : ");
			double num = sc.nextDouble();
			vect[i] = num;
			soma += num;
		}
		
		System.out.print("VALORES : ");
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + " | ");
		}
		
		System.out.printf("\nSOMA : " + soma);
		double media = soma / vect.length;
		System.out.printf("\nMEDIA : %.2f " , media);
		
		sc.close();
	}

}
