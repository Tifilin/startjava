public class Person {

    char gender = 'f';
    String name = "Flavia";
    short height = 175;
    short weight = 50;
    short age = 28;

    void walk() {
        System.out.println("Walking");
    }

    void sit() {
        System.out.println("Sitting");    
    }

    void run() {
        System.out.println("Running");
    }

    String talk() {
        return "Speaking German";
    }

    String learnJava() {
        return "IQ + 1";
    }
}