package ar.edu.unlam.pbii.grupo01;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unlam.pbii.grupo01.enumeradores.Premium;
import ar.edu.unlam.pbii.grupo01.interfaces.ICable;

public class Empresa {

	private String nombreEmpresa;
	private Set<Cliente> clientes;

	public Empresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
		this.clientes = new HashSet<Cliente>();
	}
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	
	public Integer getCantidadAbonados() {
		return clientes.size();
	}

	public void agregarCliente(Cliente clienteAgregado) {
		this.clientes.add(clienteAgregado);
	}

	public Boolean habilitarPremium(Premium nombreCodificado, Cliente nombreCliente) throws NoEsClienteConCableException{
		if (nombreCliente instanceof ICable) {
			return ((ICable) nombreCliente).activarPremium(nombreCodificado);
		}
		else {
			throw new NoEsClienteConCableException("No es cliente de cable");
		}
	}
}
