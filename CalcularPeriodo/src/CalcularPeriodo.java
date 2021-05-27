import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CalcularPeriodo {
	
	public static void main(String[] args) {
		
		//Creamos la fecha del descubrimiento de amÃ©rica
		LocalDate fecha = LocalDate.of(1492, Month.OCTOBER, 12);
		LocalDate fecha2 = LocalDate.of(1929, Month.OCTOBER, 24); // Añadimos otra fecha
		LocalDate fecha3 = LocalDate.of(1945, Month.SEPTEMBER, 2); // Añadimos otra fecha
		LocalDate fecha4 = LocalDate.of(1789, Month.MAY, 5);
		// Mostramos cuÃ¡nto tiempo ha pasado
		calcularPeriodo("El descubrimiento de América", fecha);
		calcularPeriodo("Caida de Wall Sreet", fecha2);
		calcularPeriodo("El fin de la segunda guerra mundia", fecha3);
		calcularPeriodo("La revolución francesa", fecha4);
		
		
	}
	
	public static String calcularPeriodo(String nombre, LocalDate fecha) {
        
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fecha, fechaActual);
        
        // CÃ¡lculo de las diferencias
        int anyos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();
        
        String texto = String.format(nombre + " ocurrió hace %d años, %d meses y %d días.", anyos, meses, dias);
        System.out.println(texto); 
        return texto;
        
    }
 
}
