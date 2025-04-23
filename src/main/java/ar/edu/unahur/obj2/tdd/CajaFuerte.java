package ar.edu.unahur.obj2.tdd;

public class CajaFuerte {
	
	private Boolean abierta;
	
	public CajaFuerte() {
		this.abierta = true;
	}
	
	public Boolean estaAbierta() {
		return abierta;
	}

	public void cerrar(Integer clave) {
		this.abierta = false;
	}

	public void abrir(Integer clave) {
		this.abierta = true;
		
	}
}
