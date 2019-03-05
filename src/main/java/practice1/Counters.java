
package practice1;

import static java.lang.reflect.Array.get;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;


public class Counters {
    Map<String, AtomicInteger> numbers = new TreeMap<>();

    
    public void resetCounter(String name) {
         numbers.put(name,  new AtomicInteger(0));
    }
    
    public int addCounter(String name) {
        final AtomicInteger v = numbers.get(name);
        if (v==null) {
            resetCounter(name);
            return 0;
        }
        return v.incrementAndGet();
    }
    
    
    public Collection<String> getCounterNames() {
        return numbers.keySet();
    }
    
    public int getCounter(String name) {
        final AtomicInteger v = numbers.get(name);
        if (v==null) {
            throw new CounterException("Имя счетчика не найдено: "+name);
        }
        return v.get();
    }
    
    public Counters() {
        resetCounter("A");
    }

    @Override
    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        numbers.forEach((k,v) -> {
//            sb.append(String.format("", args))
//        }); 
       return numbers.toString();
    }

    private static class CounterException extends RuntimeException {

        public CounterException(String s) {
            super(s);
        }
    }
    
    
    
    
    
}
