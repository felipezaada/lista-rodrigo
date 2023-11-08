package Questões;

import javax.swing.JOptionPane;

public class NumeroQuatro {
	public static void main(String[] args) {

		int A[] = { 0, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double par = 0;
		double impar = 0;
		int x;

		for (x = 0; x < A.length; x++) {
			if (A[x] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}

		impar = (impar / 10) * 100;
		par = (par / 10) * 100;

		JOptionPane.showMessageDialog(null, "PORCENTAGEM PAR " + par + "%" + "\nPORCENTAGEM IMPAR " + impar + "%");
	}
}
