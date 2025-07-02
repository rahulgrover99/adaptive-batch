package labsession;

import java.util.List;
import java.util.concurrent.Callable;

/**
 *
 * Finds the sum of a subarray.
 */
public class SumMultiThreadCallable implements Callable<Long> {

    private final List<Integer> arr;
    private final int start;
    private final int end;

    public SumMultiThreadCallable(List<Integer> arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() throws Exception {
        Long sum = 0L;
        for (int i = start; i < end; i++) {
            sum += arr.get(i);
        }
        System.out.println("Sum calculated by " + Thread.currentThread().getName() + " " + sum);
        return sum;
    }
}
