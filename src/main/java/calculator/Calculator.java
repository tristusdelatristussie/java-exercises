package calculator;

public class Calculator {

    public int addition(int i, int i1) {
        return i + i1;
    }

    public int subtraction(int i, int i1) {
        return i - i1;
    }

    public float divide(int i, int i1) throws ArithmeticException{
        float result;
        try {
            result = i / i1;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        return result;
    }
}
