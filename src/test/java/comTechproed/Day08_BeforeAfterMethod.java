package comTechproed;

import org.junit.*;

public class Day08_BeforeAfterMethod {

    @BeforeClass
    public static void setup() {
        System.out.println("setup calisti...");
    }
    @AfterClass
    public static void tearDown() {
        System.out.println("tearDown Calisti");
    }

    @Before
    public  void metoddanOnce() {
        System.out.println("metoddanOnce calisti");
    }

    @Test
    public void test1() {
        System.out.println("Test1 Calisti");
    }
    @Test
    public void test2() {
        System.out.println("Test 2 Calisti");
    }
    @After
    public void metoddanSonra () {
        System.out.println("metoddanSonra Calisti");
    }
}
