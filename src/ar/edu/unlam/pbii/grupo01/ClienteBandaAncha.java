package ar.edu.unlam.pbii.grupo01;

import ar.edu.unlam.pbii.grupo01.interfaces.IBandaAncha;

public class ClienteBandaAncha extends Cliente implements IBandaAncha{

	private String eMail;

	public ClienteBandaAncha(Integer nroSocio, String nombreSocio, String eMail) {
		super(nroSocio, nombreSocio);
		this.eMail = eMail;
	}

	public String getEMail() {
		return eMail;
	}
}
