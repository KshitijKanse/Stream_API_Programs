package Reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(2,5,3,6,5);
		
		System.out.println(list);
		//Old Method Before Java 8
		int sum=0;
		for(int x:list) {
			sum=sum+x;
			       
		}
		System.out.println("Sum of List is: "+sum);
		
		//New Method After Java 8 using lambda expression
		Integer sumofnumbers=list.stream().reduce(0,(a,b)->a+b);
		System.out.println("\nSum of List is: "+sumofnumbers);
		
		//Second method using method reference
		Integer sumno=list.stream().reduce(0,Integer::sum);//here sum is zero defined above
		System.out.println("\nSum of List is: "+sumno);
		
		Integer maxn=list.stream().reduce(0, Integer::max);
		System.out.println("\nMinimum number in List is: "+maxn);

		Integer minn=list.stream().reduce(0, Integer::min);
		System.out.println("\nMaximum number in List is: "+minn);
		
	}

}
