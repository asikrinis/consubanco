package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		boolean bandera=true;
		
		while(bandera==true) {
		System.out.println("Introduce el número 1");
		int num=lector.nextInt();
		System.out.println("Introduce el número 2");
		int num2=lector.nextInt();
		
		System.out.println("Introduce la opción a realizar \n1=suma \n2=resta"
				+ "\n3=multiplicación \n4=división");
		int opcion=lector.nextInt();
		
		switch(opcion) {
		
		case 1:
			System.out.println("La suma del número  "+num+ 
					" la suma del número "+num2+
					" es igual a "+(num+num2));
			break;
		case 2: 
			System.out.println("El resultado es "+(num-num2));
			break;
			
		case 3: 
			System.out.println("El resultado es "+(num*num2));
			break;
			
		case 4:
			System.out.println("El resultado es "+(num/num2));
			break;
		}
		System.out.println("¿Desea seguir operando? \n1true \n2false");
		lector.nextBoolean();
		}

	}

}
