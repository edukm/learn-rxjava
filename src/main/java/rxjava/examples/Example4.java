package rxjava.examples;

import java.util.stream.IntStream;

import io.reactivex.Observable;

public class Example4 {

    public static Observable<Integer> naturalNumbers(int n) {
        return Observable.create(subscriber -> {
            IntStream.rangeClosed(1, n).forEach(number -> subscriber.onNext(number+1));
            subscriber.onComplete();
        });
    }

    public static void main(String[] args) {
        Observable<Integer> obs1 = naturalNumbers(10);
        obs1.subscribe(System.out::println);
    }
}