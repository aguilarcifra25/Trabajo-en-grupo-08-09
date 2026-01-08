package Horario;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		
		System.out.println("Bienvenido a tu horario personal");
		do {
			System.out.println("Elija una opcion");
			System.out.println("Pulse 1.- Ver horario por día");
			System.out.println("Pulse 2.- Ver horas de casa asignatura a la semana");
			op=Leer.datoInt();
			
			switch (op) {
				case 1:
				System.out.println("\t Lunes: 1ºSASP, 2ºFOP, 3ºBBDD, 4ºPROG, 5ºPROG, 6ºEEDD");
				System.out.println("\t Martes: 1ºLMSGI, 2ºPROG, 3ºIPE1, 4ºSI, 5ºBBDD, 6ºSI");
				System.out.println("\t Miercoles: 1ºLMSGI, 2ºIPE1, 3ºPROG, 4ºPROG, 5ºSI, 6ºBBDD");
				System.out.println("\t Jueves: 1ºIPE1, 2ºPROG, 3ºEEDD, 4ºSI, 5ºBBDD, 6ºSI");
				System.out.println("\t Viernes: 1ºDASP, 2ºLMSGI, 3ºBBDD, 4ºPROG, 5ºPROG, 6ºEEDD");
					break;
				
				case 2:
				
					break;

				default:
					System.out.println("Error en la entrada de datos");
					break;
			}
			
			
		} while (op!=0);
	

	}

}
