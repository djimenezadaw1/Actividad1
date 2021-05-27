import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CalcularPeriodo {
	
	public static void main(String[] args) {
		
		//Creamos la fecha del descubrimiento de américa
		LocalDate fecha = LocalDate.of(1492, Month.OCTOBER, 12);
		LocalDate fecha2 = LocalDate.of(1929, Month.OCTOBER, 24); // A�adimos otra fecha
		LocalDate fecha3 = LocalDate.of(1945, Month.SEPTEMBER, 2); // A�adimos otra fecha
		LocalDate fecha4 = LocalDate.of(1789, Month.MAY, 5);
		// Mostramos cuánto tiempo ha pasado
		calcularPeriodo("El descubrimiento de Am�rica", fecha);
		calcularPeriodo("Caida de Wall Sreet", fecha2);
		calcularPeriodo("El fin de la segunda guerra mundia", fecha3);
		calcularPeriodo("La revoluci�n francesa", fecha4);
		
		
	}
	
	public static String calcularPeriodo(String nombre, LocalDate fecha) {
        
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fecha, fechaActual);
        
        // Cálculo de las diferencias
        int anyos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();
        
        String texto = String.format(nombre + " ocurri� hace %d a�os, %d meses y %d d�as.", anyos, meses, dias);
        System.out.println(texto); 
        return texto;
        
    }
 
}
