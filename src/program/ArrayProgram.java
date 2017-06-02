package program;

import java.util.Arrays;

public class ArrayProgram {

	public static void main(String[] args) {

		int[] num = {13,12,14,15,16,17,18,19,20};
//		Arrays.sort
//		System.out.print(Arrays.sort(num));
		
		System.out.println();
		for(int i=0;i<num.length;i++)
		{
			if(num[i] ==13 || num[i] ==12){
				int sum =num[i]+num[i];
				System.out.println(sum);
//				break;
			} else if (num[i] ==12){
				int sum =12+12;
			System.out.println(sum);
			}
		}

	}
}