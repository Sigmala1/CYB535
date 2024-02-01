import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

//import org.junit.Test;
import org.junit.Before;
import org.junit.After;


public class MathUtilsTest {

    MathUtils testing_output;

    @Before
    public void setUp() {
        testing_output = new MathUtils();
    }

    @After
    public void tearDown() {
        //testing_output.delete();
    }

    @Test
    public void addTest() {
        //MathUtils testing_object = new MathUtils();
        //int addTest_output = testing_object.add(1,4);
        testing_output = new MathUtils();
        assertEquals(5, testing_output.add(1,4));
        assertEquals(-7, testing_output.add(-10,3));
    }

    @Test
    public void subtractTest() {
        //MathUtils testing_object = new MathUtils();
        //int subtractTest_output = testing_object.subtract(30,62);
        testing_output = new MathUtils();
        assertEquals(-32, testing_output.subtract(30,62));
        assertEquals(32, testing_output.subtract(46,14));
    }

    @Test
    public void multiplyTest() {
        //MathUtils testing_object = new MathUtils();
        //int addTest_output = testing_object.multiply(15,20);
        testing_output = new MathUtils();
        assertEquals(300, testing_output.multiply(15,20));
        assertEquals(0, testing_output.multiply(100,0));
    }

    @Test
    public void divideTest() {
        //MathUtils testing_output_divide = new MathUtils();
        //int addTest_output = testing_object.divide(12,4);
        //double div = testing_output_divide.divide(12, 4);
        testing_output = new MathUtils();
        assertEquals(3.0, testing_output.divide(12,4), 0.001);
        assertEquals(-1.0, testing_output.divide(42,0), 0.001);
    }


}