import java.util.*;
//  swith 문으로 만들어본 계산기클래스 
/*
 * Question 
 * 여러개 입력받기
 * 배열을 이용하여?
 * 세자리수 이상이나 갯수가 정해져있지 않은만큼 계산하고 싶은데 어떻게 해야할까?
 * Scanner  문 이용법 익히기
 *  
 *
 */
class Cal{
	public void cal(String opr, double num1, double num2) {
		
		switch (opr) {
		case "+": System.out.println(num1 + num2 +" = " + num1 +" + " +num2); break;
		case "-": System.out.println(num1 - num2 +" = " + num1 +" - " +num2); break;
		case "*": System.out.println(num1 * num2 +" = " + num1 +" * " +num2); break;
		case "/": System.out.println((double)num1 / num2 +" = " + num1 +" / " +num2); break;
		default:System.out.println(" 올바른 연산을 입력하시오. ");
			break;
		}
	}
	
}

public class Study01_1 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("첫번째 수를 입력하세요");
		  double num1 = scan.nextDouble();
		 System.out.println("두번째 수를 입력하세요");
		  double num2 = scan.nextDouble();
		 System.out.println("연산 기호를 입력하세요");
		  String opr = scan.next();
		  
		  Cal cal = new Cal();
		  cal.cal(opr, num1, num2);
		  
	}

}
