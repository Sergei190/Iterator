public class Main {
    // интервал 65 - 100
    private static final int INTERVAL_STATIC_NUMBER = 90;
    private static final int INTERVAL_UPPER_BOUND_EXCLUDED = 101;

    public static void main(String[] args) {
        for (int r : new Randoms(INTERVAL_STATIC_NUMBER, INTERVAL_UPPER_BOUND_EXCLUDED)) {
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100, завершаем программу.");
                break;
            }
        }
    }
}
