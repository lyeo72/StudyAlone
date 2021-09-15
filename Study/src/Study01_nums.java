import java.util.*;// 아직 잘 몰라서 scanner강의 듣고 일단 해봄
public class Study01_nums {

//Question!  
//1. 왜 if 문에서 =="+"를 쓰니 답이 안나왔는데 equls를 쓰니 답이 나왔을까?
//2. 콘솔창에 입력받을때 왜 숫자는 입력받는대로 나오는데 문자는 안나오는 것일까?
	//또는 콘솔창에 내가 입력한 값이 안나오게 하려면 어떻게 하여야 하는가?
//  두개의 수를 저장하는 방식 말고 여러개의 수를 계산기로 사용하려면 어떤 코드를짜야하는가?=> 배열로 하려고 시도했으나 실패!
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하시오");
		int num1 = scanner.nextInt();
		System.out.println("연산 기호를 입력하세요");
		Scanner input = new Scanner(System.in);
		String opr = input.next();
		System.out.println("두 번째 수를 입력하시오");
		int num2 = scanner.nextInt();
		System.out.println("연산 기호를 입력하세요");
		String opr2 =input.next();
		System.out.println("세번째 수를 입력하시오");
		int num3 = scanner.nextInt();

		Calculator1 c = new Calculator1();
		c.calculator(opr, num1, num2);

		c.cal2(opr2, num3);
	}

}
class Calculator1{
		double result;
	public double calculator(String opr, double...nums) { //  scanner 에 char 타입이 없어 String 으로 작성함
		 result = nums[0];
		System.out.print(nums[0]);
		if(opr.equals("+")) {// 기존에 풀었던 대로 =="+" 를쓰니 답이 안나와 equals를 썼더니 답이 나왔다 ! =>왤까?
			for(int i=1; i<nums.length; i++) {
				result += nums[i];
				System.out.print(" + "+nums[i]);
				
			}
			System.out.println( " = "+result);
		}
		if(opr.equals("-")) {
			for(int i=1; i<nums.length; i++) {
				result -= nums[i];
				System.out.print(" - "+nums[i]);
				
			}
			System.out.println( " = "+result);
		}
		if(opr.equals("*")) {
			for(int i=1; i<nums.length; i++) {
				result *= nums[i];
				System.out.print(" * "+nums[i]);
				
			}
			System.out.println( " = "+result);
		}
		if(opr.equals( "/")) {
			for(int i=1; i<nums.length; i++) {
				result /= nums[i];
				System.out.print(" / "+nums[i]);
				
			}
			System.out.println( " = "+result);
		}
		
		return result;
	}
	
	public void cal2(String opr, double num ) {
		calculator(opr, result, num );
	}
}