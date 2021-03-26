package org.codigorupestre.ejersicio.model;

import java.util.logging.Logger;

public class Pasajero {

	private static final Logger LOGGER = Logger.getLogger(Pasajero.class.getName());

	private String nombre;
	private String apellidos;
	private String direccion;
	private String email;
	private String telefono;
	private Voleto voleto;

	public void ventaVoleto(Voleto voleto) {
		LOGGER.info("Nombre del pasajero: " + nombre + " " + apellidos);
		LOGGER.info("Email: " + email);
		LOGGER.info("Telefono: " + telefono);
		LOGGER.info("Numero del Voleto: " + voleto.getNumVoleto());
		LOGGER.info("Lugar de salida: " + voleto.getSalida());
		LOGGER.info("Lugar destino: " + voleto.getDestino());
		LOGGER.info("Lugar horario: " + voleto.getHorario());
		LOGGER.info("Asiento: " + voleto.getAsiento());
		LOGGER.info("Costo: " + voleto.getPrecio());
	}

	public void enviarNotivicacionEmailVoleto() {
		LOGGER.info("Se envio los datos de la compra del voleto No. " + voleto.getNumVoleto() + " al correo: " + email);
	}
	
	public void enviarNotivicacionSmsVoleto() {
		LOGGER.info("Se envio los datos de la compra del voleto No. " + voleto.getNumVoleto() + " al telefono: " + telefono);
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the voleto
	 */
	public Voleto getVoleto() {
		return voleto;
	}

	/**
	 * @param aereolina the voleto to set
	 */
	public void setVoleto(Voleto voleto) {
		this.voleto = voleto;
	}

}
