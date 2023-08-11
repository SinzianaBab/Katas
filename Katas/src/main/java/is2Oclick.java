public class is2Oclick {
    public static void main(String[] args) {
        int result = Past(0, 1, 1);
        System.out.println(result);
    }

    public static int Past(int h, int m, int s) {
        int secHour = h * 60 * 60 * 1000;
        int secMin = m * 60 * 1000;
        int secSec = s * 1000;
        return secHour + secMin + secSec;
    }
}
