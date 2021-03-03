package ar.edu.unlam.pbii.grupo01;

import ar.edu.unlam.pbii.grupo01.interfaces.ITelefonia;

public class ClienteTelefonia extends Cliente implements ITelefonia{

	private String codigoArea;
	private String nroTelefono;

	public ClienteTelefonia(Integer nroSocio, String nombreSocio, String codigoArea, String nroTelefono) {
		super(nroSocio, nombreSocio);
		this.codigoArea = codigoArea;
		this.nroTelefono = nroTelefono;
	}

	public String getCodigoDeArea() {
		return codigoArea;
	}

	public String getTelefono() {
		return nroTelefono;
	}
}
