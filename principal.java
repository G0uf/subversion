package ex1subversion;

import java.util.Arrays;
import java.util.Scanner;

public class principal {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		int[] array = new int[5];
		System.out.println("insereix 5 num");	
		
		for(int i=0;i<5;i++){
			array[i] = scan.nextInt();
		}
		Arrays.sort(array);
		System.out.print(array[0]);
	}
}
