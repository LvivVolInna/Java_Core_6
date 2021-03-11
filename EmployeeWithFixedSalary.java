package hw6Task1;

public class EmployeeWithFixedSalary implements Salaryable {

	private String name;
	private int daysWorked;
	private double monthlySalary;
	public int workingDaysPerMonth;

	public EmployeeWithFixedSalary(String name, int daysWorked, double monthlySalary, int workingDaysPerMonth) {
		this.name = name;
		this.daysWorked = daysWorked;
		this.monthlySalary = monthlySalary;
		this.workingDaysPerMonth = workingDaysPerMonth;
	}

	@Override
	public void salary() {
		double salary = monthlySalary / workingDaysPerMonth * daysWorked;
		System.out.println(name + " get a fixed salary " + salary);

	}

}
