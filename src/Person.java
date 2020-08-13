public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello from " + getName());
    }

    public static void main(String[] args) {
        Person one = new Person("Dylan");
        one.sayHello();
        one.setName("Austin");
        one.sayHello();

        // This should print true for the first system out, and false for the second.
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

        // This system out should print true
        Person person3 = new Person("John");
        Person person4 = person3;
        System.out.println(person3 == person4);

        // This should print John twice then should print Jane twice
        Person person5 = new Person("John");
        Person person6 = person5;
        System.out.println(person5.getName());
        System.out.println(person6.getName());
        person6.setName("Jane");
        System.out.println(person5.getName());
        System.out.println(person6.getName());
    }
}
