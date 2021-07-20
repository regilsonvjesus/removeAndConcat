import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
	
	@Test
	public void test() {
		String s = "ashley";
		String t = "ash";
		int qtdePermitidas = 2;
		Main obj = new Main();
		assertEquals(false,obj.can(s, t, qtdePermitidas));
	}
	


}
