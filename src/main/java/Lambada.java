// refer to: http://winterbe.com/posts/2014/03/16/java-8-tutorial/

public class Lambada {
    public static void run() {
        System
                .out
                .println(new Person()
                .convertToString(person -> person.getFirstName() + " - " + person.getLastName()));
    }
}

class Person {
    private String firstName;
    private String lastName;

    public Person() {
        firstName = "John";
        lastName = "Nelson";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String convertToString(ToString<Person> fn) {
        return fn.toString(this);
    }
}

@FunctionalInterface
interface ToString<T> {
    String toString(T x);
}
