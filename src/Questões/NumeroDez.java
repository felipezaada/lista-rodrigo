package Questões;

import javax.swing.JOptionPane;

public class NumeroDez {
	public static void main(String[] args) {

		int M[][] = new int[3][3];
		int i;
		int j;
		int par = 0;
		int impar = 0;
		String message = "";

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				M[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe os valores: "));
				if (M[i][j] % 2 == 0) {
					par++;
				} else {
					impar++;
				}
			}
		}

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				message += M[i][j] + " ";
			}
			message += "\n";
		}

		JOptionPane.showMessageDialog(null, message + "\nQUANTIA DE PARES: " + par + "\nQUANTIA DE IMPARES: " + impar);
	}
}
