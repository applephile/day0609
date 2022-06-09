package day0609;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		//숫자별로 배열로 단어를 대입시켜놓고 랜덤으로 블랭크를 받는다
		//단어를 한 글자씩 나눈다(StringBuffer)
		//글자 길이만큼 밑줄
		//Scanner로 사용자에게 추측 단어를 받는다
		//indexOf로 블랭크의 단어에 속해있다면 찾는다
		Scanner s = new Scanner(System.in);
		
		String[] word = {"java", "count", "school", "book", "student", "programmer"};
		
		int index = (int)(Math.random() * 6);
//		int index2 = (new Random()).nextInt(word.length);
		
		String text = word[index];
//		StringBuffer rndWord = new StringBuffer(word[index]);
		
		StringBuffer answer = new StringBuffer(text.length());

		for(int i=0; i<text.length(); i++) {
			answer.append("_");
		}
		
		while(true) {
//			StringBuffer underScore = new StringBuffer("_"); 

//			System.out.print("현재의 상태 : ");
			System.out.print("현재의 상태 : " + answer);
//			for(int i=1; i<=rndWord.length(); i++) {
//				System.out.print(underScore);
//			}

			if(text.equals(answer.toString())) {
				break;
			}
			
			System.out.print("\n글자를 추측하시오 : ");
			char userWord = s.next().charAt(index);
			
			for(int i=0; i<text.length(); i++) {
				if(userWord == text.charAt(i)) {
					answer.setCharAt(i, userWord);
				}
			}
			
//			if(rndWord.indexOf(userWord) != -1) {
//				underScore.deleteCharAt(rndWord.indexOf(userWord));
//			} else {
//				System.out.println("없음");
//				break;
//			}
			
		}
		
	}

}
