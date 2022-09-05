package br.com.agenda.main;
import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;
import java.util.Date;
import java.util.Scanner;


public class Cadastrar {

	public static void main(String[] args) {
		int opcao = 1;
		Scanner entrada = new Scanner(System.in);
		while (opcao == 1) {
		
		ContatoDAO contatoDAO = new ContatoDAO();
		
		Contato contato = new Contato();
		
		System.out.println("Digite o nome:");
		String nome = entrada.next().toString();
		System.out.println("Digite a idade:");
		int idade = entrada.nextInt();
		
		contato.setNome(nome);
		contato.setIdade(idade);
		contato.setDataCadastro(new Date(idade));
		contatoDAO.save(contato);
		
		System.out.println("Contato salvo com sucesso!");
		
		System.out.println("Deseja cadastrar um novo contato?");
		System.out.println("Digite 1-Cadastrar");
		System.out.println("Digite 0-Sair");
		opcao = entrada.nextInt();
		
		}
		System.out.println("Até mais!");
		entrada.close();
	}
}