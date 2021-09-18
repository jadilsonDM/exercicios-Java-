package sef.module4.activity;

import java.util.Scanner;

public class CarroPrncipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Carro carro01 = new Carro();
		
		
		
		
		Scanner tc = new Scanner(System.in);
		
		
		System.out.println("################################ CARROS JADILSON O MELHOR PREÇO É AQUI ######################");
		
		System.out.println("digite a marca do carro:");
		carro01.setMarca(tc.next());
		System.out.println("digite o codigo da cor do carro:");
		carro01.setColorCode(tc.next());
		System.out.println("digite o valor do carro:");
		carro01.setPrice(tc.nextDouble());
		
		
		carro01.exibirCarro();
		
		
		
		for (int i = 0; i < 1; i++) {
			System.out.println("\nVc Gostaria de testar a busina deste veiculo se sim tecle (1) se não tecle (2)\n");
			int escolha = tc.nextInt();
			
			
			if(escolha == 1) {
				carro01.setBuzinar(true);
				carro01.tocarBuzina();
				
				System.out.println("Obrigado por testar nosso carro!");
				
			}else if(escolha == 2) {
				carro01.setBuzinar(false);
				carro01.tocarBuzina();
				System.out.println("Obrigado por testar nosso carro!");
				
			}else {
				System.out.println("Opção invalida");
				
				i -= 1;
			}
			
		}
		
		
		
		
		
		tc.close();
		
	}

}
