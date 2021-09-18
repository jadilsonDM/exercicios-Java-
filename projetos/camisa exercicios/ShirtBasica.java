package atv.jad;

public class ShirtBasica {

	private String descricao;
	private int codigoDaCor;
	private String Cor;
	private double preco;
	private char tamanho;

	public ShirtBasica() {
		super();
	}

	public ShirtBasica(String descricao, int codigoDaCor, String cor, double preço, char tamanho) {
		super();
		this.descricao = descricao;
		this.codigoDaCor = codigoDaCor;
		this.Cor = cor;
		this.preco = preço;
		this.tamanho = tamanho;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCodigoDaCor() {
		return codigoDaCor;
	}

	public void setCodigoDaCor(int codigoDaCor) {
		this.codigoDaCor = codigoDaCor;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public double getPreço() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public char getTamanho() {
		return tamanho;
	}

	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}

	public void boasVindas() {
		System.out.println("----------   Bem vindo a loja de camisetas jadilson.cia  ----------\n\n");

		System.out.println("Segue noça tabela de produtos.\n");

	}

	public void Produtos() {

		System.out.println(this.descricao = "Macacão");
		System.out.println(this.codigoDaCor = 01);
		System.out.println(this.Cor = "preta");
		System.out.println(this.preco = 55.0);
		System.out.println(this.tamanho = 'p');

		System.out.println("\n##############################################\n");

		System.out.println(this.descricao = "blusa");
		System.out.println(this.codigoDaCor = 03);
		System.out.println(this.Cor = "Branca");
		System.out.println(this.preco = 88.4);
		System.out.println(this.tamanho = 'M');

		System.out.println("\n--------------- Obrigado por usar nosso sistema --------------------");

	}

}
