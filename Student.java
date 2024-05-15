import java.time.LocalDate;
import java.time.Period;

public class Student {
    public static void main(String[] args) {
        String stud_name = "Anusha";

        LocalDate pdt = LocalDate.of(2004, 07, 15);
        LocalDate tdt = LocalDate.now();
        Period diff = Period.between(pdt, tdt);
        System.out.println("Name:" + stud_name);
        System.out.println("Date of Birth : " + pdt);
        System.out.println("Age : " + diff.getYears());
        System.out.println("Course and marks of semester 4:");

    }
}
