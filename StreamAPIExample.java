package java8example;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		
		int result = getCountEmptyStringUsingJava7(strings);
		System.out.println("Using method: Count of empty  strings: " + result);
		System.out.println("----------");
		
		Stream<String> s = strings.stream();
		s = s.filter(string -> string.isEmpty());
		
		long count = s.count();
		System.out.println("Using streams: Count of empty  strings: " + count);
		
		System.out.println("----------");
		long count1 = strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Using streams: Count of empty  strings: " + count1);
		

		
		System.out.println("----------");
		
		//display all str
		List<String> msg = strings.stream().map(string -> "hello " + string).collect(Collectors.toList());
		System.out.println("Using streams: List with hello prefix " +msg);
		
		//we have to find square of every elements from the list using stream
		List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
		
		List<Integer> square = integers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		System.out.println(square);
		
		//implementing for each using consumer functional interface. it takes one argument as e
		//and the whole thing inside foreach is an accept method.
		//for each is a terminal operation, it will perform max, min, count
		integers.stream().map(i -> i*i).distinct().forEach((e)->System.out.println(e));
		
		//average, sum, max, min
		//intermediate operation
		//for only integer related opertions like int, float, double, long, short
		//terminal operations and max, min ... converting into object 
		IntSummaryStatistics stats = integers.stream().mapToInt((x) -> x).summaryStatistics();
		
		double average = stats.getAverage();
		int max =stats.getMax();
		int min=stats.getMin();
		long sum = stats.getSum();
		
		System.out.println(max+","+min+","+average+","+sum);
		
	}

	private static int getCountEmptyStringUsingJava7(List<String> strings) {
		int count = 0;
		// TODO Auto-generated method stub
		for(String str: strings) {
			if(str.isEmpty())
				count++;
		}
		return count;
	}

}