package ai.jobiak.streams;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Practice1 {

	public static void main(String[] args) {
		
		int[] numbers= {4,1,10,34,78,24};
		OptionalInt x=IntStream.of(numbers).min();
		System.out.println(x);
		OptionalInt y=IntStream.of(numbers).max();
		OptionalDouble a=IntStream.of(numbers).average();
		long b=IntStream.of(numbers).count();
		int c=IntStream.of(numbers).sum();
		System.out.println(y+" "+a+" "+b+" "+c);
		
		
		IntSummaryStatistics stat=IntStream.of(numbers).summaryStatistics();
		stat.getAverage();//getMin() getMax() getCount() getSum() 
		
		IntStream.of(numbers).distinct().sorted().limit(3).forEach(System.out::println);
		//Here we have skip() boxed() filter() map() 
		
		
		
		//Special two methods which return only true or flase
		
		IntStream.of(numbers).anyMatch(num->num%2==1);
		IntStream.of(numbers).allMatch(num->num%2==1);
	}

}
