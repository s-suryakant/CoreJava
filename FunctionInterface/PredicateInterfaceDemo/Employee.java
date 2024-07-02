package PredicateInterfaceDemo;

public class    Employee {
    String name;
    String designation;
    double salary;
    String city;

    public Employee(String name, String designation, double salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    @Override
    public String toString(){
        String result = String.format("[%s%s%.2f%s]",name,designation,salary,city);
        return result;
    }

    @Override
    public boolean equals(Object obj){
        Employee e=(Employee)obj;
        return (name.equals(e.name)&&designation.equals(e.designation)&&salary==e.salary && city==e.city);
    }
}
