package com.tka;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String pass = req.getParameter("pass");

        System.out.println("user : " + user);
        System.out.println("password : " + pass);

        if (pass != null && pass.equals("pass")) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("thankyou.jsp");
            List<String> ls = new ArrayList<String>();
            ls.add("<br><br>Files used:");
            ls.add("<br>LoginServlet");
            ls.add("<br>Index.jsp");
            ls.add("<br>Thankyou.jsp");
            req.setAttribute("msg", "Welcome "+user);
            req.setAttribute("data", ls);
            requestDispatcher.forward(req, resp);
        } else {
            req.setAttribute("msg", "invalid password");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
            requestDispatcher.forward(req, resp);
        }
    }
		
	}


