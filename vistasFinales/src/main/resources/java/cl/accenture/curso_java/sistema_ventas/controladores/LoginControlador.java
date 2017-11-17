/**
 * 
 */
package cl.accenture.curso_java.sistema_ventas.controladores;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author maxi
 *
 */
@ManagedBean
@SessionScoped
public class LoginControlador  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6684705019580556288L;
	private String nombreUsuario;
	private String password;
	private String mensaje;
	private boolean error;
	
	
	public LoginControlador() {
		this.nombreUsuario="";
		this.password="";
		this.mensaje="";
	}


	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}


	public boolean isError() {
		return error;
	}


	public void setError(boolean error) {
		this.error = error;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String IniciarSecion(){
		if (this.nombreUsuario.equals("admin")&& this.password.equals("admin2017")) {
			this.mensaje="";
			this.error=false;
			return "principal2?faces-redirect=true";
		}else{
			this.error=true;
			this.mensaje="Usuario y/o Password incorrectos";
			return"";
		}
	}
	
	

}
