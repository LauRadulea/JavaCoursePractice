import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void twoPlusEightEquals() {
        var cal = new Calculator();
        assertEquals(10, cal.add(2, 8));
    }

    @Test
    void twoPlusTwoEquals (){
        var cal = new Calculator();
        assertEquals(5, cal.add(2, 2));
    }

    @Test
    void twoPlusThreeEquals() {
        var cal = new Calculator();
        assertEquals(5, cal.add(2, 3));
    }

    @Test
    void twoMultipThreeEquals() {
        var cal = new Calculator();
        assertEquals(6, cal.multip(2, 3));
    }
}