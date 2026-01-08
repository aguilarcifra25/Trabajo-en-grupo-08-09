package Horario;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
	
		int op;
		
		System.out.println("Bienvenido al consultor sobre tu horario escolar:");
		
		do {
		
		System.out.println("\nPulse 1 - Ver horario por día.");
		System.out.println("Pulse 2 - Ver horas de cada asignatura a la semana.");
		System.out.println("Pulse 0 - Salir del programa");
		op = Leer.datoInt();
		
			switch (op) {
			
				case 1: 
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
			
			}
		
		} while (op != 0);
		
		System.out.println("\n\n-----Gracias por usar este programa-----");
		
		
	}

}
