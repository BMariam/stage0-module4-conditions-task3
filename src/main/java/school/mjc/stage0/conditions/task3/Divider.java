package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
		if (0 == number) {
			System.out.println("cannot divide by zero");
		} else if (0 == number % 5 && 0 == number % 11) {
			System.out.println("Dividable");
		} else {
			System.out.println("Non-dividable");
		}
    }
}
