package ar.edu.unlam.pbii.grupo01;

import ar.edu.unlam.pbii.grupo01.enumeradores.Premium;
import ar.edu.unlam.pbii.grupo01.interfaces.IBandaAncha;
import ar.edu.unlam.pbii.grupo01.interfaces.ICable;
import ar.edu.unlam.pbii.grupo01.interfaces.ITelefonia;

public class ClienteTri extends Cliente implements IBandaAncha, ICable, ITelefonia {

	private String codigoArea;
	private String nroTelefono;
	private String codigoDecodificador;
	private String eMail;
	private Boolean futbolCodificado;

	public ClienteTri(Integer nroSocio, String nombreSocio, String codigoArea, String nroTelefono,
			String codigoDecodificador, String eMail) {
		super(nroSocio, nombreSocio);
		this.codigoArea = codigoArea;
		this.nroTelefono = nroTelefono;
		this.codigoDecodificador = codigoDecodificador;
		this.eMail = eMail;
		this.futbolCodificado = false;
	}

	public String getCodigoDeArea() {
		return codigoArea;
	}

	public String getNroTelefono() {
		return nroTelefono;
	}

	public String getCodigoDecodificador() {
		return codigoDecodificador;
	}

	public String getEMail() {
		return eMail;
	}

	@Override
	public Boolean activarPremium(Premium nombreCodificado) {

		switch (nombreCodificado) {
		case FUTBOL: {
			if (!futbolCodificado) {
				futbolCodificado = true;
			}
			return futbolCodificado;
		}
		default:
			return false;
		}
	}
}
