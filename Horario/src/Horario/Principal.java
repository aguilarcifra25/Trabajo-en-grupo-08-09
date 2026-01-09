package Horario;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int op, opC3;
		
		System.out.println("Bienvenido a tu horario personal:\n");
		do {
			System.out.println("\nElija una opción.");
			System.out.println("Pulse 1.- Ver horario por día.");
			System.out.println("Pulse 2.- Ver horas de casa asignatura a la semana.");
			System.out.println("Pulse 3.- Ver que días hay una asignatura.");
			System.out.println("Pulse 0.- Salir del programa.");
			op=Leer.datoInt();
			
			switch (op) {
			
				case 0:
				break;
				
				case 1:
					
					System.out.println("\t Lunes: 1ºSASP, 2ºFOP, 3ºBBDD, 4ºPROG, 5ºPROG, 6ºEEDD");
					System.out.println("\t Martes: 1ºLMSGI, 2ºPROG, 3ºIPE1, 4ºSI, 5ºBBDD, 6ºSI");
					System.out.println("\t Miercoles: 1ºLMSGI, 2ºIPE1, 3ºPROG, 4ºPROG, 5ºSI, 6ºBBDD");
					System.out.println("\t Jueves: 1ºIPE1, 2ºPROG, 3ºEEDD, 4ºSI, 5ºBBDD, 6ºSI");
					System.out.println("\t Viernes: 1ºDASP, 2ºLMSGI, 3ºBBDD, 4ºPROG, 5ºPROG, 6ºEEDD");
					
				break;
				
				case 2:
					
					System.out.println("\nProgramación \t8 horas");
					System.out.println("SSII \t\t5 horas");
					System.out.println("BBDD \t\t5 horas");
					System.out.println("EEDD \t\t3 horas");
					System.out.println("IPE 1 \t\t3 horas");
					System.out.println("LLMM \t\t3 horas");
					System.out.println("FOP \t\t1 hora");
					System.out.println("Digitalización \t1 hora");
					System.out.println("Sostenibilidad \t1 hora");
					
				break;
	
				case 3:
					
					System.out.println("\nPulse 1 - Programación");
					System.out.println("Pulse 2 - SSII");
					System.out.println("Pulse 3 - BBDD");
					System.out.println("Pulse 4 - EEDD");
					System.out.println("Pulse 5 - IPE 1");
					System.out.println("Pulse 6 - LLMM");
					System.out.println("Pulse 7 - FOP");
					System.out.println("Pulse 8 - Digitalización");
					System.out.println("Pulse 9 - Sostenibilidad");
					
					opC3 = Leer.datoInt();
					
					System.out.println();
					
					switch (opC3) {
					
						case 1:
							
							System.out.println("Todos los días hay programación.");
							
						break;	
					
						case 2:
							
							System.out.println("Hay SSII todos los días menos los viernes.");
							
						break;
						
						case 3:
							
							System.out.println("Todos los días hay BBDD.");
							
						break;
						
						case 4:
							
							System.out.println("Hay EEDD los Lunes, Jueves y Viernes.");
							
						break;
						
						case 5:
							
							System.out.println("Hay IPE 1 los Martes, Miércoles y Jueves.");
							
						break;
							
						case 6:
							
							System.out.println("Hay LLMM los Martes, Miércoles y Viernes.");
						
						break;
						
						case 7:
							
							System.out.println("Solo hay FOP los Lunes.");
						
						break;
						
						case 8:
							
							System.out.println("Solo hay digitalización los Viernes.");
							
						break;
						
						case 9:
							
							System.out.println("Solo hay sostenibilidad los Miércoles.");
						
						break;
						
						default:
							
							System.err.println("Opción inválida.");
					}
					
					
				break;
					
				default:
					
					System.out.println("Error en la entrada de datos");
					
				break;
			
			}
			
			
		} while (op!=0);

			System.out.println("\n\n-----Gracias por usar este programa-----");
	
		
	}

}
