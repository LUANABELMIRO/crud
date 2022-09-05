package br.com.agenda.main;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Listar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContatoDAO contatoDAO = new ContatoDAO();
		
		for (Contato c : contatoDAO.getContatos()) {
			System.out.println("\nNOME: " + c.getNome());
			System.out.println("IDADE: " + c.getIdade());
			System.out.println("DATA DE CADASTRO: " + c.getDataCadastro());
		}
	}

}
