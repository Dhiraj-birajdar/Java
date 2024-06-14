<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>thank you</title>
</head>
<body>
<h1 style="color: green;">
	<%= request.getAttribute("msg") %>
</h1>
	<%
        List<String> ls = (List<String>) request.getAttribute("data");   
       out.println( "<h2>"+ ls.get(0)+"</h2><ul>");           
                for (int i = 1; i < ls.size(); i++)          
                	out.print( "  <li>"+ls.get(i)+"</li>");            
        out.println("</ul>");
        %>
</body>
</html>