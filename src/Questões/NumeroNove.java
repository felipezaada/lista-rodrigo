package Questões;

import java.util.Random;
import javax.swing.JOptionPane;

public class NumeroNove {
	public static void main(String[] args) {

		Random rand = new Random();
		int M[][] = new int[4][4];
		int i = 0;
		int j = 0;
		int posicaoI = 0;
		int posicaoJ = 0;
		int maior = 0;

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				M[i][j] = rand.nextInt(9);
			}
		}

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				if (M[i][j] > maior) {
					maior = M[i][j];
					posicaoI = i;
					posicaoJ = j;
				}
			}
		}

		JOptionPane.showMessageDialog(null, "MAIOR NÚMERO: " + maior + "\nPOSIÇÃO: " + "LINHA " + posicaoI + " COLUNA " + posicaoJ);
	}
}
