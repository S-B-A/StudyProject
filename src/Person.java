public class Person {
    // the Person class has two fields
    public String fullName;
    public byte age;

    // the Person class has two methods
    public static void move() {
        System.out.println("\"Эй, пошевеливайся!\"");
    }
    public static void talk(String someName) {
        move();
        System.out.println(someName + " говорит.");
    }
    // the Person class has two constructors
    public Person()
    {
        System.out.println("Hello from " + fullName + ' ' + age + ".");
        System.out.println("-------------------");
    }
    public Person(String theName, byte theAge) {
        fullName = theName;
        age = theAge;
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.fullName = "Пётр Васильевич";
        person1.age = 37;
        talk(person1.fullName);

        Person person2 = new Person("Василий Петрович", (byte) 73);
        talk(person2.fullName);
    }
}