import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double resto;

		if (salario >= 0 && salario <= 2000.00) {
			System.out.println("Isento");
		} else if (salario >= 2000.01 && salario <= 3000.0) {
			resto = (salario - 2000) * 0.08;
			System.out.printf("saida: R$%.2f%n", resto);
		} else if (salario >= 3000.01 && salario <= 4500.0) {
			resto = (salario - 3000) * 0.18 + 1000.0 * 0.08;
			System.out.printf("saida: R$%.2f%n", resto);
		} else {
			resto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.printf("saida: R$%.2f%n", resto);
		}
		sc.close();
	}
}
