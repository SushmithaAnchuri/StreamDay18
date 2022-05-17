package ai.jobiak.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestStream18 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		ArrayList<String>array=new ArrayList<>();
		array.add("Icecream");
		array.add("chocolate");
		array.add("chips");
		array.add("Coke");
		array.add("juice");
		
		List<String>list=array.stream().map(e->(e.valueOf(array))).collect(Collectors.toList());
		System.out.println(list);

	}

}
