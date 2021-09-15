import java.util.*;//했는데 잘 모르겠음,,,ㅜㅜㅜㅜㅜㅜ

public class Study_calcul {

	public static void main(String[] args) {
		Cal5 c = new Cal5();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요");
		
		String value = sc.nextLine();
		String [] values = value.split(" ");
		
		int first = Integer.parseInt(values[0]);
		
		int result = first;
		
		for(int i=1; i<values.length; i=i+2 ) {
			String opr = values[i];
			
			int second = Integer.parseInt(values[i+1]);
			result = c.cal(result, opr, second);// 흠,, 이유를 모르겠단 말이야?!!!! 
		}
		
		System.out.println(result);
	}

}
class Cal5{
	
	Scanner sc = new Scanner(System.in);
	int first = sc.nextInt();
	
	String opr = sc.next();
	
	int second = sc.nextInt();
	public int cal(int first, String opr, int second) {

		int result =0;
		switch (opr) {
		case "+": result = first + second; break;
		case "-": result = first - second; break;
		case "*": result = first * second; break;
		case "/": result = first / second; break;
		default:System.out.println(" 올바른 연산기호를 입력하시오. ");
			break;
		}
		
		
		return result;
	}
}
