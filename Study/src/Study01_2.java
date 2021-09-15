import java.util.*;


public class Study01_2 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int a = scanner.nextInt();
//		int b = scanner.nextInt();
//		String opr = scanner.next();
//		
//		
//		System.out.println(a + " + " + b + " = "   );
		
		
		
		
		
		

	}

}
class Calcul{
	
public void cal(String opr, double num1, double num2) {
		
	 	Scanner scan = new Scanner(System.in);
	 	System.out.println("첫번째 수를 입력하세요");
	 	double num0 = scan.nextDouble();
	 	System.out.println("두번째 수를 입력하세요");
	 	double num9 = scan.nextDouble();
	 	System.out.println("연산 기호를 입력하세요");
	 	String opra = scan.next();
		switch (opr) {
		case "+": System.out.println(num1 + num2 +" = " + num1 +" + " +num2); break;
		case "-": System.out.println(num1 - num2 +" = " + num1 +" - " +num2); break;
		case "*": System.out.println(num1 * num2 +" = " + num1 +" * " +num2); break;
		case "/": System.out.println((double)num1 / num2 +" = " + num1 +" / " +num2); break;
		default:System.out.println(" 올바른 연산기호를 입력하시오. ");
			break;
		}
		
	}
		
	
}
