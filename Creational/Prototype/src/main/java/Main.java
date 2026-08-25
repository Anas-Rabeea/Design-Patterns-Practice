import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Report original = new Report("Tt" , "a1" , List.of("1" , "3"));
        System.out.println("original : " + original.getTitle());
        Report copy = original.clone();
        System.out.println("copy : " + copy.getTitle());
        Report copy2 = new Report(original);
        System.out.println("copy2 : " + copy2.getTitle());

    }
}
