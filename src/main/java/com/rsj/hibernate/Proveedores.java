package com.rsj.hibernate;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name = "proveedores")
@IdClass(ProveedoresPK.class)
public class Proveedores implements Serializable{
	
	    /**
	 * 
	 */
	private static final long serialVersionUID = 451019805945910990L;
		private Long idProveedor;
	    private String nombre;
	    private Date fechaAlta;
	    private Long idCliente;
	 
	    public Proveedores() {
	    }
	    
	    @Id
	    @Column(name = "id_proveedor")
	    public Long getIdProveedor() {
			return idProveedor;
		}

		public void setIdProveedor(Long idProveedor) {
			this.idProveedor = idProveedor;
		}
		@Id
		@Column(name = "id_cliente")
		public Long getIdCliente() {
			return idCliente;
		}

		public void setIdCliente(Long idCliente) {
			this.idCliente = idCliente;
		}
		
		@Column(name = "nombre")
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		@Temporal(TemporalType.DATE)
		@Column(name = "fecha_de_alta")
		public Date getFechaAlta() {
			return fechaAlta;
		}

		public void setFechaAlta(Date fechaAlta) {
			this.fechaAlta = fechaAlta;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((fechaAlta == null) ? 0 : fechaAlta.hashCode());
			result = prime * result + ((idCliente == null) ? 0 : idCliente.hashCode());
			result = prime * result + ((idProveedor == null) ? 0 : idProveedor.hashCode());
			result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
			Proveedores other = (Proveedores) obj;
			if (fechaAlta == null) {
				if (other.fechaAlta != null)
					return false;
			} else if (!fechaAlta.equals(other.fechaAlta))
				return false;
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
			if (nombre == null) {
				if (other.nombre != null)
					return false;
			} else if (!nombre.equals(other.nombre))
				return false;
			return true;
		}

		
		
	 
	   
	    
	 
	
	
	
}
