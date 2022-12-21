<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="model.Livro"%>
<%@ page import="java.util.ArrayList"%>
<%
	@ SuppressWarnings ("unchecked")
	ArrayList<Livro> lista = (ArrayList<Livro>) request.getAttribute("catalogo1");

%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Agenda de Contatos</h1>

	<table id="tabela">
		<thead>
			<tr>
				<th>Id Livro</th>
				<th>Título</th>
				<th>Disponível</th>
				<th>Autor</th>
				<th>Idioma</th>
				<th>Opções</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (int i = 0; i < lista.size(); i++) {
			%>
			<tr>
				<td><%=lista.get(i).getIdLivro()%></td>
				<td><%=lista.get(i).getNomeLivro()%></td>
				<td><%=lista.get(i).getDisponivel()%></td>
				<td><%=lista.get(i).getAutor()%></td>
				<td><%=lista.get(i).getIdioma()%></td>
				<td>
				<a href="select?idLivro=<%=lista.get(i).getIdLivro()%>">Editar</a>
					<a href="delete?idLivro=<%=lista.get(i).getIdLivro()%>">Excluir</a>
				</td>
			</tr>
<%
				}
			%>
		</tbody>
	</table>
	</body>
</html>