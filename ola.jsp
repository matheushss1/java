<--! estou rodando no apache !-->
<%@page contentType="text/html" import="java.util.Date, java.text.*"
pageEncoding="utf-8"%>
<html>
  <head>
    <title>Pagina JSP</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
  </head>
  <body>
    <h1>
      <% out.println("Olá, Arbyte!"); %>
      <br />
      <% int dia = Integer.parseInt((new SimpleDateFormat("dd")) .format(new
      Date())); out.println("<br />Hoje é dia" + " " + dia); %>
    </h1>
  </body>
</html>
