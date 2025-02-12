import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;

class MyCalculateTest {
    @Test
    public void addNumberTest(){
        MyCalculate objekt1 = new MyCalculate();
        int result = objekt1.addNumber(5,7);
        assertEquals(12, result);
    }

    @Test
    public void addStringTest(){
        MyCalculate objekt2 = new MyCalculate();
        String resultS = objekt2.addString("Anders", "And");
        assertEquals("AndersAnd", resultS);
    }

    @Test
    public void checkVATPercentage(){
        MyCalculate objekt3 = new MyCalculate();
        assertEquals(25, objekt3.checkVAT(100.00, 25.00));
    }

}