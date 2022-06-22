public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        int a = 8;
        int b = 2;
        System.out.println("Суммируем " + a + " и " + b + ": " + calc.sum(a, b));
        System.out.println("Перемножаю " + a + " и " + b + ": " + calc.mult(a, b));
        System.out.println(a + " возвожу в степень " + b + ": " + calc.pow(a, b));
    }
}