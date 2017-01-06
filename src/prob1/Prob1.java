package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
    System.out.print("금액 :");
    int price = s.nextInt();   // 키보드로 입력받은 값을 price라는 문자열에 넣기.
    int a = price.length();
    int[] arr = new int[a]; //금액을 넣은 배열크기 지정 
   
    for(int i=0;i<a;i++){
    	    
    	arr[i] = price.charAt(i);
    	System.out.println(arr[i]);
        
         }
      }    
  
    
    }
	
	
	
	
	