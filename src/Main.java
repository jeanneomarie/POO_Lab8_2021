import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        //COMPARABLE EXAMPLE
        CarShallow carShallow = new CarShallow("BMW", "black");
        CarDeep carDeep = new CarDeep("BMW", "black");

        // PROBLEM 3.4
        /*
        PersonShallow[] persons = {
                new PersonShallow("Ioana", "Onofrei", 23, carShallow),
                new PersonShallow("Andrei", "Cobzaru", 22, carShallow),
                new PersonShallow("Mihai", "Muresan", 20, carShallow)
        };

        System.out.println("BEFORE Sorting");
        for (PersonShallow person : persons) {
            System.out.println(person.getFirstName());
        }

        Arrays.sort(persons);
        System.out.println("AFTER Sorting");
        for (PersonShallow person : persons) {
            System.out.println(person.getFirstName());
        }*/

        //CLONEABLE EXAMPLE
        // PROBLEM 3.5
        System.out.println("SHALLOW");
        PersonShallow person1 = new PersonShallow("Andreea","Opris",23, carShallow);
        PersonShallow person2 = null;
        try {
            person2 = (PersonShallow) person1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("BEFORE");
        System.out.println(person1.getCar().getColor());
        System.out.println(person2.getCar().getColor());
        person2.getCar().setColor("red");
        System.out.println("AFTER");
        System.out.println(person1.getCar().getColor());
        System.out.println(person2.getCar().getColor());

        System.out.println("BEFORE");
        System.out.println(person1.getAge());
        System.out.println(person2.getAge());
        person2.setAge(2);
        System.out.println("AFTER");
        System.out.println(person1.getAge());
        System.out.println(person2.getAge());

        System.out.println("BEFORE");
        System.out.println(person1.getFirstName());
        System.out.println(person2.getFirstName());
        person2.setFirstName("Maria");
        System.out.println("AFTER");
        System.out.println(person1.getFirstName());
        System.out.println(person2.getFirstName());

        /*System.out.println("DEEP");
        PersonDeep person3 = new PersonDeep("Andreea","Opris",23, carDeep);
        PersonDeep person4 = null;
        try {
            person4 = (PersonDeep) person3.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("BEFORE");
        System.out.println(person3.getCar().getColor());
        System.out.println(person4.getCar().getColor());
        person4.getCar().setColor("red");
        System.out.println("AFTER");
        System.out.println(person3.getCar().getColor());
        System.out.println(person4.getCar().getColor());

        System.out.println("BEFORE");
        System.out.println(person3.getAge());
        System.out.println(person4.getAge());
        person4.setAge(2);
        System.out.println("AFTER");
        System.out.println(person3.getAge());
        System.out.println(person4.getAge());

        System.out.println("BEFORE");
        System.out.println(person3.getFirstName());
        System.out.println(person4.getFirstName());
        person4.setFirstName("Maria");
        System.out.println("AFTER");
        System.out.println(person3.getFirstName());
        System.out.println(person4.getFirstName());*/

        // ENUMERATION EXAMPLE
        /*Vector dayNames = new Vector();

        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");

        for (Enumeration e = dayNames.elements(); e.hasMoreElements() ;){
            System.out.println(e.nextElement());
        }*/
    }
}
