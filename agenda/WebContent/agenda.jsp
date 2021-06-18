<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@page import="model.JavaBeans" %>
	<%@page import="java.util.ArrayList" %>
	<% ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>) request.getAttribute("javabeans");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>agenda de contatos</title>
<link rel="icon" href="imagens/favicon.png">
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>agenda de centatos</h1>
	<a href="novo.html" class="Botao1">novo contato</a>
	<table id="tabela">
		<thead>
			<tr>
				<th>id</th>
				<th>nome</th>
				<th>fone</th>
				<th>E-mail</th>
				<th>Opções</th>

			</tr>
		</thead>

		<tbody>
		   <%for(int i=0; i <lista.size(); i++){ %>
		   <tr>
		     <td><%=lista.get(i).getIdcom() %></td>
		     <td><%=lista.get(i).getNome() %></td>
		     <td><%=lista.get(i).getFone()%></td>
		     <td><%=lista.get(i).getEmail() %></td>
		     </tr>
		   <% } %>
		</tbody>
	</table>

</body>
</html>