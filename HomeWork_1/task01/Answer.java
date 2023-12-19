class Answer {
    public int countNTriangle(int n) {
        // Введите свое решение ниже
        if (n < 1) {
            return -1;
        }

        return (n * (n + 1)) / 2;
    }
}