public abstract class Employee {
    private String firstName; 
    private String lastName; 
    private int id; 

    // three-argument constructor 
    public Employee(String first, String last, int id) { 
        this.firstName = first; 
        this.lastName = last; 
        this.id = id; 
    }  

    // return String representation of Employee object 
    public String toString() { 
        return firstName + " " + lastName + " id:" + id; 
    }  

    public boolean equals(Object that) { 
        return (that instanceof Employee) && this.id == ((Employee)that).id; 
    } 

    // return monthly salary 
    public abstract double earnings();   
}
