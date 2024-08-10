package Main;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce el número a evaluar");
		int num = lector.nextInt();
		
		int acum=0;
		
		for(int i=10;i>=1;i--) {
			System.out.println(i+"x"+num+"="+num*i);
			int total=num*i;
			acum=acum+total;
			
		}
		System.out.println(acum);
		

	}

}
