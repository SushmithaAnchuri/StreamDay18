package ai.jobiak.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestStream8 {

	public static void main(String[] args) {
		
		ArrayList<String>colours=new ArrayList<>();
		colours.add("Blue");
		colours.add("Yellow");
		colours.add("Green");
		colours.add("Red");
		
		Function<String,Integer>function=(String str)->{
			return (str.indexOf("Green"));
		};
		
		List<Integer>list=colours.stream().map(function).collect(Collectors.toList());
		System.out.println(list);
	}

}
