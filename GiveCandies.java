# GiveCandies
import java.util.Scanner;


public class GiveCandies {

	
	public static void main(String[] args) {
		System.out.println("Enter the number of childs");
		Scanner sr=new Scanner(System.in);
		int num_of_child=sr.nextInt();
		int[] line=new int[num_of_child];
		int sum_of_Candies=0;
		int candies[]=new int[num_of_child];
		System.out.println("enter the rating");
		int rating=0;
		for(int i=0;i<line.length;i++)
		{
			rating=sr.nextInt();
			line[i]=rating;
		}
		
		System.out.println("Enter candies");
		int c=0;
		for(int k=0;k<candies.length;k++){
			c=sr.nextInt();
			candies[k]=c;
		}
		
		int f=0;
		for(int j=0;j<line.length-1;j++){
			if(line[j+1]>line[j]){
				candies[j+1]=candies[j+1]+(candies[j]+1);
				
			}
			else
				candies[j+1]=1;
			
		}
		for(int h=0;h<candies.length;h++){
			sum_of_Candies+=candies[h];
			
		}
		System.out.println("Minimum Candies Required:"+sum_of_Candies);
		
	}

}
