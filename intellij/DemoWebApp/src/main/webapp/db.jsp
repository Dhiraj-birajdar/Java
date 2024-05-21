<%-- <%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.ResultSetMetaData" %>
<%@ page import="java.sql.SQLException" %> --%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Database</title>
</head>
<body style="background-color: #292c35; color: yellow">
    <%-- <form action="#">
        Enter country code : <input type="text" name="country" >
        <input type="submit" value="Fetch Cities">
    </form> --%>
    <%!
        Connection c = null;
        ResultSet resultSet = null;
        ResultSetMetaData metaData = null;
        int columnCount = 0;
    %>
    <%
        String country = request.getParameter("country");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");

            if (country != null && !country.isEmpty()) {
                PreparedStatement ps = c.prepareStatement("select * from city where countrycode = ? limit 10");
                ps.setString(1, country);
                resultSet = ps.executeQuery();
                if(!resultSet.next()) out.println("<h1 style='color:red;'>Invalid country code</h1>");
                metaData = resultSet.getMetaData();
                columnCount = metaData.getColumnCount();
            } else {
                // Form is not submitted
                out.println("<h1 style='color:red;'>Invalid country code</h1>");
            }
        } catch (Exception e) {
            out.println("<br>" + e);
        }
    %>
    <% if(resultSet != null) { %>
        <table border="1">
            <thead>
                <tr>
                    <%
                        // Generate table headers
                        for(int i = 1; i <= columnCount; i++) {
                            out.println("<th>" + metaData.getColumnName(i) + "</th>");
                        }
                    %>
                </tr>
            </thead>
            <tbody>
                <%
                    // Iterate over ResultSet rows
                    while(resultSet.next()) {
                %>
                        <tr>
                            <%
                                // Generate table cells
                                for(int i = 1; i <= columnCount; i++) {
                                    out.println("<td>" + resultSet.getString(i) + "</td>");
                                }
                            %>
                        </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    <% } %>
    
    <br>
    
    <a href="index.jsp"><button>index.jsp</button></a>
</body>
</html>
