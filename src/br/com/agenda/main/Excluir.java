package br.com.agenda.main;

import br.com.agenda.model.Contato;
import java.util.Scanner;

import br.com.agenda.dao.ContatoDAO;

public class Excluir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao = 1;
		Scanner entrada = new Scanner(System.in);
		while (opcao == 1) {
		
		ContatoDAO contatoDAO = new ContatoDAO();
		
		for (Contato c : contatoDAO.getContatos()) {
			System.out.println("CODIGO: " + c.getId());
			System.out.println("NOME: " + c.getNome());
			System.out.println("IDADE: " + c.getIdade());
			System.out.println("DATA DE CADASTRO: " + c.getDataCadastro());
			System.out.println("\n");
		}
		
		
		System.out.println("Digite o codigo que deseja excluir:");
		int codDel = entrada.nextInt();
		contatoDAO.removeById(codDel);
		System.out.println("Contato excluido com sucesso\n");
	
		System.out.println("Deseja excluir um novo contato?");
		System.out.println("Digite 1-Excluir novamente");
		System.out.println("Digite 0-Sair");
		opcao = entrada.nextInt();
	
		}
		System.out.println("Ate mais!");
		entrada.close();
	
	}
	
	

}
