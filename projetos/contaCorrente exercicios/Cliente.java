package sef.module4.activity;

public class Cliente {

	private String nomeCliente;
	private String sobreNome;
	private String cpf;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nomeCliente, String sobreNome, String cpf) {
		super();
		this.nomeCliente = nomeCliente;
		this.sobreNome = sobreNome;
		this.cpf = cpf;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
