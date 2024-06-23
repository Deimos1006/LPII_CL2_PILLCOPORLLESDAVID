package TestEntidades;

import Dao.ClassProductolmp;
import model.TblProductocl2;

public class TestEntidadProducto {
	public static void main(String[] args){
		TblProductocl2 producto = new TblProductocl2();
		ClassProductolmp crud = new ClassProductolmp ();
		producto.setNombrecl2("refrigeradora");
		producto.setPrecioventacl2(2324);
		producto.setPreciocompcl2(2000);
		producto.setEstadocl2("new");
		producto.setDescripcl2("te encantara");
		crud.RegistrarProducto(producto);
		
		
	}
}
