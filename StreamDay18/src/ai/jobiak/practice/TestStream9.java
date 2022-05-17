package ai.jobiak.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream9 {

	public static void main(String[] args) {
		

		ArrayList<String>colours=new ArrayList<>();
		colours.add("Blue");
		colours.add("Yellow");
		colours.add("Green");
		colours.add("Red");
		
		List<String>list=colours.stream().map(e->(e.replaceFirst("Yellow", "White"))).collect(Collectors.toList());
		System.out.println(list);

	}

}
