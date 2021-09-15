import java.util.*;
public class Study_cal {
		static String token;// static을 왜쓸까 아직 안배움
	public static void main(String[] args) {
		String sic = null;
		int result =0;
		int flag =0;
		Scanner sc = new Scanner(System.in);
		while(true) {//머가 트루일때??
			System.out.println("입력하세요");
			sic = sc.next();// String타입 으로 
			StringTokenizer sic2 = new StringTokenizer(sic, "+-*/",true);// 구별하는 애까지 나오게
				try {//트라이 왜쓰는지 모르겟음
					while(sic2.hasMoreTokens()) {//토큰이 더 남아있는지 확인 토큰이 없다면 빠져나오기 => hasMoreToken은 while문을 사용
						token = sic2.nextToken();// 입력받은 값을 하나씩 떨어뜨림
							if(token.equals("+")) {
							token = sic2.nextToken();
							result += Integer.parseInt(token); //
							}else if(token.equals("-")) {
							token = sic2.nextToken();
							result -= Integer.parseInt(token); //
							}else if(token.equals("*")) {
							token = sic2.nextToken();
							result *= Integer.parseInt(token); //
							}else if(token.equals("/")) {
							token = sic2.nextToken();
							result /= Integer.parseInt(token); //
							}else//else에 왜 중괄호를 안쓰는가?
								result /= Integer.parseInt(token);
					}
					flag =1;// 여기서부터 왜쓰는지모르겟음
				}
				catch(Exception e) {
					continue;
				}
				if(flag==1)
					break;
				
			
		}//while문
		System.out.println("\n 수식결과값:"+result);
		
		

	}//main 
}//study cal 