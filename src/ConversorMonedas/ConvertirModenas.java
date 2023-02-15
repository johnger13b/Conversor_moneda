package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirModenas {
	public void ConvertirPesosColombianosADolar(double valorRecibido) {
		double monedaDolar = valorRecibido/4801.53;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
		JOptionPane.showMessageDialog(null, "Tiene $" + monedaDolar + "Dolares");
				
	}
	
	public void ConvertirPesosColombianosAEuros(double valorRecibido) {
		double monedaDolar = valorRecibido/5068.89;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
		JOptionPane.showMessageDialog(null, "Tiene $" + monedaDolar + "Euros");
		
	}

}
