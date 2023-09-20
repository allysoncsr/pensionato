package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vetor = new Aluguel[10]; // 1º informado o tamanho do vetor
		
		System.out.println("Quantos quartos quartos deseja alugar? ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.println();
			System.out.println("ALUGUEL #" + i + ":"); // aqui irá ficar sendo informado o numero do Aluguel
			System.out.print("Nome: "); //nome
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: "); // email
			String email = sc.nextLine();
			System.out.print("Qual quarto deseja: "); //solicita qual quarto deseja alugar
			int numeroQuarto = sc.nextInt(); // criando então uma variável numeroQuarto
			
			vetor[numeroQuarto] = new Aluguel(nome, email); // a posição do vetor será o numero do quarto
		}
		
		/*
		 * abaixo está um for que vai percorrer todo o vetor onde dentro
		 * terá uma condição de  se no vetor a posiçao[i] for diferente de null
		 * printar então a mensagem abaixo
		 */
		
		System.out.println();
		System.out.println("QUARTOS OCUPADOS");
		for (int i=0; i<10; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}
		
		
		
		sc.close();
	}

}
