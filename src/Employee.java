import static java.lang.Character.getName;

public class Employee  extends Person {

    private String company;


    public Employee(String name, int age, String company) {
        super(name, age); // Person классынын конструкторун чакыруу
        this.company = company;
    }


    public void work() {
        boolean getName;
        System.out.println(getName(1) + " is working at " + company + ".");
    }


    @Override
    public String toString() {
        return super.toString() + ", company='" + company + "'";
    }

}
