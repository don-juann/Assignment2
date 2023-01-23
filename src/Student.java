public class Student extends Person{
    private double gpa;

    public Student(){
        super();
    }
    public Student(String name, String surname, double gpa){
        this();
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student" + super.toString();
    }
    public double getPaymentAmount(){
        if(getGpa()>2.67) {return 36660;}
        else{return 0;}
    }
}
