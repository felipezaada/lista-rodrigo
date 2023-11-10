package JogoDaCidinha;

public class Jogada {
	
	int opcao1;
	int opcao2;
	
	void Jogar(String opcao) {
		
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
		
		switch (opcao.charAt(0)) {
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
		
		switch (opcao.charAt(1)) {
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
		
		
	}
}