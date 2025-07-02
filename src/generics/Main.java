package generics;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>();
        pair.setFirst(1);
        pair.setSecond("Rahul");
        System.out.println(pair);


        Pair.doSomething("String");

//        walkAnimal(new Dog());
//        walkAnimal(new Human());

//        List<Human> list = new ArrayList<>();
//        list.add(new Human());
//        list.add(new Human());
//        walkAnimals(list);

        Double x = transform("123.5", Double::parseDouble);
        System.out.println(x);

        List<Integer> integers = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();


        addToList(numbers);
    }


//    Animal a = new Dog();
//    List<Animal> a = new ArrayList<Dog>();


    // PE CS
    // reading -> extends
    // writing -> super



    static void addToList(List<? super Integer> list) {
        list.add(1);
//        list.get(0).intValue();
//        Hashtable vs ConcurrentHashMap
//        BlockingQueue

    }


    static void walkAnimal(Animal animal) {
        animal.walk();
    }

//    static <T extends Animal> void walkAnimals(List<T> animals) {
//        for (T t: animals) {
//            t.walk();
//        }
////        animals.forEach(Animal::walk);
//    }

    static <I, O> O transform(I input, Function<I, O> function) {
        return function.apply(input);


    }



    static void walkAnimals(List<? extends Animal> animals) {
//        for (T t: animals) {
//            t.walk();
//        }
        animals.forEach(Animal::walk);
    }



    /**
     *      Object
     *
     *   Number
     *
     *   Integer
     *
     *   func(List<? super Number> list) -> Pass List<Number>, List<Object>  ->
     *       function works for both of the types passed.
     *
     *   func(List<? extends Number> list) -> Pass List<Number>, List<Integer>  ->
     *      function works for both of the types passed.
     *
     *
     *  Collections
     *  ---- List ----> ordered elements.
     *  --------ArrayList
     *  --------LinkedList
     *  --------Vector
     *          ---- Stack
     *  --------
     *  ---- Set -------> avoid storing duplicate elements. Tries to be fast
     *  --------- HashSet
     *  --------- LinkedHashSet
     *  --------- TreeSet
     *  ---------
     *  ---- Queue ------> FIFO
     *  -------- PriorityQueue
     *  -------- ArrayDeque
     *  -------- BlockingQueue
     *
     *
     *
     *  ------ Maps are not part of collections? Why?
     *
     */

}