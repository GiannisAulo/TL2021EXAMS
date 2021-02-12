import java.util.ArrayList;
import java.time.LocalDate;

public class TL2021Exams {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Opel");
        cars.add("Mazda");
        System.out.println(cars);
        //This methods shows the current date
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date

    }

}
