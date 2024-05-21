<html>

<head>
  <title>Home intellij</title>
  <link rel="stylesheet" href="css/styles.css">
  <style>
    body{
      color: #ffffff;
    }
  </style>
</head>

<body>
   <h1>JSP FILE</h1>
   <!-- declaration tag -->
   <%!
	 int mul(int a, int... n){
    int s = 1;
     if(n.length == 0){
            return a;
        } 
	    for(int i: n)
	        s+= a*i;
      return s;
	}
   %>
    <!-- expression tag -->
    <%= "<h3>Today's date : "+new java.util.Date().toLocaleString()+" </h3>" %>
    <%-- scriplet --%>
      <%-- <% for(int i = 1;i<=6; i++ ) out.print("<h"+i+">Hello World! </h"+i+">");
        %> --%>

<%
      // out.println(mul(2,9999999));	
		// out.println("Var args");
		// char c = 65;
		// int i = 'z';
		// out.println("c : "+c);
		// out.println("i : "+i);
		
%>
        <!-- <div>
          <input type="checkbox" class="checkbox" id="checkbox">
          <label for="checkbox" class="checkbox-label">
            <i class="fas fa-moon"></i>
            <i class="fas fa-sun"></i>
            <span class="ball"></span>
          </label>
        </div>
        <script src="js/action.js"></script> -->
        <form action="db.jsp">
        Enter country code : <input type="text" name="country" >
        <input type="submit" value="Fetch Cities">
    </form>
        <a href="db.jsp"><button>db.jsp</button></a>
</body>

</html>