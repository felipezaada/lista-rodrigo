package JogoDaCidinha;

import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {

		StringBuilder velha = new StringBuilder();
		Jogada jogar = new Jogada();
		VerificarVitoria verificar = new VerificarVitoria();
		String opcao = "";
		char[] jogos = { 'X', 'O' };
		char[][] A = new char[3][3];
		boolean vitoria = false;

		JOptionPane.showMessageDialog(null, "Iniciando jogo da velha, primeiro a jogar: X ");

		do {

			velha.setLength(0);

			velha.append("    A     B     C\n" + "1  " + A[0][0] + "  |  " + A[0][1] + "  |  " + A[0][2] + "\n"
					+ "   ---------------\n" + "2  " + A[1][0] + "  |  " + A[1][1] + "  |  " + A[1][2] + "\n"
					+ "   ---------------\n" + "3  " + A[2][0] + "  |  " + A[2][1] + "  |  " + A[2][2] + "\n\n\n");

			opcao = JOptionPane.showInputDialog(null, velha, "VEZ DO X!", JOptionPane.INFORMATION_MESSAGE);

			jogar.Jogar(opcao);
			
			while(A[jogar.opcao1][jogar.opcao2] != '\0') {
				opcao = JOptionPane.showInputDialog(null, velha, "VEZ DO X!", JOptionPane.INFORMATION_MESSAGE);
				jogar.Jogar(opcao);
			}
			
			A[jogar.opcao1][jogar.opcao2] = jogos[0];
			
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

			jogar.Jogar(opcao);
			
			while(A[jogar.opcao1][jogar.opcao2] != '\0') {
				opcao = JOptionPane.showInputDialog(null, velha, "VEZ DO O!", JOptionPane.INFORMATION_MESSAGE);
				jogar.Jogar(opcao);
			}
			
			A[jogar.opcao1][jogar.opcao2] = jogos[1];
			
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