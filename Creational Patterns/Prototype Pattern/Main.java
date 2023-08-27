// Prototype interface
interface Person {
    Person clone();
    void display();
}

// Concrete implementation of Person
class ConcretePerson implements Person {
    private String name;

    public ConcretePerson(String name) {
        this.name = name;
    }

    @Override
    public Person clone() {
        return new ConcretePerson(this.name);
    }

    @Override
    public void display() {
        System.out.println("Hello, I'm " + name);
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        Person originalPerson = new ConcretePerson("ThunderBolt");
        originalPerson.display();  // Hello, I'm ThunderBolt

        Person clonedPerson = originalPerson.clone();
        clonedPerson.display();    // Hello, I'm ThunderBolt (cloned)
    }
}
