package ai.jobiak.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream13 {

	public static void main(String[] args) {
		

		ArrayList<String>fruits=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Pineapple");
		fruits.add("Mango");
		
		char[] ch= {'a','b','c','d','e'};
		List<String>list=fruits.stream().map(e->(e.copyValueOf(ch))).collect(Collectors.toList());
		System.out.println(list);

	}

}
