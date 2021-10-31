import java.text.DecimalFormat;
import java.util.Scanner;

public class Equacao {
	public double a, b, c, delta, x1, x2;
	Scanner scanner = new Scanner(System.in);
	
	public void calculo() {
		System.out.println("Informe o valor de A:");
		a = scanner.nextDouble();
		
		System.out.println("Informe o valor de B:");
		b = scanner.nextDouble();
		
		System.out.println("Informe o valor de C:");
		c = scanner.nextDouble();
		
		delta =  Math.pow(b, 2) -4*a*c;
		
		if(delta > 0) {
			System.out.println("O valor do delta é " + delta);
			System.out.println("");
			
			x1 = ((-b + Math.sqrt(delta)) / (2*a));
			
			x2 = ((-b - Math.sqrt(delta)) / (2*a));
			
			DecimalFormat df = new DecimalFormat("#,##0.00");
			
			DecimalFormat df2 = new DecimalFormat("#,##0.00");
			
			System.out.println("O valor de x1 é: " + df.format(x1));
			System.out.println("O valor de x2 é: " + df2.format(x2));
		}else {
			System.out.println("O valor do delta é " + delta);
			System.out.println("Equação não possui raizes!");
		}
	}
	
}
