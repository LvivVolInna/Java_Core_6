package hw6Task1;

public class AppTask1 {

	public static void main(String[] args) {

		EmployeeWithFixedSalary Ivan = new EmployeeWithFixedSalary("Ivan", 10, 1350.0, 22);
		Ivan.salary();

		EnployeeWithAnHourlyWage Petro = new EnployeeWithAnHourlyWage("Petro", 128, 8.5);
		Petro.salary();

	}

}
