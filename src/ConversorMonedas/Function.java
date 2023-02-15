package ConversorMonedas;

import javax.swing.JOptionPane;

public class Function {
	public void ConvertirMonedas(double ValorRecibido) {
		ConvertirModenas monedas = new ConvertirModenas();
		String opcion = (JOptionPane.showInputDialog(null, "Choose the money to convert", "Money",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Peso to Dolar", "Peso to Euro", "Peso to Libra", "Peso to Yen", "Peso to Won Coreano",
						"Dolar to Peso", "Euro to Peso", "Libra to Peso", "Yen to Peso", "Won Coreano to Pesos" },
				"Seleccion")).toString();

		switch (opcion) {
		case "Peso to Dolar":
			monedas.ConvertirPesosColombianosADolar(ValorRecibido);
			break;
		case "Peso to Euro":
			monedas.ConvertirPesosColombianosAEuros(ValorRecibido);
			break;

		}

	}

	public boolean isNumeric(String s) {
		if (s == null || s.equals("")) {
			return false;
		}

		return s.chars().allMatch(Character::isDigit);
	}

}
