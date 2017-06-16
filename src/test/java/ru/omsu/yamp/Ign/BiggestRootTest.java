package ru.omsu.yamp.Ign;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class BiggestRootTest
        extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public BiggestRootTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( BiggestRootTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testBiggestRoot()
    {
        Equation e;
        BiggestRoot b;

        e = new Equation(0, 0, 0);
        assertEquals(0.0, e.solute()[0]);
        assertEquals(-0.0, e.solute()[1]);
        b = new BiggestRoot(e);
        try {
            assertEquals(0.0, b.getBiggestRoot());
        }catch (Exception x){
            x.printStackTrace();
        }

        e = new Equation(1, -22, 121);
        assertEquals(0.0, e.getDiscriminant());
        assertEquals(11.0, e.solute()[0]);
        assertEquals(11.0, e.solute()[1]);
        b = new BiggestRoot(e);
        try {
            assertEquals(11.0, b.getBiggestRoot());
        }catch (Exception x){
            x.printStackTrace();
        }

        e = new Equation(2, 9, -11);
        assertEquals(2.0, e.solute()[0]);
        assertEquals(-11.0, e.solute()[1]);
        b = new BiggestRoot(e);
        try {
            assertEquals(2.0, b.getBiggestRoot());
        }catch (Exception x){
            x.printStackTrace();
        }
    }
}
