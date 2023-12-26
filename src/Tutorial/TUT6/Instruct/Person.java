package Tutorial.TUT6.Instruct;

public class Person {
    //field
    private String name;
    public int age;
    public static String uni;

    //methods
    //constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //constructor
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void greeting() {
        System.out.println("Hello, my name is " + this.name + ", i'm " + this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
