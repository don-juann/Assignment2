public abstract class Person implements Payable, Comparable<Person>{
    private static int id_gen=1;
    private int id;
    private String name;
    private String surname;

    public Person(){
        id = id_gen++;
    }
    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }
    public abstract double getPaymentAmount();

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    @Override
    public String toString() {
        return ": " + getId() + "." + getName() + " " + getSurname() + " earns " + getPaymentAmount() + " tenge";
    }

    @Override
    public int compareTo(Person o) {
        return (int) (this.getPaymentAmount() - o.getPaymentAmount());
    }
}
