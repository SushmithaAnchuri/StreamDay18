package ai.jobiak.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream11 {

	public static void main(String[] args) {
		
		ArrayList<String>fruits=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Pineapple");
		fruits.add("Mango");
		
		ArrayList<String>fruits1=new ArrayList<>();
		fruits1.add("Banana");
		fruits1.add("Promogranate");
		fruits1.add("JAckfruit");
		
		List<String>list=fruits.stream().map(e->(e.repeat(4))).collect(Collectors.toList());
		System.out.println(list);
	}

}
