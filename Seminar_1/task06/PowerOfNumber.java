// Реализовать функцию возведения числа а в степень b. a, b из Z.
//  ̶С̶в̶о̶д̶я̶ ̶к̶о̶л̶и̶ч̶е̶с̶т̶в̶о̶ ̶в̶ы̶п̶о̶л̶н̶я̶е̶м̶ы̶х̶ ̶д̶е̶й̶с̶т̶в̶и̶й̶ ̶к̶ ̶м̶и̶н̶и̶м̶у̶м̶у̶.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1

public class PowerOfNumber {
    public static void main(String[] args) {
        System.out.println(numPow(2, -2));
    }

    static double numPow(int a, int b) {
        double res = 1;
        int n = Math.abs(b);

        while (n != 0) {
            if ((n & 1) > 0) {
                res *= a;
            }
            a *= a;
            n >>= 1;
        }

        if (b >= 0) {
            return res;
        }
        return 1 / res;
    }
}