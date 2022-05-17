package ai.jobiak.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream14 {

	public static void main(String[] args) {
		
		ArrayList<String>array=new ArrayList<>();
		array.add("Icecream");
		array.add("chocolate");
		array.add("chips");

		List<Integer>list=array.stream().map(e->(e.codePointAt(1))).collect(Collectors.toList());
		System.out.println(list);
	}

}
