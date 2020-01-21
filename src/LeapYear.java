import javax.swing.*;
import java.sql.PseudoColumnUsage;

public class LeapYear {

    public static void main(String[] args) {

        Phone person = new Phone();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(21);

        System.out.println("Full Name = " + person.getFullName());
        System.out.println("Is he Teen , " + person.teen());

    }
}
























