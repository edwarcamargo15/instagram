package Controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Util.Controlador;

/**
 * Servlet implementation class registrarServlet
 */
@WebServlet("/registrarServlet")
public class registrarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registrarServlet() {
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
		doGet(request, response);
		
		String nombre=   request.getParameter("name");
		String apellido= request.getParameter("apellido");
		String user=   request.getParameter("usuario");
		String contraseña=   request.getParameter("pass");
		String email=   request.getParameter("email");
		int pais= Integer.parseInt(request.getParameter("pais"));
		String fechaNac= request.getParameter("fechN");
		Date da= new Date();
		
		
		
		Controlador c = new Controlador();
		try {
			c.registrarUsuario(nombre,apellido,user,contraseña,email,pais,fechaNac,da);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("./index.jsp");
		
		
				
		
	}

}
