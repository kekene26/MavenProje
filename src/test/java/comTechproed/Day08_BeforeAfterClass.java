package comTechproed;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Day08_BeforeAfterClass {

    @BeforeClass
    public static void setUp() {
        System.out.println("setup calisti");
    }

    @Test
    public void test1 () {
        System.out.println("Test 1 calisti");
    }
    @Test
    public void test2 () {
        System.out.println("Test 2 calisti");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("tearDown Calisti");
    }
}
