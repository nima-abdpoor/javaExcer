import io.reactivex.rxjava3.core.Observable;
import rxjava.rxjava;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String args[]){
        rxjava rx = new rxjava();
        rx.internalrange()
                .blockingSubscribe(line -> System.out.println(line));
    }
















}
