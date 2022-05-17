package ai.jobiak.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream2 {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		list.add("Cse"); list.add("Ece"); list.add("EEE"); list.add("Mech");
		
		List<String> count=list.stream().filter(s->(s.isEmpty())).collect(Collectors.toList());
		System.out.println(count);
	}
	

}
