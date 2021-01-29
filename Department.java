import java.util.ArrayList;

public class Department {
    private String name;
    private String cell;
    private int budget;
    private int sizeOfDept = 0;
    private ArrayList<Employee> deptList = new ArrayList<>();

    public Department(String name, String cell, int budget) {
        this.name = name;
        this.cell = cell;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getSizeOfDept() {
        return sizeOfDept;
    }

    public void setSizeOfDept(int sizeOfDept) {
        this.sizeOfDept = sizeOfDept;
    }

    public void addEmployee(Employee emp){
        deptList.add(emp);
        sizeOfDept++;
    }

    @Override
    public String toString(){
        return this.name + " " + this.cell + " " + this.budget + " " + this.sizeOfDept;
    }
}
