package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.lUsuario;
import model.TblUsuariocl2;


public class ClassUsuariolmp implements lUsuario{

	@Override
	public void RegistrarUsuario(TblUsuariocl2 usuario) {
		//establecer conexion con la unidad de persistencia.....
				EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL2_PILLCOPORLLESDAVID");
				//permite gestionar entidades
				EntityManager em=fabr.createEntityManager();
				//iniciar transmiciones
				em.getTransaction().begin();
				//registramos
				em.persist(usuario);
				//emitimos mensaje por consola
			
				//confirmamos
				em.getTransaction().commit();
				//cerramos la transaccion
				em.close();
	}

	@Override
	public void ActualizarUsuario(TblUsuariocl2 usuario) {
		//establecemos conexion con la unidad de persistencia
				EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL2_PILLCOPORLLESDAVID");
				//permite gestionar entidades
				EntityManager em=fabr.createEntityManager();
				//Iniciar transaccion
				em.getTransaction().begin();
				//actualizamos
				em.persist(usuario);
				//emitimos mensaje por consola
			
				//confirmamos
				em.getTransaction().commit();
				//cerramos la transaccion
				em.close();
		
	}

	@Override
	public void EliminarUsuario(TblUsuariocl2 usuario) {
		//establecemos conexion con la unidad de persistencia
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL2_PILLCOPORLLESDAVID");
		//permite gestionar entidades
		EntityManager em=fabr.createEntityManager();
		//Iniciar transaccion
		em.getTransaction().begin();
		//Recuperamos el codigo eliminar
		TblUsuariocl2 elim=em.merge(usuario);
		//Procedemos a eliminar el registro
		em.remove(elim);
		//emitimos mensaje por consola
		System.out.println("usuario eliminado de la base de datos");
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		
	}

	@Override
	public TblUsuariocl2 BuscarUsuario(TblUsuariocl2 usuario) {
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL2_PILLCOPORLLESDAVID");
		EntityManager em=fabr.createEntityManager();
		em.getTransaction().begin();
		//recuperamos el codigo
		TblUsuariocl2 buscusuario=em.find(TblUsuariocl2.class, usuario.getIdusuario());
		em.getTransaction().commit();
		em.close();
		return buscusuario;
	}

	@Override
	public List<TblUsuariocl2> ListadoUsuario() {
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("LPII_CL2_PILLCOPORLLESDAVID");
		EntityManager em=fabr.createEntityManager();
		em.getTransaction().begin();
		List<TblUsuariocl2>listadousuario=em.createQuery("select c from TblUsuariocl2 c", TblUsuariocl2.class).getResultList();
		em.getTransaction().commit();
		em.close();
		return listadousuario;
	}



}
