package Questões;

import javax.swing.JOptionPane;

public class NumeroOito {
	public static void main(String[] args) {

		int A[][] = new int[2][5];
		int i;
		int j;
		String message = "";

		for (i = 0; i < 2; i++) {
			for (j = 0; j < 5; j++) {
				A[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor "));
			}
		}

		for (i = 0; i < 2; i++) {
			for (j = 0; j < 5; j++) {
				message += A[i][j] + " ";
			}
			message += "\n";
		}

		JOptionPane.showMessageDialog(null, message);
	}
}
