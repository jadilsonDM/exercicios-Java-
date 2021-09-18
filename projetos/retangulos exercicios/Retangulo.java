package retangulosos;

import javax.swing.JOptionPane;

public class Retangulo {

	private double altura;
	private double base;
	private double area;
	private double perimetro;

	public Retangulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retangulo(double altura, double base) {
		super();
		this.altura = altura;
		this.base = base;
		
	}

	public void calcularArea() {

		area = altura * base;
		
		JOptionPane.showMessageDialog(null,"A area de um retangulo que a altura é de: "+  altura + " e a base é de : " + base + " é igual a " + area );

	}

	public void CalcularPerimetro() {

		perimetro = (2 * altura) + (2 * base);
		JOptionPane.showMessageDialog(null,"O perimetro de um retangulo que a altura é de: "+  altura + " e a base é de : " + base + " é igual a " + perimetro + "\n" );
		JOptionPane.showMessageDialog(null, "\n-----  Obrigado por usar o sistema  ------\n");
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAria() {
		return area;
	}

	public void setAria(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

}
