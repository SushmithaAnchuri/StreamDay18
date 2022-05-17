package ai.jobiak.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream15 {

	public static void main(String[] args) {
		
		ArrayList<String>array=new ArrayList<>();
		array.add("Icecream");
		array.add("chocolate");
		array.add("chips");
		array.add("Coke");
		array.add("juice");
		
		List<Integer>list=array.stream().map(e->(e.codePointCount(1, 4))).collect(Collectors.toList());
		System.out.println(list);
	}

}
