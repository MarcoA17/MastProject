package org.codigorupestre.ejersicio.main;

import java.util.logging.Logger;

import org.codigorupestre.ejersicio.model.Pasajero;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VentaVoletoMain {

	private static final Logger LOGGER = Logger.getLogger(VentaVoletoMain.class.getName());
	public static void main(String[] args) {
		LOGGER.info("<<<<Inicia Contexto>>>>>");
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Pasajero pasajero = null;
		
		pasajero = appContext.getBean("ventaVoleto", Pasajero.class);
		
		pasajero.ventaVoleto(pasajero.getVoleto());
		pasajero.enviarNotivicacionEmailVoleto();
		pasajero.enviarNotivicacionSmsVoleto();
		
		LOGGER.info("<<<Termina Contexto>>>");

	}

}
