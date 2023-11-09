package JogoDaCidinha;

public class VerificarVitoria {

	public boolean VerificarX(char[][] A) {
		if (A[0][0] == 'X' && A[0][1] == 'X' && A[0][2] == 'X') {
			return true;
		} else if (A[1][0] == 'X' && A[1][1] == 'X' && A[1][2] == 'X') {
			return true;
		} else if (A[2][0] == 'X' && A[2][1] == 'X' && A[2][2] == 'X') {
			return true;
		} else if (A[0][0] == 'X' && A[1][0] == 'X' && A[2][0] == 'X') {
			return true;
		} else if (A[0][1] == 'X' && A[1][1] == 'X' && A[2][1] == 'X') {
			return true;
		} else if (A[0][2] == 'X' && A[1][2] == 'X' && A[2][2] == 'X') {
			return true;
		} else if (A[0][0] == 'X' && A[1][1] == 'X' && A[2][2] == 'X') {
			return true;
		} else if (A[0][2] == 'X' && A[1][1] == 'X' && A[2][0] == 'X') {
			return true;
		}
		return false;
	}

	public boolean VerificarO(char[][] A) {
		if (A[0][0] == 'O' && A[0][1] == 'O' && A[0][2] == 'O') {
			return true;
		} else if (A[1][0] == 'O' && A[1][1] == 'O' && A[1][2] == 'O') {
			return true;
		} else if (A[2][0] == 'O' && A[2][1] == 'O' && A[2][2] == 'O') {
			return true;
		} else if (A[0][0] == 'O' && A[1][0] == 'O' && A[2][0] == 'O') {
			return true;
		} else if (A[0][1] == 'O' && A[1][1] == 'O' && A[2][1] == 'O') {
			return true;
		} else if (A[0][2] == 'O' && A[1][2] == 'O' && A[2][2] == 'O') {
			return true;
		} else if (A[0][0] == 'O' && A[1][1] == 'O' && A[2][2] == 'O') {
			return true;
		} else if (A[0][2] == 'O' && A[1][1] == 'O' && A[2][0] == 'O') {
			return true;
		}
		return false;
	}
}
