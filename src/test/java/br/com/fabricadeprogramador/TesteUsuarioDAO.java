package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TesteUsuarioDAO {

	public static void main(String args[]) {

		//testCadastrar();
		testExcluir();
	}

	private static void testExcluir() {
		//Delete usuario
		Usuario usu = new Usuario();
		usu.setId(5);
		
		//Delete usuario no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
		
		System.out.println("Excluído com sucesso!");
	}

	public static void testCadastrar() {

		// Criando o Usuário
		Usuario usu = new Usuario();
		usu.setNome("Isabella");
		usu.setLogin("isa");
		usu.setSenha("321");
		// Cadastrando usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);

		System.out.println("Cadastro realizado com sucesso!");

	}

	public static void testAlterar() {

		// Alterar o Usuário
		Usuario usu = new Usuario();
		usu.setId(4);
		usu.setNome("Mauricio Cortes");
		usu.setLogin("mau");
		usu.setSenha("123");
		// Cadastrando usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);

		System.out.println("Cadastro alterado com sucesso!");
	}

}
