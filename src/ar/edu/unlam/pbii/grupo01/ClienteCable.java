package ar.edu.unlam.pbii.grupo01;

import ar.edu.unlam.pbii.grupo01.enumeradores.Premium;
import ar.edu.unlam.pbii.grupo01.interfaces.ICable;

public class ClienteCable extends Cliente implements ICable {

	private String codigoDecodificador;
	private Boolean futbolCodificado;

	public ClienteCable(Integer nroSocio, String nombreSocio, String codigoDecodificador) {
		super(nroSocio, nombreSocio);
		this.codigoDecodificador = codigoDecodificador;
		this.futbolCodificado = false;
	}

	public String getCodigoDecodificador() {
		return codigoDecodificador;
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

