import static java.lang.Character.getName;

public class Student  extends Person{

    private String school;


    public Student(String name, int age, String school) {
        super(name, age); // Person классынын конструкторун чакыруу
        this.school = school;
    }


    public void study() {
        System.out.println(getName(1) + " is studying at " + school + ".");
    }


    @Override
    public String toString() {
        return super.toString() + ", school='" + school + "'";
    }
}

