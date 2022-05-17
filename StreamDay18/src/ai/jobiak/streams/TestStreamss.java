package ai.jobiak.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamss {

	public static void main(String[] args) {
		
		ArrayList<Integer>productsList=new ArrayList<>();
		productsList.add(543);
		productsList.add(23);
		productsList.add(45);
		
		List<Integer> list=productsList.stream().distinct().collect(Collectors.toList());
		System.out.println(list);

		int x=productsList.stream().max(Integer::compare).get();
		System.out.println(x);
		
		int min=productsList.stream().max(Comparator.reverseOrder()).get();
		System.out.println(min);
	}

}
