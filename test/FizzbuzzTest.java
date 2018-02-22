import org.junit.Test;

import static org.junit.Assert.*;

public class FizzbuzzTest {

    @Test
    public void test() {
        Fizzbuzz test = new Fizzbuzz();
        int result = test.divideByThree(6);
        assertEquals(0, result);
    }

    @Test
    public void testFive() {
        Fizzbuzz test5= new Fizzbuzz();
        int result = test5.divideByFive(10);
        assertEquals(0, result);
    }
    @Test


}