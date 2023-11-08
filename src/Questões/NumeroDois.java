package Questões;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class NumeroDois {
	public static void main(String[] args) {

		int A[] = { 0, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int B[] = { 0, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int C[] = new int[10];
		int x;

		for (x = 0; x < A.length; x++) {
			C[x] = A[x] + B[x];
		}

		String vetorTexto = Arrays.toString(A);
		String vetorTexto1 = Arrays.toString(B);
		String vetorTexto2 = Arrays.toString(C);

		JOptionPane.showMessageDialog(null,
				"Vetor A\n" + vetorTexto + "\nVetor B\n" + vetorTexto1 + "\nVetor C (soma dois dois)\n" + vetorTexto2);
	}
}
