public class Student {
    // attributes
    String name;
    int age;
    double psp;

    // default constructor. provided by the language. no need to explicitly create
    Student() {
        // this refers to the object being created or for which the method has been called.

        this.name = null;
        this.age = 18;
        this.psp = 0.0;
    }

    // Parametrized constructor
    Student(String name, int age, double psp) {
        this.name = name;
        this.age = age;
        this.psp = psp;

    }


    // behaviours;

    void pauseBatch() {
        if (age > 20) {
            System.out.println("Pause not possible");
            return;
        }
        this.psp = 0.0;
        System.out.println("Pause initiated.");
    }

}


// public is acting as an access modifier.
