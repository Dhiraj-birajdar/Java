package com.form;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormProcess extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
//		int n1 = Integer.parseInt(req.getParameter("fname"));
//		int n2 = Integer.parseInt(req.getParameter("lname"));
//		out.println("<h1>"+n1+n2+"</h1>");

		new FormProcess().doGet(req, res);
		out.close();
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		String mail = req.getParameter("email");
		PrintWriter out = res.getWriter();
//		out.println(mail);

//		String txtarea =  req.getParameter("message");
//		Enumeration<String> e = req.getParameterNames();
//		out.println("<h2>"+txtarea+"</h2>");
//		out.println("<h2>"+e+"</h2>");
		res.setContentType("text/html");
		String[] subs = req.getParameterValues("subject");
		out.println("<h2>selected subjects</h2>");
		if (subs != null)
			for (String s : subs) {
				out.println("<h2>" + s + "</h2>");
			}
		out.close();
	}
}
