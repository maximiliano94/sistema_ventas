/**
 * 
 */
package cl.accenture.curso_java.sistema_ventas.modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Martin Cuevas
 *
 */
public class Vendedor {
	private String id, rut, nombre, apellido;
	private Calendar fechaNacimiento;

	/**
	 * 
	 */
	public Vendedor() {
		this.id = id;
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = new GregorianCalendar(0, 0, 0);
	}

	/**
	 * @param id
	 * @param rut
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 */
	public Vendedor(String id, String rut, String nombre, String apellido, Calendar fechaNacimiento) {
		this.id = id;
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * @param rut
	 *            the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido
	 *            the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento
	 *            the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void obtenerVentas() {

	}

}
