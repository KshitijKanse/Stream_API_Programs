package IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		List<Integer>l1=Arrays.asList(9,6,4,7,4);
		List<Integer>l2=l1.stream().map(i-> i*2).collect(Collectors.toList());
//		Stream() method will maintain sequence.
//		map() method will read each elements and perform given operations.
//		collect() method will will collect and forward elements to list.
		
		System.out.println(l2);
		
		l1.stream().map(j->j*j*j).forEach(k->System.out.println(k));
		
		System.out.println(l2);
		
		List<String>language=Arrays.asList("java","C++","C","Python","SpringBoot");

		List<String>lang=language.stream().filter(s->s.startsWith("C")).collect(Collectors.toList());
		
		System.out.println("\n"+language);
		System.out.println("Language Name Starts From 'C' is "+lang);
		
		List<Integer>x=Arrays.asList(12,22,3,4,5,55);
		System.out.println("\n"+x);
		List<Integer>y=x.stream().filter(i->i%5==0).collect(Collectors.toList());
		System.out.println(y);	
	}

}
