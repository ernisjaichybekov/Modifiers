//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] args1 = args;
            Person person = new Person("Ali", 30);

            Student student = new Student("Ayan", 20, "University");

            Employee employee = new Employee("Askar", 35, "TechCorp");

            RetiredPerson retiredPerson = new RetiredPerson("Bazar", 65, 60);


            person.greet();
            student.greet();
            student.study();
            employee.greet();
            employee.work();
            retiredPerson.greet();
            retiredPerson.relax();


            System.out.println(person.toString());
            System.out.println(student.toString());
            System.out.println(employee.toString());
            System.out.println(retiredPerson.toString());

    }


    }
