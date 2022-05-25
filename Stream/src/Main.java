import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Fruit> Fruit_list = new LinkedList<>();
        Fruit_list.add(new Fruit("Apple", 17, 234, "red"));
        Fruit_list.add(new Fruit("Banana", 15, 230, "yellow"));
        Fruit_list.add(new Fruit("mango", 150, 254, "Yellow"));
        Fruit_list.add(new Fruit("orange", 120, 158, "orange"));
        
        System.out.println("Fruits with calories less than 100");
        Fruit_list.stream().filter(x -> x.getCalories() < 100).map(Fruit::getName).forEach(System.out::println);
        
        System.out.println("Sorting fruits according to their color");
        Fruit_list.stream().sorted(Comparator.comparing(Fruit::getColor)).map(Fruit::getName).forEach(System.out::println);
        
        System.out.println("Only red color fruits");
        Fruit_list.stream().filter(x -> x.getColor().contains("red")).forEach(System.out::println);


        List<News> News_list = new LinkedList<>();
        News_list.add(new News(12, "User1", "This is good", "Time spent well"));
        News_list.add(new News(12, "User2", "Well done budget", "Good Presentation"));
        News_list.add(new News(12, "User3", "Very well done", "This was amazing"));
        News_list.add(new News(13, "User1", "This was informational budget", "Liked the author"));
        
        System.out.println("News ID with maximum comment");
        News_list.stream().max(Comparator.comparing(News::getCommentByUser).reversed()).ifPresent(System.out::println);
        
        System.out.println("Counting the word budget in comment");
        int count = (int) News_list.stream().filter(x -> x.getCommentByUser().contains("budget")).count();
        System.out.println("No. of time word Budget Appeared: " + count);
        
        Optional<String> max = News_list.stream().map(News::getCommentByUser).max((i, j) -> i.compareTo(j));
        System.out.println(max.get());
        
        System.out.println("7.print get comment by user");
        News_list.stream().max(Comparator.comparing(News::getNewsId).reversed()).map(News::getCommentByUser).ifPresent(System.out::println);


        List<Trade> Trade_list = new LinkedList<>();
        Trade_list.add(new Trade("uma", "pune"));
        Trade_list.add(new Trade("Dev", "Indore"));
        Trade_list.add(new Trade("Sunil", "delhi"));
        Trade_list.add(new Trade("surya", "delhi"));
        Trade_list.add(new Trade("Anee", "Ahemadabad"));
        Trade_list.add(new Trade("Cherry", "pune"));
        
        System.out.println("Unique cities where trade work from");
        Trade_list.stream().map(Trade::getCity).distinct().forEach(System.out::println);
        
        System.out.println("Trade in pune");
        Trade_list.stream().filter(x -> x.getCity().contains("pune")).forEach(System.out::println);
       
        System.out.println("Trade name sorted alphabetical");
        Trade_list.stream().sorted(Comparator.comparing(Trade::getName)).forEach(System.out::println);
        
        boolean checkindore = Trade_list.stream().anyMatch(x -> x.getCity().contains("Indore"));
        System.out.println("Are there any trader based in indore: " + checkindore);

        List<Transcation> Trans_list = Arrays.asList(
                new Transcation(new Trade("uma", "Delhi"), 2012, 4500),
                new Transcation(new Trade("cherry", "Delhi"), 2011, 4800),
                new Transcation(new Trade("ravi", "Indore"), 2011, 4400));
        
        System.out.println("Transcation of year 2011");
        Trans_list.stream().filter(x -> x.getYear()==2011).sorted(Comparator.comparing(Transcation::getValue)).forEach(System.out::println);

        
        System.out.println("Transcation from traders living in delhi");
        Trans_list.stream().filter(x -> x.getT().getCity().contains("Delhi")).map(Transcation::getValue).forEach(System.out::println);

        
        System.out.println("Highest Transcation value");
        Trans_list.stream().sorted(Comparator.comparing(Transcation::getValue).reversed()).limit(1).forEach(System.out::println);
        
        System.out.println("Transaction with smallest value");
        Trans_list.stream().sorted(Comparator.comparing(Transcation::getValue)).limit(1).forEach(System.out::println);
    }

}
