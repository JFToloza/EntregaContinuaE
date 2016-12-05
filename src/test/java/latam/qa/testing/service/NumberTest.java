package latam.qa.testing.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberTest {

    @Test
    public void creatingString_twoSimpleNumbers_ReturnStringWithCommaBetween(){
        Number n = new Number();
        String result = n.stringCalc(1, 2);
        assertEquals(String.format("%d,%d", 1, 2), result);

    }

    @Test
    public void creatingString_twoSimpleNumbers_mustFail(){
        Number n = new Number();
        String result = n.stringCalc(1, 2);
        assertEquals(String.format("%d,%d", 1, 5), result);
    }
	
@Test
    public void divisionTwoNumberFail(){
        Int n = new Int();
	try{
        Int result = n.divisionCalc(0, 0);
	fail("Se esperaba una excepción")
	}catch(BRException e){
	}
    }

@Test
    public void divisionTwoNumber(){
        Int n = new Int();
        Int result = n.divisionCalc(2, 2);
    }


}
