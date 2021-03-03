package ar.edu.unlam.pbii.grupo01;

public class Cliente {

	private Integer nroSocio;
	private String nombreSocio;
	

	public Cliente(Integer nroSocio, String nombreSocio) {
		this.nroSocio = nroSocio;
		this.nombreSocio = nombreSocio;
	}

	public Integer getNroSocio() {
		return nroSocio;
	}

	public String getNombreSocio() {
		return nombreSocio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nroSocio == null) ? 0 : nroSocio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cliente))
			return false;
		Cliente other = (Cliente) obj;
		if (nroSocio == null) {
			if (other.nroSocio != null)
				return false;
		} else if (!nroSocio.equals(other.nroSocio))
			return false;
		return true;
	}

	
}
