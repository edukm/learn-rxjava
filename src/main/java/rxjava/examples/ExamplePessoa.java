package rxjava.examples;

import java.util.ArrayList;
import java.util.List;
import static io.github.benas.randombeans.api.EnhancedRandom.random;
import io.reactivex.Observable;

public class ExamplePessoa {

    public static Observable<Pessoa> getPessoas() {
    	List<Pessoa> pessoas = new ArrayList<>();
    	for(int i=0; i<1000; i++) {
    		pessoas.add(random(Pessoa.class));
    	}
    	
        return Observable.create(subscriber -> {
        	pessoas.forEach(p -> subscriber.onNext(p));
            subscriber.onComplete();
        });
    }

    public static void main(String[] args) {
        Observable<Pessoa> obs1 = getPessoas();
        obs1.subscribe(System.out::println);
    }
}