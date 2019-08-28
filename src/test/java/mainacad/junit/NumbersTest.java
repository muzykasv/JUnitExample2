package mainacad.junit;

import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)  //аннотация, которая указывает, что здесь есть параметризация и указывается,
                               // где именно (от какого класса)
public class NumbersTest {

    private Numbers numbers = new Numbers();
    private int a, b, expected, actual;

    public NumbersTest(int a, int b, int expected){
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Rule
    public TestRule timeout = new Timeout(1000);  //эти правила устанавливаются для всех тестов

    @Parameterized.Parameters
    public static Collection numbers() {
        return Arrays.asList(new Object[][]{{523, 16, 539}, {15, 3, 18}, {86, 20, 106},
                {1085,764,1849}});
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("BEFORECLASS. Lets begin tests!!!!!");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("AFTERCLASS. All tests finished!!!!!! My work ends!!!!!");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Before. Tests started!!!");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("After. Tests finished");
    }

    //@Ignore    // Выставляем Игноры для ТС, которые не касаются параметризации
    @Test
    public void sum() {
        actual = numbers.sum(5);
        int expected = 15;
        assertEquals(actual, expected);
    }

    @Test
    public void add() {                      //addition / +
        actual = numbers.add(a,b);
        assertEquals(expected, actual);
    }

    //@Ignore    // Выставляем Игноры для ТС, которые не касаются параметризации
    @Test
    public void div() {                      //division / /
        actual = numbers.div(12, 6);
        assertEquals(2, actual);
    }

    //@Ignore  // Выставляем Игноры для ТС, которые не касаются параметризации
    @Test
    public void mult() {                      //multiplication / *
        actual = numbers.mult(a,b);
        assertEquals(expected, actual);
    }

    //@Ignore  // Выставляем Игноры для ТС, которые не касаются параметризации
    @Test
    public void sub() {                        //subtraction / -
        actual = numbers.sub(a,b);
        assertEquals(expected, actual);
    }

    //@Ignore  // Выставляем Игноры для ТС, которые не касаются параметризации
    @Test
    public void power() {                      //exponentiation
        actual = numbers.power(a,b);
        assertEquals(expected, actual);
    }

    //@Ignore  // Выставляем Игноры для ТС, которые не касаются параметризации
    @Test
    public void powTwo() {                     //exponentiation root/ square root
        double actual = numbers.powTwo(1000);
        assertEquals(1000000, actual, 0.1);
    }

    //@Ignore  // Выставляем Игноры для ТС, которые не касаются параметризации
    @Test
    public void resultPowerAdd() {
        actual = numbers.power(10, 3) + numbers.power(2, 8);
        assertEquals(1256, actual);
    }

    //@Ignore  // Выставляем Игноры для ТС, которые не касаются параметризации
    @Test
    public void sqrt() {                         //root extraction / square root
        double actual1 = numbers.sqrt(49);
        assertEquals(7, actual1, 0.1);
    }

    //@Ignore  // Выставляем Игноры для ТС, которые не касаются параметризации
    @Test
    public void sqrtNegative() {                  ////root extraction
        String message = "NaN";
        try {
            numbers.sqrt(-64);
        } catch (Exception exp) {
            message = exp.getMessage();
        }
        assertEquals("-64 must be: Sorry,square root of a negative number is impossible", "NaN", message);
    }
}