import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoTest {

	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible deposito = new DepositoCombustible (50,20);
		double nivel = deposito.getDepositoNivel();
		assertEquals((int)20,(int)nivel);
	}

	@Test
	public void testGetDepositoMax() {
		DepositoCombustible deposito = new DepositoCombustible (50,20);
		double max = deposito.getDepositoMax();
		assertEquals((int)50,(int)max);
	}

	@Test
	public void testEstaVacio() {
		DepositoCombustible deposito = new DepositoCombustible (50,0);
		assertTrue(deposito.estaVacio());
	}

	@Test
	public void testEstaLleno() {
		DepositoCombustible deposito = new DepositoCombustible (50,50);
		assertTrue(deposito.estaLleno());
	}

	@Test
	public void testFill() {
		DepositoCombustible deposito = new DepositoCombustible (50,20);
		deposito.fill(10);
		double nivel = deposito.getDepositoNivel();
		assertEquals((int)30,(int)nivel);
	}

	@Test
	public void testConsumir() {
		DepositoCombustible deposito = new DepositoCombustible (50,20);
		deposito.consumir(10);
		double nivel = deposito.getDepositoNivel();
		assertEquals((int)10,(int)nivel);
	}

}
