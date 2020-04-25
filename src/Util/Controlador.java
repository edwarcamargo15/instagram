package Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import Dao.GenericDao;
import Dao.UsuarioDao;
import Dto.Usuario;

public class Controlador {

	
	
public Controlador() {
		
	}
	
	
    public void registrarUsuario(String nombre,String apellido,String usuario, String contraseña,String email,int pais,String fechaN,Date fecR) throws ParseException{
    	 SimpleDateFormat d=new SimpleDateFormat("yyyy-MM-dd");
        // Date fechare;
         Date fechana;
         
         //fechare = d.parse(fecR);
         fechana = d.parse(fechaN);
    	
	    Usuario usu = new Usuario(nombre,apellido,usuario,contraseña,email,pais,fechana,fecR);
	    GenericDao<Usuario> usDao = new UsuarioDao();
	    usDao.insert(usu);
	}
    
   
   
    public Usuario buscarUsuario(String nombre) {
		
		GenericDao<Usuario> us= new UsuarioDao();
		Usuario u = us.find(nombre);
		return u;
}
    
    
    public boolean login(String usuario,String password){
    	System.out.println(usuario + "hpta" + password);
		GenericDao<Usuario> usDao= new UsuarioDao();
		System.out.println("que mierda");
		List<Usuario> us=usDao.list();
		for( Usuario usu:us) {
			if(usu.getUsuario().equals(usuario)&&usu.getPass().equals(password)) {
			
				return true;
			}		
			
		}
		return false;
			
		
	}
 

}
