package ConversorMonedas;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		Function monedas = new Function();
		
		String opciones = (JOptionPane.showInputDialog(null,
				"Choose one", "Input",
				JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {"Conversor de Moneda", "Conversor de Temperatura"},"Seleccion")).toString();
		boolean action=true;
		do {
		switch (opciones) {
		case "Conversor de Moneda": {
			String input = JOptionPane.showInputDialog("Ingrese un valor para convertir");
			if(monedas.isNumeric(input)) {
				double valorRecibido = Double.parseDouble(input);
				monedas.ConvertirMonedas(valorRecibido);
				
				int seleccion = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion");
				if (JOptionPane.OK_OPTION == seleccion) {
					System.out.println("Selecciona opcion Afirmativa");
					
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Programa terminado");
					action = false;
				}
				
			}
			else {
				JOptionPane.showMessageDialog(null, "ingrese un valor numerico");
			}

		

		}
		}

	}
	while(action);

}
}
