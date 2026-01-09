package Horario;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int op, dia;
		
		System.out.println("Bienvenido a tu horario personal");
		do {
			System.out.println("Elija una opcion");
			System.out.println("Pulse 1.- Ver horario por día");
			System.out.println("Pulse 2.- Ver horas de casa asignatura a la semana");
			System.out.println("Pulse 4.- Ver el horario de cada día");
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
					
				case 4:
					System.out.println("Seleccione que dia quiere ver el horario");
					System.out.println("1.-Lunes");
					System.out.println("2.-Martes");
					System.out.println("3.-Miercoles");
					System.out.println("4.-Jueves");
					System.out.println("5.-Viernes");
					dia=Leer.datoInt();
					switch (dia) {
					case 1:
						System.out.println("Tus asignaturas del lunes son :1ºSASP, 2ºFOP, 3ºBBDD, 4ºPROG, 5ºPROG, 6ºEEDD");
						break;
						
					case 2:
						System.out.println("Tus asignaturas del martes son :1ºLMSGI, 2ºPROG, 3ºIPE1, 4ºSI, 5ºBBDD, 6ºSI");
						break;
						
					case 3:
						System.out.println("Tus asignaturas del miercoles son :1ºLMSGI, 2ºIPE1, 3ºPROG, 4ºPROG, 5ºSI, 6ºBBDD");
						break;
						
					case 4:
						System.out.println("Tus asignaturas del jueves son :1ºIPE1, 2ºPROG, 3ºEEDD, 4ºSI, 5ºBBDD, 6ºSI");
						break;
						
					case 5: 
						System.out.println("Tus asignaturas del viernes son :1ºDASP, 2ºLMSGI, 3ºBBDD, 4ºPROG, 5ºPROG, 6ºEEDD");
						break;

					default:
						System.out.println("Entrada de datos incorrecta");
						break;
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
