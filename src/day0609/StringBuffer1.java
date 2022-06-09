package day0609;

public class StringBuffer1 {

	public static void main(String[] args) {
		
		String result1 = "";
		result1 += "hello";
		result1 += " ";
		result1 += "world";
		
		System.out.println(result1);
		
		System.out.println("--------------");
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("good");
		sb.append(" ");
		sb.append("morning");
		System.out.println(sb);
		
		//StringBuilder 클래스
		// - StringBuffer와 비슷
		// - StringBuilder는 동기화가 돼있음 - 데이터 보호 목적
		// - 멀티쓰레드(Multi Thread) 작업에 안전하다는 특징 
		//	 - 멀티쓰레드 : 한 번에 n개의 작업 가능
		
		//StringBuffer 메서드 사용 중 멀티쓰레드 작업이 필요한 경우 StringBuilder만 사용해주면 된다
		
		System.out.println("--------------");
		
		StringBuffer sb1 = new StringBuffer();
		
		sb1.append("JAVA");
		sb1.insert(2, "Hello ");
		
		System.out.println(sb1);
		
		System.out.println(sb1.substring(2, 7));
		
		System.out.println(sb1.reverse());
	}

}
