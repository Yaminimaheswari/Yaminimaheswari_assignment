package Com.Spring;

public class Student {
	String name;

    public Student(String name) {
        super();
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void getDetails()
    {
        System.out.println("the name of the student is: "+getName());
    }
    @postconstruct
    public void myInit()
    {
        System.out.println("myInit method started");
    }
    @PreDestroy
    public void myDestroy()
    {
        System.out.println("myInit method started");
    }

}
