class Calculator {
    public double calculate(char op, int a, int b) {
        // Введите свое решение ниже
        double res = 0.0D;
        switch (op) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = (double) a / b;
                break;
        }
        return res;
    }
}