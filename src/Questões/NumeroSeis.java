package Questões;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class NumeroSeis {
	public static void main(String[] args) {

		int A[] = { 0, 2, 3, 4, 5, 6 };
		int B[] = new int[6];
		int x;

		for (x = 0; x < A.length; x++) {
			if (A[x] % 2 == 0) {
				B[x] = 1;
			} else {
				B[x] = 0;
			}
		}

		String vetorTexto = Arrays.toString(A);
		String vetorTexto1 = Arrays.toString(B);

		JOptionPane.showMessageDialog(null, "Vetor A\n" + vetorTexto + "\nVetor B (binário)\n" + vetorTexto1);
	}
}
