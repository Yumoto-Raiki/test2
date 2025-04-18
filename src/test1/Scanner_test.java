package test1;

import java.util.Scanner;

public class Scanner_test {
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			int a = 0;
			double b = 0;
			String c = "";
			boolean d = false;
			System.out.println("整数入力");
			if(sc.hasNextInt())a = sc.nextInt();
			System.out.println("少数入力");
			if(sc.hasNextDouble())b = sc.nextDouble();
			System.out.println("文字入力");
			if(sc.hasNext())c = sc.next();
			System.out.println("フラグ入力");
			if(sc.hasNext())d = sc.nextBoolean();
			
			
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
		}
		catch(Exception e){
			
			
			
		}
		
	}
	
	
	
}
