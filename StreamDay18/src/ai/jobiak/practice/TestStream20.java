package ai.jobiak.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream20 {

	public static void main(String[] args) {
		
		ArrayList<String>languages=new ArrayList<>();
		languages.add("Java programmin");
		languages.add("C language");
		languages.add("c++ language");
		languages.add("python programming");
		
	
		List<Integer>list=languages.stream().map(e->(e.hashCode())).collect(Collectors.toList());
		System.out.println(list);

	}

}
