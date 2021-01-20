package com.rsj.hibernate;

import java.io.Serializable;

public class ProveedoresPK implements Serializable{

	/**
	 * Clave doble de la tabla Proveedores
	 */
	private static final long serialVersionUID = -606355279193048573L;
	private Long idProveedor;
    private Long idCliente;
 
    public ProveedoresPK() {
    }
    
    public ProveedoresPK(Long idProveedor, Long idCliente) {
    	this.setIdCliente(idCliente);
    	this.setIdProveedor(idProveedor);
    }

	

	public long getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Long idProveedor) {
		this.idProveedor = idProveedor;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCliente == null) ? 0 : idCliente.hashCode());
		result = prime * result + ((idProveedor == null) ? 0 : idProveedor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProveedoresPK other = (ProveedoresPK) obj;
		if (idCliente == null) {
			if (other.idCliente != null)
				return false;
		} else if (!idCliente.equals(other.idCliente))
			return false;
		if (idProveedor == null) {
			if (other.idProveedor != null)
				return false;
		} else if (!idProveedor.equals(other.idProveedor))
			return false;
		return true;
	}
	
	
}
