package Dao;


import Dto.Usuario;
import Util.Conexion;


public class UsuarioDao 
extends Conexion<Usuario>
implements GenericDao<Usuario>{

	public UsuarioDao() {
		super(Usuario.class);
	}

	
	
}



