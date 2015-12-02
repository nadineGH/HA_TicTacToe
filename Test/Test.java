import static org.junit.Assert.*;

import org.junit.Test;
public class Test {

	@Test
	public void testsetMark(){
		mark = "x";
		String expected = "x";
		int actual = taschenrechner.getErgebnis();
		assertEquals(expected, actual);
	}
}
