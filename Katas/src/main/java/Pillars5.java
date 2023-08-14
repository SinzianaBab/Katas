public class Pillars5 {
    public static void main(String[] args) {
        System.out.println(pillars(2,20,25));
    }
    public static int pillars(int numPill, int dist, int width){
        if (numPill > 1){
            return (numPill-2)* width + (numPill-1)*dist *100;
        }
        return 0;
    }

}
