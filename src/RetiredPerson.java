public class RetiredPerson  extends Person{

    private int retirementAge;


    public RetiredPerson(String name, int age, int retirementAge) {
        super(name, age);
        this.retirementAge = retirementAge;
    }


    public void relax() {
        System.out.println(ageName() + " is enjoying retirement at the age of " + retirementAge + ".");
    }

    private boolean ageName() {
        return ageName();
    }

    @Override
    public String toString() {
        return super.toString() + ", retirementAge=" + retirementAge;
    }
}

