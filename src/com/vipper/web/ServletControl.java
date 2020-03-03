package com.vipper.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vipper.persistencia.Conexion;

/**
 * Servlet implementation class ServletControl
 */
@WebServlet("/servletcontrol")
public class ServletControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html;charset=UTF-8");
	        try (PrintWriter out = response.getWriter()) {
	            /* TODO output your page here. You may use following sample code. */
	            out.println("<!DOCTYPE html>");
	            out.println("<html>");
	            out.println("<head>");
	            out.println("<title>Servlet ServletControl</title>");            
	            out.println("</head>");
	            out.println("<body>");
	            out.println("<h1>Servlet ServletControl at " + request.getContextPath() + "</h1>");
	            
	            AccesoBBDD ab1= new AccesobbDD();
	            
	            //Recoger los valores del formulario
	            String jusuario = request.getParameter("usuario");
	            String jpassword = request.getParameter("password");
	            
	            String passwordBBDD=ab1.verificarPassword(jusuario);
	            
	            if (jpassword.equals("12345")) {
	                 out.println("Bienvenido a la p�gina web " + jusuario);
	            } else
	            {
	                 out.println("Su contrase�a es inv�lida " + jusuario);
	            }
	           
	            out.println("</body>");
	            out.println("</html>");
	}}

}
