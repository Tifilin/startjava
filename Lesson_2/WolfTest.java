public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfBlack = new Wolf();
        wolfBlack.gender = 'm';
        wolfBlack.name = "Do-jo";
        wolfBlack.weight = 80;
        wolfBlack.age = 3;
        wolfBlack.coloration = "Black";
        System.out.println("Пол: " + wolfBlack.gender);
        System.out.println("Кличка: " + wolfBlack.name);
        System.out.println("Вес: " + wolfBlack.weight);
        System.out.println("Возраст: " + wolfBlack.age);
        System.out.println("Окрас: " + wolfBlack.coloration);
        wolfBlack.walk();
        wolfBlack.sit();
        wolfBlack.run();
        wolfBlack.howl();
        wolfBlack.hunt();
    }
}