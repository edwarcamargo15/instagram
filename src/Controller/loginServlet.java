package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dto.Usuario;
import Util.Controlador;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
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
		Controlador c = new Controlador();
		
		String usua = request.getParameter("usuario");
		String contraseña= request.getParameter("contra");

	
		System.out.println("lA MADRE");
		System.out.println(usua);
		System.out.println(contraseña);
		System.out.println("QUE SI");
		boolean exito = c.login(usua, contraseña);
		System.out.println("login");
		if (exito==true){
			System.out.println("ingrese");
			HttpSession misession= request.getSession(true);
			//Usuario miUsuario= c.buscarUsuario(usua);
			
			//misession.setAttribute("usuario",miUsuario.getUsuario());
			//misession.setAttribute("pass",miUsuario.getPass());
			
//		RequestDispatcher rd = request.getRequestDispatcher("views/registrar.jsp");
			RequestDispatcher rd = request.getRequestDispatcher("/VistaUsuario/registrarUsuario.jsp");

        	rd.forward(request, response);
//			response.sendRedirect("views/registrar.jsp");

		} else{
			System.out.println("false");
			request.setAttribute("entrar", "falso");
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
			rd.forward(request, response);
		    
		}
	}

}
