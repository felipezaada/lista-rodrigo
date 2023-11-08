package Questões;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class NumeroTres {
	public static void main(String[] args) {

		int A[] = { 0, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int B[] = new int[10];
		int x;
		
		for (x = 0; x < A.length; x++) {
			B[x] = A[x] + A[x];
		}
		
		String vetorTexto = Arrays.toString(A);
		String vetorTexto1 = Arrays.toString(B);
		
		JOptionPane.showMessageDialog(null,
				"Vetor A\n" + vetorTexto + "\nVetor B (somas)\n" + vetorTexto1);
	}
}
