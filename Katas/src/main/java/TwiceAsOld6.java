//https://www.codewars.com/kata/5b853229cfde412a470000d0/train/java
public class TwiceAsOld6 {
    public static void main(String[] args) {
        System.out.println(TwiceAsOld(30,7));
        System.out.println(TwiceAsOld(45,30));
    }

    public static int TwiceAsOld(int dadYears, int sonYears){
        //TODO: Add code here
        return Math.abs(dadYears- sonYears*2);
    }
}
