<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Producto</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">Registrar Producto</h1>
<form action="ControladorProducto" method="post">

<table border="2" align="center">

<tr>
<td>nombrecl2</td>
<td><input type="text" name="nombrecl2"></td>
</tr>
<tr>
<td>precioventacl2</td>
<td><input type="number" name="precioventacl2"></td>
</tr>
<tr>
<td>preciocompcl2</td>
<td><input type="number"  name="preciocompcl2"></td>
</tr>
<tr>
<td>estadocl2</td>
<td><input type="text" name="estadocl2"></td>
</tr>
<tr>
<td>descripcl2</td>
<td><input type="text" name="descripcl2"></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="Registrar Producto">
</td>
</tr>
</table>

</form>
</body>
</html>