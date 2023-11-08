package Questões;

import javax.swing.JOptionPane;

public class NumeroCinco {
	public static void main(String[] args) {
		
		double A[][] = new double[10][3];
		int i;
		int j;

		for (i = 0; i < 10; i++) {
			for (j = 0; j < 2; j++) {
				A[i][j] = Double.parseDouble(
						JOptionPane.showInputDialog("Informe a nota do aluno " + (i + 1) + " no bimestre " + (j + 1)));
			}
			A[i][2] = (A[i][0] + A[i][1]) / 2;
		}

		String message = "                   PRIMEIRO BIMESTRE   SEGUNDO BIMESTRE                  MÉDIA\n";

		for (i = 0; i < 10; i++) {
			message += "ALUNO " + (i + 1) + "               ";
			for (j = 0; j < 3; j++) {
				message += A[i][j] + "                                       ";
			}
			if (A[i][2] > 7) {
				message += "APROVADO";
			} else {
				message += "REPROVADO";
			}
			message += "\n";
		}

		JOptionPane.showMessageDialog(null, message);
	}
}
