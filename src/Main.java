public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("AB De Villiers", 17, 100000000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Chris Gayle", 333, 8,100000.0);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        System.out.println("Initial Employee Details : ");
        payrollSystem.displayEmployee();
        System.out.println("Removing Employee : ");
        payrollSystem.removeEmployee(333);
        System.out.println("Remaining Employees : ");
        payrollSystem.displayEmployee();
    }
}
