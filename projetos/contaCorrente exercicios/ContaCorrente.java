package sef.module4.activity;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ContaCorrente {

	private int numeroConta;
	private String nome;
	private LocalDate atualData;
	private double saldo;
	private Cliente cliente;

	public ContaCorrente(int numeroConta, double saldo, Cliente cliente) {
		super();
		this.numeroConta = numeroConta;
		this.setNome(cliente.getNomeCliente() + "" + cliente.getSobreNome());
		this.setAtualData(LocalDate.now());
		this.saldo = saldo;

		;
	}

	public void Sacar(double quantia) {

		JOptionPane.showMessageDialog(null, "\nIniciando Saque ....\n");
		if (quantia <= getSaldo()) {
			JOptionPane.showMessageDialog(null, "Sacando R$" + quantia);
			setSaldo(getSaldo() - quantia);
			JOptionPane.showMessageDialog(null, "Foi sacado a quantia de R$" + quantia);
			JOptionPane.showMessageDialog(null, "Seu novo saldo é R$" + getSaldo());
			JOptionPane.showMessageDialog(null, "------- Encerrando trnzação! --------");

		} else {
			JOptionPane.showMessageDialog(null, "Sacando  R$" + quantia);
			JOptionPane.showMessageDialog(null, "Saque indisponivel para a quantia de R$" + quantia);
			JOptionPane.showMessageDialog(null, "------- Encerrando trnzação! --------");


		}

	}

	public void ExibirExtratos() {

		JOptionPane.showMessageDialog(null, "extrato: Cliente: " + getNome() + " | Numero da Conta: "
				+ getNumeroConta() + " | Saldo total: " + getSaldo());
		JOptionPane.showMessageDialog(null, "------- Encerrando tranzação! --------");


	}

	public void Depositar(double quantia) {

		JOptionPane.showMessageDialog(null, "\nIniciando Deposito ....\n");
		JOptionPane.showMessageDialog(null, "Serar depositada a quantia de R$" + quantia);
		setSaldo(getSaldo() + quantia);
		JOptionPane.showMessageDialog(null,
				"Foram depositados o a quantia de R$" + quantia + ", e seu saldo atual é de R$" + saldo);
		JOptionPane.showMessageDialog(null, "------- Encerrando trnzação! --------");


	}

	public void Tranferencia(double quantia, int numeroDaConta, ArrayList<ContaCorrente> contaCorrentes) {

		boolean existeConta = false;
		
		JOptionPane.showMessageDialog(null, "\nIniciando Trasferência ....\n");
		JOptionPane.showMessageDialog(null,
				"Sera transferido a quantia de R$" + quantia + "Para a conta: " + numeroDaConta);

		

		if (quantia > getSaldo()) {

			JOptionPane.showMessageDialog(null, "Saldo insuficiente! seu saldo é de: R$" + getSaldo());
			JOptionPane.showMessageDialog(null, "------- Encerrando trnzação! --------");

            
		} else {

			for (int i = 0; i < contaCorrentes.size(); i++) {

				if (numeroDaConta == contaCorrentes.get(i).getNumeroConta()) {
					setSaldo(getSaldo() - quantia);
					contaCorrentes.get(i).setSaldo(contaCorrentes.get(i).getSaldo() + quantia);
					JOptionPane.showMessageDialog(null,
							"Transferencia Comcluida Seu novo Saldo é de : R$" + getSaldo());
					JOptionPane.showMessageDialog(null, "------- Encerrando trnzação! --------");

				  existeConta = true;
				}

			}
			if (!existeConta) {

				JOptionPane.showMessageDialog(null, "Desculpa a conta não existe, seu  Saldo é de : R$" + getSaldo());
				
				JOptionPane.showMessageDialog(null, "------- Encerrando trnzação! --------");

			}
           
		}

	}

	public ContaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public LocalDate getAtualData() {
		return atualData;
	}

	public void setAtualData(LocalDate atualData) {
		this.atualData = atualData;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
