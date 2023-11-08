package Questões;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class NumeroSete {
	public static void main(String[] args) {
		
		int A[] = new int[10];
		int x; 
		
		for (x = 0; x < A.length; x++) {
			A[x] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (x + 1) + "º valor"));
		}
		
		Arrays.sort(A);
		String vetorTexto = Arrays.toString(A);
		
		JOptionPane.showMessageDialog(null, vetorTexto);
		
	}
}