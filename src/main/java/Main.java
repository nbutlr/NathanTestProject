import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] scoreList = {98,78,66,81,66,77,12,105,26,87,89,67};
        int highest = scoreList[0];
        for (int i = 0; i < 12; i++) {
            if (scoreList[i] > highest) {
                highest = scoreList[i];
            }
        }
        System.out.println(highest);
        System.out.println(Arrays.toString(scoreList));
    }
}