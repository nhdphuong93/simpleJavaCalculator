import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private Map<Character, Operation> operationMap = new HashMap<>();

    Calculator() {
        operationMap.put('+', new Addition());
        operationMap.put('-', new Subtraction());
        operationMap.put('*', new Multiplication());
        operationMap.put('/', new Division());
    }

    double doCalculation(double numberLeft, double numberRight, char operation) {
        Operation calculator = operationMap.get(operation);
        return calculator.calResult(numberLeft, numberRight);
    }
}
