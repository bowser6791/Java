
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
       ArrayList sample = new ArrayList();
        System.out.println("Initial size of sample : " + sample.size());
        System.out.println("\n");

        sample.add("Carlos");
        sample.add("pepito");
        sample.add("John");
        sample.add(12121);
        sample.add(8.90);
        sample.add("a");
        System.out.println(sample);
        sample.add(1,"A2");

        System.out.println("size of sample after additions " + sample.size());
        System.out.println("\n");

        sample.remove("F");
        sample.remove(2);

        System.out.println("size of sample after deletions : " + sample.size());
        System.out.println("\n");
        System.out.println("contents of sample : "+sample);


    }
}
