package lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Consume {
    public static void main(String[] args) {
        List<String> join = new ArrayList<>();
        join.add("lily");
        join.add("ravi");
        join.add("raju");
        join.add("sai");
        join.add("honey");
        join.add("rani");
        join.add("nani");
        join.replaceAll(new change());
        join.stream().collect(Collectors.toList()).forEach(System.out::println);

    }
}
class change implements UnaryOperator<String>{
    @Override
    public String apply(String s) {
        return s.toUpperCase();
    }
}

