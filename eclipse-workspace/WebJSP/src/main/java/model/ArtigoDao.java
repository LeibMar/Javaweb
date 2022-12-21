package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ArtigoDao {
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
	public void inserirArtigo(JavaBeans texto) {
		String create = "insert into artigo(texto) values (?)";
		try {
			// abrir a conexao com banco
			Connection con = conectar();
			// preparar a query para execucao
			PreparedStatement pst = con.prepareStatement(create);
			// substituir parametros (?) pelo conteudo ds variaveis JavaBeans
			pst.setString(1, texto.getTexto());
			// executar query
			pst.executeUpdate();
			// encerrar coenxao com banco
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
