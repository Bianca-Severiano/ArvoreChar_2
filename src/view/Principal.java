package view;

import br.edu.fateczl.arvore.ArvoreChar.ArvoreChar;

public class Principal {

	public static void main(String[] args) {
		ArvoreChar arv = new ArvoreChar();
		char [] vetor = {'k', 'd', 'm', 'b', 'f', 'l', 't', 'c', 'p', 'z', 'r'};
		
		for (char i: vetor) {
			arv.insert(i);
		}
		
		try {
			arv.remove('m');
			arv.prefixSearch();
			arv.infixSearch();
			arv.postfixSearch();
			arv.search('r');
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

}
