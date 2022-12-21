package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ArtigoDao;
import model.JavaBeans;
import model.Livro;
import model.LivroDao;

@WebServlet(urlPatterns = { "/Controller", "/main", "/insert", "/insertLivro", "/buscarLivro"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArtigoDao dao = new ArtigoDao();
	JavaBeans artigo = new JavaBeans();
	Livro catalogo = new Livro();
	LivroDao operacaoLivro = new LivroDao();

	public Controller() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/main")) {
			artigo(request, response);
		} else if (action.equals("/insert")) {
			novoArtigo(request, response);
		} else if (action.equals("/insertLivro")) {
			novoLivro(request, response);
		} 
		else if (action.equals("/buscarLivro")) {
			catalogo1(request, response);
		}  else if (action.equals("/select")) {
			listarLivros(request, response);
		} else if (action.equals("/update")) {
			editarlivro(request, response);
		} else if (action.equals("/delete")) {
			removerLivro(request, response);}
		else {
			response.sendRedirect("index.html");
		// teste de conexao
		dao.testeConexao();}

	}
	
	/**
	 * catalogo.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void catalogo1(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Livro> lista = operacaoLivro.listarLivros();
		request.setAttribute("catalogo1", lista);
		RequestDispatcher rd = request.getRequestDispatcher("BuscarLivro.jsp");
		rd.forward(request, response);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getIdLivro());
			System.out.println(lista.get(i).getNomeLivro());
			System.out.println(lista.get(i).getDisponivel());
			System.out.println(lista.get(i).getAutor());
			System.out.println(lista.get(i).getIdioma());
		}
	}

//exibir artigo
	protected void artigo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("artigo.jsp");
	}

	// inserir artigo
	protected void novoArtigo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("artigo.jsp");
		System.out.println(request.getParameter("nome"));
		//setar variaveis javabeans
		artigo.setTexto(request.getParameter("nome"));
		//invocar ométodo inserirArtigo passando o objeto texto
		dao.inserirArtigo(artigo);
		//redirecionar para o doc entrada
		response.sendRedirect("index.html");
	}

	// inserir Livro
		protected void novoLivro(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			response.sendRedirect("index.hmtl");
			System.out.println(request.getParameter("nomeLivro"));
			//setar variaveis javabeans
			catalogo.setNomeLivro(request.getParameter("nomeLivro"));
			//invocar ométodo inserirArtigo passando o objeto texto
			operacaoLivro.inserirLivro(catalogo);
			//redirecionar para o doc entrada
			response.sendRedirect("index.html");
		}
		
		// listar livros
		protected void listarLivros(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			catalogo.setIdLivro(request.getParameter("idLivro"));
			operacaoLivro.selecionarLivro(catalogo);
			request.setAttribute("idLivro", catalogo.getIdLivro());
			request.setAttribute("nomeLivro", catalogo.getNomeLivro());
			request.setAttribute("disponivel", catalogo.getDisponivel());
			request.setAttribute("autor", catalogo.getAutor());
			request.setAttribute("idioma", catalogo.getIdioma());
			RequestDispatcher rd = request.getRequestDispatcher("Editar.jsp");
			rd.forward(request, response);
		}

		/**
		 * Editar contato.
		 *
		 * @param request the request
		 * @param response the response
		 * @throws ServletException the servlet exception
		 * @throws IOException Signals that an I/O exception has occurred.
		 */
		protected void editarlivro(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			catalogo.setIdLivro(request.getParameter("idLivro"));
			catalogo.setNomeLivro(request.getParameter("nomeLivro"));
			catalogo.setDisponivel(request.getParameter("disponivel"));
			catalogo.setAutor(request.getParameter("autor"));
			catalogo.setIdioma(request.getParameter("idioma"));
			operacaoLivro.alterarTitulo(catalogo);
			response.sendRedirect("main");
		}

		/**
		 * Remover contato.
		 *
		 * @param request the request
		 * @param response the response
		 * @throws ServletException the servlet exception
		 * @throws IOException Signals that an I/O exception has occurred.
		 */
		protected void removerLivro(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			catalogo.setIdLivro(request.getParameter("idLivro"));
			operacaoLivro.deletarTitulo(catalogo);
			response.sendRedirect("main");
		}

}
