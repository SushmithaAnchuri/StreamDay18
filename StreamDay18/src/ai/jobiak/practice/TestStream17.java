package ai.jobiak.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream17 {

	public static void main(String[] args) {
		

		ArrayList<String>english=new ArrayList<>();

		english.add("alphabets");
		english.add("vowels");
		english.add("sentences");
		english.add("Grammer");
		
		List<String>list=english.stream().filter(e->(e.contentEquals("vowels"))).collect(Collectors.toList());
		System.out.println(list);
	}

}
