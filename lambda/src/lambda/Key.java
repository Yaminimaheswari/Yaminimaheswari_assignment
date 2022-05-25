package lambda;
import java.util.HashMap;

public class Key {
    public static void main(String[] args) {
        StringBuilder mix=new StringBuilder();
        HashMap<Integer,String> foo=new HashMap<>();
        foo.put(1,"nani");
        foo.put(2,"dana");
        foo.put(3,"jimmy");
        foo.put(4,"anil");
        //this mwthod will make the key value pairs a string using string builder
        foo.entrySet().forEach(t-> mix.append(t));
        System.out.println(mix);
    }
}





