<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Editar contato</h1>
	<form name="frmContato" action="update">
		<table>
			<tr>
				<td><input type="text" name="idLivro" id="caixa3" readonly
					value="<%out.print(request.getAttribute("idLivro"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="nomeLivro" class="Caixa1"
					value="<%out.print(request.getAttribute("nomeLivro"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="disponivel" class="Caixa2"
					value="<%out.print(request.getAttribute("disponivel"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="autor" class="Caixa1"
					value="<%out.print(request.getAttribute("autor"));%>"></td>
			</tr>
			
			<tr>
				<td><input type="text" name="idioma" class="Caixa1"
					value="<%out.print(request.getAttribute("idioma"));%>"></td>
			</tr>
		</table>
		<a href = "/update" >Salvar</a>
	</form>
	
</body>
</html>