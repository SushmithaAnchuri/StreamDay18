package ai.jobiak.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream3 {

	public static void main(String[] args) {
		
		ArrayList<String>array=new ArrayList<>();
		array.add("Cinema"); array.add("Production"); array.add("Hero"); array.add("Heroine");
		
		List<Integer>list=array.stream().map(a->(a.length()/2)).collect(Collectors.toList());
		System.out.println(list);
	}

}
