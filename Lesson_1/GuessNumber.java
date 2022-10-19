public class GuessNumber {

    public static void main(String[] args) {
        int targetNum = 49;
        int startRange = 0;
        int endRange = 100;
        int guessNum = (endRange + startRange) / 2;

        while (guessNum != targetNum) {
            if (guessNum < targetNum) {
                System.out.println("число " + guessNum + " меньше того, что загадал компьютер");
                startRange = guessNum;        
            } else if (guessNum > targetNum) {
                System.out.println("число " + guessNum + " больше того, что загадал компьютер");
                endRange = guessNum;
            }
            if ((endRange - startRange) < 2) {
                guessNum++;
            } else {
                guessNum = (endRange + startRange) / 2;                
            }
        }

        System.out.println("Вы победили!");
    }
}