public class MyMath {
    public static double devide(int number1, int number2){
        if (number2 == 0){
            throw new ArithmeticException("cant devide by zero");
        }
        return number1/number2;
    }
}
