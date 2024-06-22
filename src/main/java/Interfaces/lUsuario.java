package Interfaces;

import java.util.List;

import model.TblUsuariocl2;

public interface lUsuario {
	
	public void RegistrarUsuario (TblUsuariocl2 usuario);
	public void ActualizarUsuario (TblUsuariocl2 usuario);
	public void EliminarUsuario (TblUsuariocl2 usuario);
	public TblUsuariocl2 BuscarUsuario (TblUsuariocl2 usuario);
	public List<TblUsuariocl2> ListadoUsuario();

}
