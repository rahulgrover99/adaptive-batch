package concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // i = 0 -> NP(0) -> T0 -> responsible for running NP(0)
        // i = 1 -> NP(1) -> T1 -> responsible for running NP(1)

//        OS = [T0, T1]

       NumberDoubler numberDoubler = new NumberDoubler(100);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> integerFuture = executorService.submit(numberDoubler);

//        while(integerFuture.state() != Future.State.SUCCESS) {
//            System.out.println(integerFuture.isDone());
////            Thread.sleep(100);
//        }

        // Blocking call -> Main thread won't proceed until
        // the thread completes execution for integer future.
        System.out.println(integerFuture.get());
        executorService.shutdown();
    }

}
