package bytebank;

import java.util.Scanner;

public class CriarConta {
	public static void main(String[] args) {
		/*
		 * Conta conta = new Conta(); Scanner leitor = new Scanner(System.in);
		 * 
		 * System.out.println("Digite o titular: ");
		 * conta.setTitular(leitor.nextLine()); System.out.println(conta.getTitular());
		 * 
		 * conta.setSaldo(100.0);
		 * 
		 * Conta contaNova = conta; System.out.println(contaNova.getSaldo());
		 * 
		 * conta.setSaldo(contaNova.getSaldo() + 100);
		 * System.out.println(contaNova.getSaldo());
		 * 
		 * System.out.println(conta); System.out.println(contaNova);
		 */
		Conta conta1 = new Conta(1000.0);
		Conta conta2 = new Conta(2000.0);
		Scanner leitor = new Scanner(System.in);

		System.out.println("Quanto deseja transferir?");
		Double valor = leitor.nextDouble();
		conta1.transferir(conta2, valor);
		System.out.println("Conta 1: " + conta1);
		System.out.println("Conta 2: " + conta2);
	}
}
