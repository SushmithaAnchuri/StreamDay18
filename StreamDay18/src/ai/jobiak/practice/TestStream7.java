package ai.jobiak.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream7 {

	public static void main(String[] args) {
		
		ArrayList<String>array=new ArrayList<>();
		array.add("Jammu"); array.add("kashmir"); array.add("Telangana"); array.add("Andra");

		List<Boolean>list=array.stream().map(e->(e.equals("Jammu"))).collect(Collectors.toList());
		System.out.println(list);
	}
}
