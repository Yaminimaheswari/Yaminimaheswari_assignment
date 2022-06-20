package fourth;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator cal;

    @Before
    static void SetupAll() {
        System.out.println("@BeforAll Method");

    }

    @Before
    void setup() {
        cal = new Calculator();
        System.out.println("@BeforeEach Method");
    }


@Test
void test() {

    int expected = 5;
    int actual = cal.add(2, 3);
    assertEquals(expected, actual,"Should give right sum");
    System.out.println(actual);
}

@Test
void test2() {
    int expected = 8;
    int actual = cal.add(4, 4);
    assertEquals(expected, actual,"should give right output");
    System.out.println(actual);
}
private void assertEquals(int expected, int actual, String string) {
	// TODO Auto-generated method stub
	
}

@After
void setup2() {
    System.out.println("@AfteEach Method");
}

@After
static void SetupAll2() {
    System.out.println("@AfterAll Method");

}
}
