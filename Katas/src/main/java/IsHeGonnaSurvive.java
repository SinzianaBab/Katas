//https://www.codewars.com/kata/59ca8246d751df55cc00014c/solutions/java

public class IsHeGonnaSurvive {
    public static void main(String[] args) {
        boolean result = hero(1244315130, 132391273);
        System.out.println(result);
    }

    public static boolean hero(int bullets, int dragons) {
        return bullets / 2 >= dragons;
        // please code here
    }
}
