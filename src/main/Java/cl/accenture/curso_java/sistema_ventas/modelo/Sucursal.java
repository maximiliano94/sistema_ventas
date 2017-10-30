/**
 * 
 */
package cl.accenture.curso_java.sistema_ventas.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Martin Cuevas
 *
 */
public class Sucursal {
	private String sucursalId, nombre, direccion, telefono;
	private List<Vendedor> vendedores;

	/**
	 * 
	 */
	public Sucursal() {
		this.sucursalId = "";
		this.nombre = "";
		this.direccion = "";
		this.telefono = "";
		this.vendedores = new ArrayList<Vendedor>();
	}

	/**
	 * @param sucursalId
	 * @param nombre
	 * @param direccion
	 * @param telefono
	 * @param vendedores
	 */
	public Sucursal(String sucursalId, String nombre, String direccion, String telefono, List<Vendedor> vendedores) {
		this.sucursalId = sucursalId;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.vendedores = vendedores;
	}

	/**
	 * @return the sucursalId
	 */
	public String getSucursalId() {
		return sucursalId;
	}

	/**
	 * @param sucursalId
	 *            the sucursalId to set
	 */
	public void setSucursalId(String sucursalId) {
		this.sucursalId = sucursalId;
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
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion
	 *            the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono
	 *            the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the vendedores
	 */
	public List<Vendedor> getVendedores() {
		return vendedores;
	}

	/**
	 * @param vendedores
	 *            the vendedores to set
	 */
	public void setVendedores(List<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}

}
