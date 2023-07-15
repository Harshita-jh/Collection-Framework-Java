import java.util.LinkedHashSet;

public class Person {
    private String name;
    private int age; 

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int hashCode() {
        return this.age;
    } 
    @Override
    public boolean equals(Object obj) {
        Person other = (Person) obj; //downcasting
        return this.name.equals(other.name) && this.age == other.age;
    }
    @Override
    public String toString() {
        return this.name + "," + this.age;
    }
}
public class ObjectMethods {
    public static void main(String[] args) {
        Person p1 = new Person("ABC", 20);
        Person p2 = new Person("ABC", 20);
        //printing p1 object value (below both the ways are similar)
        //this will print address of object p1 which is in Hexadecimal value
        System.out.println(p1);
        System.out.println(p1.toString());
        //if we want to display hashcode by ourself
        System.out.println(p1.hashCode());

        //this will compare address
        System.out.println(p1 == p2);
        //this will compare address but if we want to compare by data then we have to override equals method from Object class in person class
        System.out.println(p1.equals(p2));
        //before p1 was printing address now after override toString it will return meaningful value
        System.out.println(p1);

        LinkedHashSet<Person> people = new LinkedHashSet<>();
        people.add("A", 20);
        people.add("B", 10);
        people.add("A", 20);
        people.add("C", 30);
        
        for(Person p : people)
        System.out.println(p);
    }
}
