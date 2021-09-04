import org.junit.Test;

public class MyMathTest {
    @Test(expected = ArithmeticException.class)
    public void checkDenominatorShouldThrowException(){
        MyMath.devide(1,0);
    }



}
