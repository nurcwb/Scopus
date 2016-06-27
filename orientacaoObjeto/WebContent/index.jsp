<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aplicação do Orientação a Objeto</title>
</head>
<body>
<h1>Teste de JSP</h1>
<p>Será que o cachorro gostou? ${resposta}</p>
<p>Parametro 1 ${t1}</p>
<p>Parametro 2 ${t2}</p>

<table>
	<c:forEach var="zzz" items= "${resposta}">
		<tr>
			<td><c:out value="zzz"></c:out></td>
		</tr>
	</c:forEach>
</table>

</body>
</html>