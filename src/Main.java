public class Main {
    public static void main(String[] args) {
        int i = 0;
        i += 2;
        System.out.println(i*10);
        System.out.println("Hello world!");


        Student chetan = new Student("Chetan", 25, 90.0);

        System.out.println(chetan);


        Student jagruti = new Student();
        jagruti.age = 19;
        jagruti.name = "Jagruti";
        jagruti.psp = 80;

        System.out.println(jagruti);

        chetan.pauseBatch();
        jagruti.pauseBatch();

        System.out.println(jagruti);


    }
}