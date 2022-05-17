package ai.jobiak.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream12 {

	public static void main(String[] args) {
		
		ArrayList<String>english=new ArrayList<>();

		english.add("alphabets");
		english.add("vowels");
		english.add("sentences");
		english.add("Grammer");
		
		List<Boolean>list=english.stream().map(e->(e.contains("Grammer"))).collect(Collectors.toList());
		System.out.println(list);
	}

}
