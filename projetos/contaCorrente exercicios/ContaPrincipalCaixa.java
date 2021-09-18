package sef.module4.activity;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class ContaPrincipalCaixa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ContaCorrente> contaCorrente = new ArrayList<>();

		Cliente cliente01 = new Cliente("Jadilson", "Domingos", "76846598734");
		ContaCorrente conta01 = new ContaCorrente(101, 1577, cliente01);
		contaCorrente.add(conta01);

		Cliente cliente02 = new Cliente("Roseli", "Melo", "6578475867");
		ContaCorrente conta02 = new ContaCorrente(102, 2000.0, cliente02);
		contaCorrente.add(conta02);

		Cliente cliente03 = new Cliente("Jailma", "Maria", "362648684262");
		ContaCorrente conta03 = new ContaCorrente(103, 1988.0, cliente03);
		contaCorrente.add(conta03);

		JOptionPane.showMessageDialog(null, "------- Bem Vindo(a) ao Bancos Jad --------");
		int numeroConta = (Integer.parseInt(JOptionPane.showInputDialog("Qual o numero de sua Conta?")));

		if (numeroConta == 101) {

			JOptionPane.showMessageDialog(null, "Bem vindo! " + cliente01.getNomeCliente());
			int opcao = (Integer.parseInt(JOptionPane.showInputDialog(
					"Qual operação desejas fazer? digite (1)saque, (2)Extrato, (3)Deposito, (4)Transferência ou (5)Sair.")));

			if (opcao == 1) {

				double valor = (Double.parseDouble(JOptionPane.showInputDialog("qual o Valor do saque? ")));

				conta01.Sacar(valor);

			} else if (opcao == 2) {

				conta01.ExibirExtratos();

			} else if (opcao == 3) {

				double valor = (Double.parseDouble(JOptionPane.showInputDialog("qual o Valor do Deposito? ")));
				conta01.Depositar(valor);
			} else if (opcao == 4) {

				double valor = (Double.parseDouble(JOptionPane.showInputDialog("qual o Valor da transferência? ")));
				int contaSerTransferida = (Integer
						.parseInt(JOptionPane.showInputDialog("Qual o numero a receber transferencia?")));

				conta01.Tranferencia(valor, contaSerTransferida, contaCorrente);
			} else if (opcao == 5) {

				JOptionPane.showMessageDialog(null, "------- Encerrando Serviço! --------");

			}

			else if ((opcao < 1) && (opcao > 5)) {
				JOptionPane.showMessageDialog(null, "Atenção opçaõ Invalida!");
				JOptionPane.showMessageDialog(null, "------- Encerrando Serviço! --------");

			}

		} else if (numeroConta == 102) {

			JOptionPane.showMessageDialog(null, "Bem vindo! " + cliente02.getNomeCliente());
			int opcao = (Integer.parseInt(JOptionPane.showInputDialog(
					"Qual operação desejas fazer? digite (1)saque, (2)Extrato, (3)Deposito, (4)Transferência ou (5)Sair.")));

			if (opcao == 1) {

				double valor = (Double.parseDouble(JOptionPane.showInputDialog("qual o Valor do saque? ")));

				conta02.Sacar(valor);

			} else if (opcao == 2) {

				conta02.ExibirExtratos();

			} else if (opcao == 3) {

				double valor = (Double.parseDouble(JOptionPane.showInputDialog("qual o Valor do Deposito? ")));
				conta02.Depositar(valor);
			} else if (opcao == 4) {

				double valor = (Double.parseDouble(JOptionPane.showInputDialog("qual o Valor da transferência? ")));
				int contaSerTransferida = (Integer
						.parseInt(JOptionPane.showInputDialog("Qual o numero a receber transferencia?")));

				conta02.Tranferencia(valor, contaSerTransferida, contaCorrente);
			} else if (opcao == 5) {

				JOptionPane.showMessageDialog(null, "------- Encerrando Serviço! --------");

			}

			else if ((opcao < 1) && (opcao > 5)) {
				JOptionPane.showMessageDialog(null, "Atenção opçaõ Invalida!");
				JOptionPane.showMessageDialog(null, "------- Encerrando Serviço! --------");

			}

		} else if (numeroConta == 103) {

			JOptionPane.showMessageDialog(null, "Bem vindo! " + cliente03.getNomeCliente());
			int opcao = (Integer.parseInt(JOptionPane.showInputDialog(
					"Qual operação desejas fazer? digite (1)saque, (2)Extrato, (3)Deposito, (4)Transferência ou (5)Sair.")));

			if (opcao == 1) {

				double valor = (Double.parseDouble(JOptionPane.showInputDialog("qual o Valor do saque? ")));

				conta03.Sacar(valor);

			} else if (opcao == 2) {

				conta03.ExibirExtratos();

			} else if (opcao == 3) {

				double valor = (Double.parseDouble(JOptionPane.showInputDialog("qual o Valor do Deposito? ")));
				conta03.Depositar(valor);
			} else if (opcao == 4) {

				double valor = (Double.parseDouble(JOptionPane.showInputDialog("qual o Valor da transferência? ")));
				int contaSerTransferida = (Integer
						.parseInt(JOptionPane.showInputDialog("Qual o numero a receber transferencia?")));

				conta03.Tranferencia(valor, contaSerTransferida, contaCorrente);
			} else if (opcao == 5) {

				JOptionPane.showMessageDialog(null, "------- Encerrando Serviço! --------");

			}

			else if ((opcao < 1) && (opcao > 5)) {
				JOptionPane.showMessageDialog(null, "Atenção opçaõ Invalida!");
				JOptionPane.showMessageDialog(null, "------- Encerrando Serviço! --------");

			}

		}

		JOptionPane.showMessageDialog(null, "------- Obrigado por usar nosso Bamco --------");

	}
}
