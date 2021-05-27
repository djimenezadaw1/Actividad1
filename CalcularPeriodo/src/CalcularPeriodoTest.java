import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

class CalcularPeriodoTest {

	@Test
	void test() {
		LocalDate fecha = LocalDate.of(1989, Month.NOVEMBER, 9);
		String msg = CalcularPeriodo.calcularPeriodo("Caida de berlin", fecha);
		String valor = "La caida de berlin fue hace 5 años";
		assertEquals(valor, msg);
	}

}
