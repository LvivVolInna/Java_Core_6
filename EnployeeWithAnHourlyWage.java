package hw6Task1;

public class EnployeeWithAnHourlyWage implements Salaryable {

	private String name;
	private int hoursAmount;
	private double hourlyRate;

	public EnployeeWithAnHourlyWage(String name, int hoursAmount, double hourlyRate) {
		this.name = name;
		this.hoursAmount = hoursAmount;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public void salary() {
		double salary = hoursAmount * hourlyRate;
		System.out.println(name + " get an hourly wage " + salary);

	}

}
