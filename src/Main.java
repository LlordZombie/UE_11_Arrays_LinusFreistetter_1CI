import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] a = {"Hallo", "ich", "bin", "hier", "!"};
        System.out.println("contains(a,bin) = " + contains(a, "bin"));
        System.out.println("getLottoTipp() = " + Arrays.toString(getLottoTipp()));
        System.out.println("lottoTippToString(getLottoTipp()) = " + lottoTippToString(getLottoTipp()));
        System.out.println("getNLottoTips(5) = " + Arrays.toString(getNLottoTips(5)));
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

    public static String lottoTippToString(int[] lottoTipp) {
        String rString;
        Arrays.sort(lottoTipp);
        rString = String.format("%02d %02d %02d %02d %02d %02d %n", lottoTipp[0], lottoTipp[1], lottoTipp[2], lottoTipp[3], lottoTipp[4], lottoTipp[5]);
        return rString;
    }


    public static boolean contains(String[] a, String search) {
        for (String j : a) {
            if (j.equals(search)) {
                return true;
            }
        }
        return false;
    }

    public static String[] getNLottoTips(int n) {
        String[] allLottoTips = new String[n];
        for (int i = 0; i < n; i++) {
            allLottoTips[i] = "";
        }
        int[] singleLottoTip = new int[6];
        int possibleNum;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6; j++) {
                possibleNum = random(1, 45);
                if (contains(singleLottoTip, possibleNum)) {
                    j--;
                } else {
                    singleLottoTip[j] = possibleNum;
                }
            }
            Arrays.sort(singleLottoTip);
            if (!contains(allLottoTips, Arrays.toString(singleLottoTip))) {
                allLottoTips[i] = Arrays.toString(singleLottoTip);
            } else {
                i--;
            }
        }
        return allLottoTips;
    }


}















