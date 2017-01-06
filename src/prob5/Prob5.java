package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		//Randomize 하기
		Random random = new Random();
		int number = random.nextInt(100)+1; //0-99까지 / 1부터 100까지로 변경
		
		System.out.println( number );
		Scanner scanner = new Scanner(System.in);
		System.out.println("다시 하시겠습니까?(Y/N)");
		String answer = scanner.nextLine();
		System.out.println(answer.equals("y"));
			
			
			
			
			
		
		
		
	}
}