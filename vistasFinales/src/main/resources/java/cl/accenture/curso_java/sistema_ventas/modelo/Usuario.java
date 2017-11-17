/**
 * 
 */
package cl.accenture.curso_java.sistema_ventas.modelo;

import java.util.Date;

import cl.accenture.curso_java.sistema_ventas.controladores.CrearUsuarioControlador;

/**
 * @author Juan Mendoza
 *
 */
public class Usuario {
	
	private String rut;
	private String nombre;
	private String apellido;
	private String password;
	private String email;
	private Date fechaDeNacimiento;
	private Perfil perfil;
	/**
	 * 
	 */
	public Usuario() {
	}
	/**
	 * @param rut
	 * @param nombre
	 * @param password
	 * @param email
	 * @param fechaDeNacimiento
	 * @param perfil
	 */
	public Usuario(String rut, String nombre,String apellido, String password, String email, Date fechaDeNacimiento, Perfil perfil) {
		this.rut = rut;
		this.nombre = nombre;
		this.password = password;
		this.email = email;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.perfil = perfil;
		this.apellido=apellido;
	}
	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}
	/**
	 * @param usuario 
	 * @param rut the rut to set
	 */
	public void setRut( String rut) {
		this.rut = rut;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param  
	 * @param email the email to set
	 */
	public void setEmail( String email) {
		this.email = email;
	}
	/**
	 * @return the fechaDeNacimiento
	 */
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	/**
	 * @param fechaDeNacimiento the fechaDeNacimiento to set
	 */
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	/**
	 * @return the perfil
	 */
	public Perfil getPerfil() {
		return perfil;
	}
	/**
	 * @param perfil the perfil to set
	 */
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Usuario){
			Usuario usuario = (Usuario)obj;
			return usuario.getRut().equals(this.rut);
		}
		return super.equals(obj);
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	

}
