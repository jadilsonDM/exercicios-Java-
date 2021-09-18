package circulos;

import javax.swing.JOptionPane;

public class Circulos {

	private double raio;
	private double area;
	private double perimetro;
	private double diametro;
	double pi = Math.PI;

	public Circulos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circulos(double area) {
		super();
		this.area = area;
	}

	public void CalcularArea() {

		area = (raio * raio) * pi;

		JOptionPane.showMessageDialog(null, "A area desse circulo é igual a: " + area);

	}

	public void CalcularPerimetro() {

		perimetro = (2 * pi) * raio;
		JOptionPane.showMessageDialog(null, "O perimetro desse circulo é: " + perimetro + "\n");

	}
	
	public void CalcularDiametro() {
		
		diametro = 2*raio;
		JOptionPane.showMessageDialog(null, "O diâmetro desse circulo é: " + diametro + "\n");
		
	}
	

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

}
