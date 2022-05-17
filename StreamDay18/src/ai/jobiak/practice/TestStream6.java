package ai.jobiak.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream6 {

	public static void main(String[] args) {


		ArrayList<String>array=new ArrayList<>();
		array.add("Jammu"); array.add("kashmir"); array.add("Telangana"); array.add("Andra");
		
		List<String>list=array.stream().filter(s->(s.endsWith("a"))).collect(Collectors.toList());
		System.out.println(list);

	}

}
