public class GuessNumber {

    public static void main(String[] args) {
        int srcNum = 49;
        int minRangeNum = 0;
        int maxRangeNum = 100;
        int guessNum = (maxRangeNum + minRangeNum) / 2;

        while (guessNum != srcNum) {
            if (guessNum < srcNum) {
                System.out.println("число " + guessNum + " меньше того, что загадал компьютер");
                minRangeNum = guessNum;        
            } else if (guessNum > srcNum) {
                System.out.println("число " + guessNum + " больше того, что загадал компьютер");
                maxRangeNum = guessNum;
            }
            if ((maxRangeNum - minRangeNum) < 2) {
                guessNum = guessNum + 1;
            } else {
                guessNum = (maxRangeNum + minRangeNum) / 2;                
            }
        }

        System.out.println("Вы победили!");
    }
}