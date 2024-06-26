package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassUsuariolmp;
import model.TblUsuariocl2;

/**
 * Servlet implementation class ControladorUsuario
 */
public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }//fin del controlador

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TblUsuariocl2 usuario = new TblUsuariocl2();
		ClassUsuariolmp crud = new ClassUsuariolmp();
		List<TblUsuariocl2>listadousuario=crud.ListadoUsuario();
		//invocamos el listado de productos para la vista
		request.setAttribute("listadousuarios",listadousuario);
		//redireccionamos
		request.getRequestDispatcher("/ListadoUsuario.jsp").forward(request,response);
	}//fin del metodo do get

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String usuariocl2=request.getParameter("usuariocl2");
		String password=request.getParameter("password");
		
		//instanciar las respectivas entidades
		TblUsuariocl2 usuario =new TblUsuariocl2();
		ClassUsuariolmp crud=new ClassUsuariolmp();
		//asignamos valores
		usuario.setUsuariocl2(usuariocl2);
		usuario.setPasswordcl2(password);
		//invocamos al metodo registrar
		crud.RegistrarUsuario(usuario);		
		//redirecionamos
		List<TblUsuariocl2>listadousuario=crud.ListadoUsuario();
		//invocamos el listado de productos para la vista
		request.setAttribute("listadousuarios",listadousuario);
		//redireccionamos
		request.getRequestDispatcher("/ListadoUsuario.jsp").forward(request,response);
	}//fin del metodo do post

}
