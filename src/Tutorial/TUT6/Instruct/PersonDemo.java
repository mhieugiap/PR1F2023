package Tutorial.TUT6.Instruct;

public class PersonDemo {
    public static void main(String[] args) {
        Person TramAnh = new Person("Tram Anh", 20);
        TramAnh.age = 21;
        Person HienNhi = new Person();
        HienNhi.setName("Hien Nhi");
        HienNhi.age = 19;
        TramAnh.greeting();
        HienNhi.greeting();
        TramAnh.greeting();
        Person.uni = "Hanoi University";

    }

}
