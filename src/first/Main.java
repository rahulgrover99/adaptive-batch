package first;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.walk();

        Dog dog = new Dog();
        dog.walk();
        dog.bark();

        System.out.println(dog.num); // 1? 2?

        Animal animalDog = new Dog();
        animalDog.walk();

        System.out.println(animalDog.num); // ?????????
//        animalDog.bark();


        Greetings greetings = new Greetings();

        greetings.hello(new Dog());


        UploadService uploadService = new UploadService(new AwsCloudProvider());
        uploadService.handleFileUpload("x");

        CloudProvider cp = new AwsCloudProvider();

    }



}
