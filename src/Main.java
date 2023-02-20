import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("contains(a,5) = " + contains(a, 9));
        System.out.println("getLottoTipp() = " + Arrays.toString(getLottoTipp()));
    }

    public static int random(int min, int max) {
        return min + (int) ((max - min + 1) * Math.random());
    }

    public static boolean contains(int[] a, int search) {
        for (int j : a) {
            if (j == search) {
                return true;
            }
        }
        return false;
    }

    public static int[] getLottoTipp() {
        int[] lottoTipp = new int[6];
        int possibleNumber;
        for (int i = 0; i < 6; i++) {
            possibleNumber = random(1, 45);
            if (!contains(lottoTipp, possibleNumber)) {
                lottoTipp[i] = possibleNumber;
            } else {
                i--;
            }
        }
        return lottoTipp;
    }

    public static String lottoTippToString(int[] lottoTipp){
        String rString = "";

        return rString;
    }
}