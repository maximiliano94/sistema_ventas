/**
 * 
 */
package cl.accenture.curso_java.sistema_ventas.controladores;

import java.util.List;
import java.io.Serializable;
import java.sql.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import cl.accenture.curso_java.sistema_ventas.dao.UsuarioDAO;
import cl.accenture.curso_java.sistema_ventas.modelo.Perfil;
import cl.accenture.curso_java.sistema_ventas.modelo.Usuario;

/**
 * @author maxi
 *
 */
@ManagedBean
@SessionScoped
public class CrearUsuarioControlador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2037399366400838551L;
	private String rut;
	private String nombre;
	private String apellido;
	private String email;
	private String password;
	private Date fechanaciminento;
    private Perfil perfil;
    private String mensaje;
	private Usuario usuarios;
    
    
    
	public CrearUsuarioControlador() {
		this.rut="";
		this.nombre="";
		this.apellido="";
		this.email="";
		this.password="";
		this.perfil=new Perfil();
		this.mensaje="";
		this.usuarios = new Usuario();
		
		obtenerususario();

		
	}



	private void obtenerususario() {
		// TODO Auto-generated method stub
		
	}



	public String getRut() {
		return rut;
	}



	public void setRut(String rut) {
		this.rut = rut;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Date getFechanaciminento() {
		return fechanaciminento;
	}



	public void setFechanaciminento(Date fechanaciminento) {
		this.fechanaciminento = fechanaciminento;
	}



	public Perfil getPerfil() {
		return perfil;
	}



	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public String getMensaje() {
		return mensaje;
	}



	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}



	public Usuario getUsuarios() {
		return usuarios;
	}



	public void setUsuarios(Usuario usuarios) {
		this.usuarios = usuarios;
	}
    
	public String agregarusuario(){
		Usuario usuario = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
		Usuario usuario2 = new Usuario();
		usuario.setNombre( this.nombre );
		usuario.setApellido(this.apellido);
		usuario.setFechaDeNacimiento(this.fechanaciminento);
		usuario.setEmail(this. email);
		usuario.setPassword(this.password);
		usuario.setPerfil(this.perfil);
		usuario.setRut(this.rut);
		usuario.setNombre(usuario.getNombre());
		usuario.setApellido(usuario.getApellido());
		usuario.setFechaDeNacimiento(usuario.getFechaDeNacimiento());
		usuario.setEmail(usuario.getEmail());
		usuario.setPassword(usuario.getPassword());
		usuario.setRut(usuario.getRut());
		try {
			UsuarioDAO.ingresarUsuario(Usuario)
			this.mensaje = "El Usuario se creo correctamente";
		} catch (Exception e) {
			this.mensaje = "Ocurrio un error al crear el usuario";
		}
		return "";
	}
	
}
