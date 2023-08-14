import java.util.Arrays;

//https://www.codewars.com/kata/5bb904724c47249b10000131/train/java
public class TotalAmountOfPoints {
    public static void main(String[] args) {
String[] scores = {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"};
        System.out.println(points(scores));
        System.out.println(points(new String[] {"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"}));
    }
    public static int points(String[] games) {
return Arrays.stream(games).mapToInt(score -> score.charAt(0) - score.charAt(2))
        .map(match -> match > 0? 3 : match == 0?1 :0).sum();
        //implement me
    }
}
