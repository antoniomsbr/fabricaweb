package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDao {

	public static void main(String[] args) {
		
		//testeAlterar();
		testeExcluir();
		
	}
	
	public static void testeAlterar(){
		//criando o usuário
				Usuario usu = new Usuario();
				usu.setNome("Teste2Alt");
				usu.setLogin("teste2");
				usu.setSenha("54321");
				usu.setId(4);

				UsuarioDAO usuDAO = new UsuarioDAO();
				try {usuDAO.alterar(usu);
				System.out.println("alterado com sucesso");
				} catch (Exception e) {
					System.out.println(e);
				} 
		
	}
	
	
	public static void testeExcluir(){
		
		//criando o usuário
		Usuario usu = new Usuario();
				usu.setId(4);

		UsuarioDAO usuDAO = new UsuarioDAO();
		try {usuDAO.excluir(usu);
		System.out.println("excluído sucesso");
		} catch (Exception e) {
			System.out.println(e);
		} 
	}
	
	
	public static void testeCadastrar(){
		//criando o usuário
				Usuario usu = new Usuario();
				usu.setNome("Teste2");
				usu.setLogin("teste2");
				usu.setSenha("54321");

				UsuarioDAO usuDAO = new UsuarioDAO();
				try {usuDAO.cadastrar(usu);
				System.out.println("cadastrado com sucesso");
				} catch (Exception e) {
					System.out.println(e);
				} 
		
		
	}

}
