package br.com.agenda.main;

import java.util.Date;
import java.util.Scanner;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Atualizar {

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
		System.out.println("Digite o cÃ³digo que deseja atualizar:");
		int codAtt = entrada.nextInt();
		
		Contato contatoAtt = new Contato();
		contatoAtt.setId(codAtt);
		System.out.println("Digite o nome:");
		String nome = entrada.next().toString();
		contatoAtt.setNome(nome);
		System.out.println("Digite a idade:");
		int idade = entrada.nextInt();
		contatoAtt.setIdade(idade);
		
		contatoAtt.setDataCadastro(new Date());
		contatoDAO.update(contatoAtt);
		
		System.out.println("Contato atualizado com sucesso\n");
	
		System.out.println("Deseja atualizar um novo contato?");
		System.out.println("Digite 1-Atualizar novamente");
		System.out.println("Digite 0-Sair");
		opcao = entrada.nextInt();
	
		}
		System.out.println("AtÃ© mais!");
		entrada.close();
	
	}
	

}
