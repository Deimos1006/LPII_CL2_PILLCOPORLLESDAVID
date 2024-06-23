package controlador;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassProductolmp;
import model.TblProductocl2;




/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }//fin del controlador 

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TblProductocl2 producto = new TblProductocl2();
		ClassProductolmp crud = new ClassProductolmp();
		List<TblProductocl2>listadoproducto=crud.ListadoProducto();
		//invocamos el listado de productos para la vista
		request.setAttribute("listadoProductos",listadoproducto);
		//redireccionamos
		request.getRequestDispatcher("/ListadoProducto.jsp").forward(request,response);
	}// fin del metodo do get

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombrecl2 =request.getParameter("nombrecl2");
		double precioventacl2 ;
		precioventacl2 = Double.parseDouble("precioventacl2");
		Double preciocompcl2=Double.parseDouble("preciocompcl2");
		String estadocl2=request.getParameter("estadocl2");
		String descripcl2=request.getParameter("descripcl2");
		
		
		//instanciar las respectivas entidades
		TblProductocl2 producto =new TblProductocl2();
		ClassProductolmp crud=new ClassProductolmp();
		//asignamos valores
		producto.setNombrecl2(nombrecl2);
		producto.setPrecioventacl2(precioventacl2);
		producto.setPreciocompcl2(preciocompcl2);
		producto.setEstadocl2(estadocl2);
		producto.setDescripcl2(descripcl2);
		//invocamos al metodo registrar
		crud.RegistrarProducto(producto);		
		//redirecionamos
		
		request.getRequestDispatcher("/ListadoProducto.jsp").forward(request, response);
	}//fin del metodo do post

}
