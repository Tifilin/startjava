public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfBlack = new Wolf();
        wolfBlack.setGender('m');
        wolfBlack.setName("Do-jo");
        wolfBlack.setWeight(80);
        wolfBlack.setAge(3);
        wolfBlack.setColoration("Black");
        System.out.println("Пол: " + wolfBlack.getGender());
        System.out.println("Кличка: " + wolfBlack.getName());
        System.out.println("Вес: " + wolfBlack.getWeight());
        System.out.println("Возраст: " + wolfBlack.getAge());
        System.out.println("Окрас: " + wolfBlack.getColoration());
        wolfBlack.walk();
        wolfBlack.sit();
        wolfBlack.run();
        wolfBlack.howl();
        wolfBlack.hunt();
    }
}