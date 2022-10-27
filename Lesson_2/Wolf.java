public class Wolf {

    private char gender;
    private String name;
    private int weight;
    private int age;
    private String coloration;

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColoration() {
        return coloration;
    }

    public void setColoration(String coloration) {
        this.coloration = coloration;
    }

    public void walk() {
        System.out.println("Идёт");
    }

    public void sit() {
        System.out.println("Сидит");    
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void howl() {
        System.out.println("Воет");
    }

    public void hunt() {
        System.out.println("Охотится");
    }
}