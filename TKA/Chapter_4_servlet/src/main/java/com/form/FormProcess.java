package com.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormProcess extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int n1 = Integer.parseInt(req.getParameter("fname"));
		int n2 = Integer.parseInt(req.getParameter("lname"));
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>"+n1+n2+"</h1>");
		new FormProcess().doGet(req, res);
		out.close();
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String mail = req.getParameter("email");
		PrintWriter out = res.getWriter();
		out.println(mail);
		out.close();
	}
}
