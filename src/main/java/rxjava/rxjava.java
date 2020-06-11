package rxjava;

import io.reactivex.rxjava3.core.*;

import java.util.concurrent.TimeUnit;

public class rxjava {
   public Observable<String> FakeUserInput(){
       return Observable.just(1,2,3,4,5)
               .filter(number -> number%2 == 0)
               .map(num -> num.toString());
   }
    public Observable<Long> internalrange(){
        return Observable.just(1,2,3,4,5)
                .intervalRange(0,20,0,1000, TimeUnit.MILLISECONDS);
    }
}
