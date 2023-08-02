package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
		int taxes = 0;
		if (salary < 0) {
			System.out.println("wrong input!");
			return;
		} else if (salary <= 10000) {
			taxes = 15;
		} else if (salary <= 20000) {
			taxes = 18;
		} else if (salary > 20000) {
			taxes = 20;
		}
		double salaryAfterTaxes = salary - (salary * taxes / 100.0);
		System.out.println(salaryAfterTaxes);
    }
}
