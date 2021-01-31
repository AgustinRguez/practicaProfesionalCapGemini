package ppDiaCinco;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarPrint {
	
	private GregorianCalendar calendario;
	
	public CalendarPrint() {
		this.calendario = new GregorianCalendar();
	}
		
	public void imprimirCalendario() {
		int comienzoDelMes = this.calendario.get(Calendar.DAY_OF_WEEK) - 1; // El mes empieza dia 5, viernes
		int diasDelMes = this.calendario.getActualMaximum(Calendar.DAY_OF_MONTH); // Dias del mes

		// Imprime los nombres de los dias espaciados
		this.imprimirDias();

		// Crea los espacios hasta el dia del comienzo del mes
		//this.espaciosSegunPrimerDia(comienzoDelMes);

		// Imprime los numeros de los dias
		this.imprimirNumeroDias(diasDelMes, comienzoDelMes);

	}

	private void imprimirDias() {
		System.out.printf("%4s", "Sun");
		System.out.printf("%4s", "Mon");
		System.out.printf("%4s", "Tue");
		System.out.printf("%4s", "Wed");
		System.out.printf("%4s", "Thu");
		System.out.printf("%4s", "Fri");
		System.out.printf("%4s", "Sat");
		System.out.println();
	}

	/*private void espaciosSegunPrimerDia(int comienzoDelMes) {
		for (int i = 0; i < comienzoDelMes - 1; i++) {
			System.out.printf("%4s", "");
		}
	}*/

	private void imprimirNumeroDias(int diasDelMes, int comienzoDelMes) {
		// For que iterara hasta la cantidad de dias que hay en el mes desde el 1
		for (int i = 0, diaDelMes = 1; diaDelMes <= diasDelMes; i++) {
			// Iterara por semanas, cada 7 dias salto de linea
			// La condicion de 'j' identifica en que dia de la semana estamos
			// Solo en la primer iteracion de 'i' hara menos iteraciones que 7
			for (int j = ((i == 0) ? comienzoDelMes - 1 : 0); j < 7 && (diaDelMes <= diasDelMes); j++) {
				System.out.printf("%4s", diaDelMes);
				diaDelMes++;
			}
			System.out.println();
		}
	}
}
