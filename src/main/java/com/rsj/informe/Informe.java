package com.rsj.informe;

import java.util.List;

import com.rsj.hibernate.InformeManager;

public class Informe {
	
	public static void main(String[] args) {
		Long idCliente=0L;
		if((args != null)&&(args.length==1) ) {
			
			if (args[0].isBlank() || (args[0].isEmpty())) {
				System.out.print("Error: El parámetro pasado es nulo o blanco");
			}else {
				try {
					idCliente=Long.parseLong(args[0]);
					InformeManager manager = new InformeManager();
					manager.setup();
					List<com.rsj.hibernate.Proveedores> listProveedores = manager.read(idCliente);
					manager.exit();
					GeneraFichero generaFichero = new GeneraFichero();
					generaFichero.escribirInforme(listProveedores);
				}catch (Exception e) {
					System.out.print("Error:"+ e);
				}
			
			}
					
			
			
		}else {
			System.out.print("Error: no se ha pasado ningún parámetro o se han pasado más de uno.");
		}

	}

}
