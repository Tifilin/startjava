public class GameFindNumber {

    public static void main(String[] args) {
        int srcNum = 99;
        int guessNum = 1;

        do {
            guessNum += 13;

            if (guessNum > 100) {
                guessNum -= 100;
            }

            if (guessNum < srcNum) {
                System.out.println("число " + guessNum + " меньше того, что загадал компьютер");
            } else if (guessNum > srcNum) {
                System.out.println("число " + guessNum + " больше того, что загадал компьютер");
            }
        } while (guessNum != srcNum);

        System.out.println("Вы победили!");
    }
}