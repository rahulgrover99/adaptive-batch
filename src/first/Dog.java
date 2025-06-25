package first;

public class Dog extends Animal{

    int num = 2;

    public void bark() {
        System.out.println("Dog barks.");
    }

    @Override
    public void walk() {
        System.out.println("Dog walks.");
    }

}
