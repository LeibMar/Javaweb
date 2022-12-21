 package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Livro;





public class LivroDao {
	/** módulo de conexão **/
	// parametros de conexao
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/prosopografia?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "mervech18";

	// método de conexão
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}

	// teste de conexão
	public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/** crud create **/
	public void inserirLivro(Livro nomeLivro) {
		String create = "insert into catalogo(nomeLivro) values (?)";
		try {
			// abrir a conexao com banco
			Connection con = conectar();
			// preparar a query para execucao
			PreparedStatement pst = con.prepareStatement(create);
			// substituir parametros (?) pelo conteudo ds variaveis JavaBeans
			pst.setString(1, nomeLivro.getNomeLivro());
			// executar query
			pst.executeUpdate();
			// encerrar coenxao com banco
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	/**
	 * Listar contatos.
	 *
	 * @return the array list
	 */
	public ArrayList<Livro> listarLivros() {
		ArrayList<Livro> catalogo1 = new ArrayList<>();
		String read = "select * from prosopografia.catalogo order by nomeLivro";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String idLivro = rs.getString(1);
				String nomeLivro = rs.getString(2);
				String disponivel = rs.getString(3);
				String autor = rs.getString(4);
				String idioma = rs.getString(5);
				catalogo1.add(new Livro(idLivro, nomeLivro, disponivel, autor, idioma ));
			}
			con.close();
			return catalogo1;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	
	/**
	 * Selecionar livro
	 *
	 * @param contato the contato
	 */
	public void selecionarLivro(Livro catalogo) {
		String read2 = "select * from catalogo where idLivro = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read2);
			pst.setString(1, catalogo.getIdLivro());
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				catalogo.setIdLivro(rs.getString(1));
				catalogo.setNomeLivro(rs.getString(2));
				catalogo.setDisponivel(rs.getString(3));
				catalogo.setAutor(rs.getString(4));
				catalogo.setIdioma(rs.getString(5));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * Alterar dados do livro
	 *
	 * @param contato the contato
	 */
	public void alterarTitulo(Livro catalogo) {
		String update = "update contatos set nomeLivro=?,disponivel=?,autor=?, Idioma=? where idLivro=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(update);
			pst.setString(1, catalogo.getIdLivro());
			pst.setString(2, catalogo.getNomeLivro());
			pst.setString(3, catalogo.getDisponivel());
			pst.setString(4, catalogo.getAutor());
			pst.setString(4, catalogo.getIdioma());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * Deletar livro
	 *
	 * @param contato the contato
	 */
	public void deletarTitulo(Livro catalogo) {
		String delete = "delete from contatos where idLivro=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(delete);
			pst.setString(1, catalogo.getIdLivro());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
