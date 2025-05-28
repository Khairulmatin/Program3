import java.time.LocalDate;
import java.time.Period;

public class Person {
    String name;
    LocalDate dob;

    Person(String name, String dobStr) {
        this.name = name;

        if (dobStr.charAt(4) == '-') { 
            dob = LocalDate.parse(dobStr);
        } else { 
            String[] parts = dobStr.split("-");
            int day = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);
            dob = LocalDate.of(year, month, day);
        }
    }

    int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + getAge());
    }

    public static void main(String[] args) {
        Person p = new Person("John", "15-08-1990");
        p.displayPerson();
    }
}
