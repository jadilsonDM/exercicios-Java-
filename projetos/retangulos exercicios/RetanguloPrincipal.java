package retangulosos;

import javax.swing.JOptionPane;

public class RetanguloPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Retangulo retangulo01 = new Retangulo(10, 5);
		Retangulo retangulo02 = new Retangulo(10, 7);

		Retangulo retangulo03 = new Retangulo();
		Retangulo retangulo04 = new Retangulo();
		Retangulo retangulo05 = new Retangulo();
		Retangulo retangulo06 = new Retangulo();
		Retangulo retangulo07 = new Retangulo();

		JOptionPane.showMessageDialog(null, "-----  Bem Vindo ao Sistema  ------");

		retangulo01.calcularArea();
		retangulo01.CalcularPerimetro();
		retangulo02.calcularArea();
		retangulo02.CalcularPerimetro();

		retangulo03.setAltura(
				Double.parseDouble(JOptionPane.showInputDialog("qual o Valor do lado vertical do retangulo?")));
		retangulo03.setBase(
				Double.parseDouble(JOptionPane.showInputDialog("qual o Valor do lado vertical do retangulo?")));
		retangulo03.calcularArea();
		retangulo03.CalcularPerimetro();
     
		retangulo04.setAltura(
				Double.parseDouble(JOptionPane.showInputDialog("qual o Valor do lado vertical do retangulo?")));
		retangulo04.setBase(
				Double.parseDouble(JOptionPane.showInputDialog("qual o Valor do lado vertical do retangulo?")));
		retangulo04.calcularArea();
		retangulo04.CalcularPerimetro();

		retangulo05.setAltura(
				Double.parseDouble(JOptionPane.showInputDialog("qual o Valor do lado vertical do retangulo?")));
		retangulo05.setBase(
				Double.parseDouble(JOptionPane.showInputDialog("qual o Valor do lado vertical do retangulo?")));
		retangulo05.calcularArea();
		retangulo05.CalcularPerimetro();

		retangulo06.setAltura(
				Double.parseDouble(JOptionPane.showInputDialog("qual o Valor do lado vertical do retangulo?")));
		retangulo06.setBase(
				Double.parseDouble(JOptionPane.showInputDialog("qual o Valor do lado vertical do retangulo?")));
		retangulo06.calcularArea();
		retangulo06.CalcularPerimetro();

		retangulo07.setAltura(
				Double.parseDouble(JOptionPane.showInputDialog("qual o Valor do lado vertical do retangulo?")));
		retangulo07.setBase(
				Double.parseDouble(JOptionPane.showInputDialog("qual o Valor do lado vertical do retangulo?")));
		retangulo07.calcularArea();
		retangulo07.CalcularPerimetro();
      
	}

}
