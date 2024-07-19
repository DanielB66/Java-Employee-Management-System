import java.util.ArrayList;

public class Factory {
    private String name; // factory name 
    private ArrayList<Employee> empList; // employee list 

    public Factory(String name) { 
        this.name = name; 
        this.empList = new ArrayList<Employee>(); 
    } 

    public void addEmployee(Employee e) { 
        if (!empList.contains(e)) { 
            empList.add(e); 
        } 
    } 

    public String toString() { 
        StringBuilder sb = new StringBuilder(); 
        sb.append("Factory Name: ").append(name).append("\n"); 
        sb.append("Number of Employees: ").append(empList.size()).append("\n"); 
        for (Employee e : empList) { 
            sb.append(e).append("\n"); 
        } 
        return sb.toString(); 
    } 

    public double totalExpenses() { 
        double total = 0; 
        for (Employee e : empList) { 
            total += e.earnings(); 
        } 
        return total; 
    } 

    public void raiseSalary(double percent) { 
        for (Employee e : empList) { 
            if (e instanceof PermanentEmployee) { 
                PermanentEmployee pe = (PermanentEmployee) e; 
                pe.setMonthlySalary(pe.getMonthlySalary() * (1 + percent / 100)); 
            } else if (e instanceof TemporaryEmployee) { 
                TemporaryEmployee te = (TemporaryEmployee) e; 
                te.setHourlyRate(te.getHourlyRate() * (1 + percent / 100)); 
            } 
        } 
    }
}
