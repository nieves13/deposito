import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DepositoTestParametrizado {
	private static final double DEP_MAX = 100;
	
	private double nivel;
	private double consumo;
	private double amount;
	private double resultcon;
	private double resultfill;
	
	
	public DepositoTestParametrizado (double n, double c, double r1, double a, double r2) {
		nivel = n;
		consumo = c;
		amount = a;
		resultcon = r1;
		resultfill = r2;
		
	}
	
	@Parameters
	public static Collection<Object[]> valores(){
		return Arrays.asList(new Object[][]{
				{20,10,10,10,30}, {40,25,15,25,65}, {98,97,1,2,100}, {30,1,29,69,99}});
	}
	
	@Test
	public void testConsumo() {

		DepositoCombustible deposito = new DepositoCombustible (DEP_MAX,nivel);
		deposito.consumir(consumo);
		double total= deposito.getDepositoNivel();

		assertEquals((int)resultcon,(int)total);
	}
	
	@Test
	public void testFill() {

		DepositoCombustible deposito = new DepositoCombustible (DEP_MAX,nivel);
		deposito.fill(amount);
		double total= deposito.getDepositoNivel();

		assertEquals((int)resultfill,(int)total);
	}


}
