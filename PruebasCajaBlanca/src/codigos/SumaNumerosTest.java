package codigos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SumaNumerosTest {

	@ParameterizedTest
	@MethodSource("sumaNum")
	void testSumaNumeros(int num, int expected) {
		SumaNumeros sumador = new SumaNumeros();
		
		int resultado = sumador.sumaNumeros(num);
		assertEquals(expected, resultado);
	}

	private static Stream<Arguments> sumaNum() {
		return Stream.of(
				Arguments.of(0,0),
				Arguments.of(3,2),
				Arguments.of(2,2),
				Arguments.of(7,12)
				);
	}

}
