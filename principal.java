package ex1subversion;

import java.util.Arrays;
import java.util.Scanner;
//comentari del projecte 2
public class principal {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		int[] array = new int[10];
		System.out.println("insereix 10 num");	
		
		for(int i=0;i<10;i++){
			array[i] = scan.nextInt();
		}
		Arrays.sort(array);
		System.out.print(array[0] + array[9]);
	}
}
//comentari del projecte 1
//adeu