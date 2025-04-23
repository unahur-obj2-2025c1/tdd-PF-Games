package ar.edu.unahur.obj2.tdd;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CajaFuerteTest {

	@Test
	public void queLaCajaFuerteEsteAbiertaAlCrearse() {
		CajaFuerte caja = new CajaFuerte();
		assertTrue(caja.estaAbierta());
	}


	@Test
	public void queSePuedaCerrarLaCajaFuerteConUnCodigo() {
		CajaFuerte caja = new CajaFuerte();
		caja.cerrar(1234);
		assertFalse(caja.estaAbierta());
	}
	
	@Test
	public void queSePuedaAbrirLaCajaFuerteConUnCodigo() {
		CajaFuerte caja = new CajaFuerte();
		caja.cerrar(1234);
		caja.abrir(1234);
		assertTrue(caja.estaAbierta());
	}

}