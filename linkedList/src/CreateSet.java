import java.util.HashSet;
import java.util.Set;

public class CreateSet {
    public static void main(String[] args) {

        Set<String> months = new HashSet<>();

        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");

        System.out.println(months);
    }
}