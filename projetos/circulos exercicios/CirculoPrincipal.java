package circulos;

import javax.swing.JOptionPane;

public class CirculoPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int quantidade = 0, numeroCirculo = 1;

		Circulos circulo = new Circulos();

		JOptionPane.showMessageDialog(null, "-----  Bem Vindo ao Sistema Medidor de Circulos Accenture ------");

		quantidade = (Integer
				.parseInt(JOptionPane.showInputDialog("quantos circulos gostarias de realizar os calculos?")));

		double[] CirculosCalculados = new double[quantidade];

		for (int i = 0; i < CirculosCalculados.length; i++) {

			circulo.setRaio(Double.parseDouble(
					JOptionPane.showInputDialog("qual o Valor do raio do " + numeroCirculo + "º criculo?")));
			circulo.CalcularArea();
			circulo.CalcularPerimetro();
			circulo.CalcularDiametro();
			numeroCirculo++;

		}

		JOptionPane.showMessageDialog(null, "\n-----  Obrigado por usar o sistema  ------\n");

	}

}
