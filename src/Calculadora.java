import java.util.Scanner;

/**
 * 
 */

/**
 * @author AGJ
 *
 */
public class Calculadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner calculo = new Scanner(System.in);
		
		String operador;
		int resultado;
		int num;
		int num2;
		
		System.out.println("Qual o operador que ir� utilizar?");
		operador = calculo.next();
		
		if (operador.contains("+")) {
			System.out.println("Informe o primeiro n�mero: ");
			num = calculo.nextInt();
			
			System.out.println("Informe o segundo n�mero: ");
			num2 = calculo.nextInt();
			
			resultado = num + num2;
			System.out.println(num + "+" + num2 + "= " + resultado);
		}
		else if (operador.contains("-")) {
			System.out.println("Informe o primeiro n�mero: ");
			num = calculo.nextInt();
			
			System.out.println("Informe o segundo n�mero: ");
			num2 = calculo.nextInt();
			
			resultado = num - num2;
			System.out.println(num + "-" + num2 + "= " + resultado);
		}
		else if (operador.contains("*")) {
			System.out.println("Informe o primeiro n�mero: ");
			num = calculo.nextInt();
			
			System.out.println("Informe o segundo n�mero: ");
			num2 = calculo.nextInt();
			
			resultado = num * num2;
			System.out.println(num + "*" + num2 + "= " + resultado);
		}
		else if (operador.contains("/")) {
			System.out.println("Informe o primeiro n�mero: ");
			num = calculo.nextInt();
			
			System.out.println("Informe o segundo n�mero: ");
			num2 = calculo.nextInt();
			
			resultado = num / num2;
			System.out.println(num + "/" + num2 + "= " + resultado);
		}
		else {
			System.out.println("Inicie novamente");
		}
		
		
		

	}

}
