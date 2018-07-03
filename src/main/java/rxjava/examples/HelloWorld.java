package rxjava.examples;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Observable;

public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
		List<String> tweets = Arrays.asList("learning RxJava", "Writing blog about RxJava", "RxJava rocks!!");
		Observable<String> observable = Observable.fromIterable(tweets);
		observable.subscribe(System.out::println);
    }
}
