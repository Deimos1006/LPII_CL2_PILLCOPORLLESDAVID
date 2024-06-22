package TestEntidades;

import Dao.ClassUsuariolmp;
import model.TblUsuariocl2;

public class TestEntidadUsuario {
	
	public static void main(String[] args){
		TblUsuariocl2 usuario = new TblUsuariocl2();
		ClassUsuariolmp crud = new ClassUsuariolmp ();
		usuario.setUsuariocl2("david pillco");
		usuario.setPasswordcl2("555corriente");
		crud.RegistrarUsuario(usuario);
	}

}
