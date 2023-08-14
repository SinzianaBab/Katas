public class TwiceAsOld {
    public static void main(String[] args) {
        System.out.println(TwiceAsOld(30,7));
        System.out.println(TwiceAsOld(45,30));
    }

    public static int TwiceAsOld(int dadYears, int sonYears){
        //TODO: Add code here
        return Math.abs(dadYears- sonYears*2);
    }
}
