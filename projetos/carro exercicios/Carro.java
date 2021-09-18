package sef.module4.activity;

public class Carro {

	private String marca;
	private String colorCode;
	private double price;
	private boolean buzinar;

	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carro(String marca, String colorCode, double price, boolean buzinar) {
		super();
		this.marca = marca;
		this.colorCode = colorCode;
		this.price = price;
		this.buzinar = buzinar;
	}

	public void exibirCarro() {

		System.out.println("O carro é da Marca: " + marca);
		System.out.println("O codigo de sua cor é: " + colorCode);
		System.out.println("Seu Preço é de: " + price);

	}
	
	
	public void tocarBuzina() {
		
		if(buzinar == true) {
			System.out.println("Saidafrente BiBite!");
			
			
		}else {
			System.out.println("você escolheu não buzinar");
			
			
		}
		
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColorCode() {
		return colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isBuzinar() {
		return buzinar;
	}

	public void setBuzinar(boolean buzinar) {
		this.buzinar = buzinar;
	}

}
