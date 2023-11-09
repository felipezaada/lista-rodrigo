package JogoDaCidinha;

import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {

		VerificarVitoria verificar = new VerificarVitoria();
		StringBuilder velha = new StringBuilder();
		String opcao;
		char[] jogos = { 'X', 'O' };
		char[][] A = new char[3][3];
		int opcao1 = 0;
		int opcao2 = 0;
		boolean vitoria = false;

		JOptionPane.showMessageDialog(null, "Iniciando jogo da velha, primeiro a jogar: X ");

		do {

			velha.setLength(0);

			velha.append("    A     B     C\n" + "1  " + A[0][0] + "  |  " + A[0][1] + "  |  " + A[0][2] + "\n"
					+ "   ---------------\n" + "2  " + A[1][0] + "  |  " + A[1][1] + "  |  " + A[1][2] + "\n"
					+ "   ---------------\n" + "3  " + A[2][0] + "  |  " + A[2][1] + "  |  " + A[2][2] + "\n\n\n");

			opcao = JOptionPane.showInputDialog(null, velha, "VEZ DO X!", JOptionPane.INFORMATION_MESSAGE);

			switch (opcao.charAt(0)) {
			case 'A':
			case 'a':
				opcao2 = 0;
				break;
			case 'B':
			case 'b':
				opcao2 = 1;
				break;
			case 'C':
			case 'c':
				opcao2 = 2;
				break;
			}

			switch (opcao.charAt(1)) {
			case '1':
				opcao1 = 0;
				break;
			case '2':
				opcao1 = 1;
				break;
			case '3':
				opcao1 = 2;
				break;
			}

			while (A[opcao1][opcao2] != '\0') {
				opcao = JOptionPane.showInputDialog(null, velha, "VEZ DO X!", JOptionPane.INFORMATION_MESSAGE);
				switch (opcao.charAt(0)) {
				case 'A':
				case 'a':
					opcao2 = 0;
					break;
				case 'B':
				case 'b':
					opcao2 = 1;
					break;
				case 'C':
				case 'c':
					opcao2 = 2;
					break;
				}

				switch (opcao.charAt(1)) {
				case '1':
					opcao1 = 0;
					break;
				case '2':
					opcao1 = 1;
					break;
				case '3':
					opcao1 = 2;
					break;
				}
			}

			A[opcao1][opcao2] = jogos[0];

			if (verificar.VerificarX(A) == true) {
				JOptionPane.showMessageDialog(null, "X CAMPEÃO!");
				break;
			} else if (verificar.VerificarO(A) == true) {
				JOptionPane.showMessageDialog(null, "O CAMPEÃO!");
				break;
			} else {

			}

			velha.setLength(0);

			velha.append("    A     B     C\n" + "1  " + A[0][0] + "  |  " + A[0][1] + "  |  " + A[0][2] + "\n"
					+ "   ---------------\n" + "2  " + A[1][0] + "  |  " + A[1][1] + "  |  " + A[1][2] + "\n"
					+ "   ---------------\n" + "3  " + A[2][0] + "  |  " + A[2][1] + "  |  " + A[2][2] + "\n\n\n");

			opcao = JOptionPane.showInputDialog(null, velha, "VEZ DO O!", JOptionPane.INFORMATION_MESSAGE);

			switch (opcao.charAt(0)) {
			case 'A':
			case 'a':
				opcao2 = 0;
				break;
			case 'B':
			case 'b':
				opcao2 = 1;
				break;
			case 'C':
			case 'c':
				opcao2 = 2;
				break;
			}

			switch (opcao.charAt(1)) {
			case '1':
				opcao1 = 0;
				break;
			case '2':
				opcao1 = 1;
				break;
			case '3':
				opcao1 = 2;
				break;
			}

			while (A[opcao1][opcao2] != '\0') {
				opcao = JOptionPane.showInputDialog(null, velha, "VEZ DO O!", JOptionPane.INFORMATION_MESSAGE);
				switch (opcao.charAt(0)) {
				case 'A':
				case 'a':
					opcao2 = 0;
					break;
				case 'B':
				case 'b':
					opcao2 = 1;
					break;
				case 'C':
				case 'c':
					opcao2 = 2;
					break;
				}

				switch (opcao.charAt(1)) {
				case '1':
					opcao1 = 0;
					break;
				case '2':
					opcao1 = 1;
					break;
				case '3':
					opcao1 = 2;
					break;
				}
			}

			A[opcao1][opcao2] = jogos[1];

			if (verificar.VerificarX(A) == true) {
				JOptionPane.showMessageDialog(null, "X CAMPEÃO!");
				break;
			} else if (verificar.VerificarO(A) == true) {
				JOptionPane.showMessageDialog(null, "O CAMPEÃO!");
				break;
			} else {

			}

		} while (vitoria == false);
	}
}
