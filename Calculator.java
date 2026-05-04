import java.util.*;

class Calculator {
    double a, b;
    char op;
    static LinkedList<String> history = new LinkedList<>();

    Calculator(double a, double b, char op) {
        this.a = a;
        this.b = b;
        this.op = op;
    }

    void calculate() {
        double res = 0;
        String record = "";

        switch(op) {
            case '+': res = a + b; break;
            case '-': res = a - b; break;
            case '*': res = a * b; break;
            case '/':
                if(b == 0) {
                    System.out.println("Division by zero!");
                    return;
                }
                res = a / b;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        record = a + " " + op + " " + b + " = " + res;
        System.out.println(record);

        history.add(record);
        if(history.size() > 5) history.removeFirst();
    }

    static void showHistory() {
        System.out.println("History:");
        for(String h : history) System.out.println(h);
    }
}

class Main1 {
    public static void main(String[] args) {
        Calculator c = new Calculator(10, 5, '+');
        c.calculate();
        Calculator.showHistory();
    }
}