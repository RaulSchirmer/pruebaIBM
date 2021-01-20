package com.rsj.informe;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.List;

import com.rsj.hibernate.Proveedores;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class GeneraFichero {
	
	public void escribirInforme(List<com.rsj.hibernate.Proveedores> listProveedores) {
		


		Writer out = null;
		try {
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("pruebaTXT.txt"), "UTF-8"));
			if (null == listProveedores || listProveedores.isEmpty())
			{
				try {
					out.write("No se encuentran proveedores para este cliente");
					
				} catch (IOException ex) {
					System.out.println("Mensaje excepcion escritura: " + ex.getMessage());
				}
			} else {
				// Escribimos linea a linea en el fichero
				for (com.rsj.hibernate.Proveedores proveedor : listProveedores) {
					try {
						out.write(convierteString(proveedor)+"\n");
						
					} catch (IOException ex) {
						System.out.println("Mensaje excepcion escritura: " + ex.getMessage());
					}
				}	
			}

		} catch (UnsupportedEncodingException ex2) {
			System.out.println("Error: " + ex2.getMessage());
		} catch ( FileNotFoundException ex4) {
			System.out.println("Error: " + ex4.getMessage());
		}finally {
			try {
				out.close();
			} catch (IOException ex3) {
				System.out.println("Error en cierre fichero: " + ex3.getMessage());
			}
		}
	}
	
	public String convierteString (Proveedores obj) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		
		StringBuilder proveedor=new StringBuilder();
		proveedor.append(" | ");
		proveedor.append(obj.getIdProveedor());
		proveedor.append(" | ");
		proveedor.append(obj.getNombre());
		proveedor.append(" | ");
		proveedor.append(formato.format(obj.getFechaAlta()));
		proveedor.append(" | ");
		proveedor.append(obj.getIdCliente());
		proveedor.append(" | ");
		return proveedor.toString();
	}
    
		
}
