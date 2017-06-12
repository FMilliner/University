import java.util.ArrayList;
public class Main
{
    public static void main(String[] args) {
        University myUni = new University(33, "University of Manchester", "UK", "AAA*");
        ArrayList<University> unis = new ArrayList<University>();
        unis.add(myUni);
        for (University x : unis) {
            System.out.println(x);
        }
    }
}
