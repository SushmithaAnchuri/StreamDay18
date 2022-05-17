package ai.jobiak.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream10 {

	public static void main(String[] args) {
		ArrayList<String>cars=new ArrayList<>();
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Rollsroy");
		
		List<String>list=cars.stream().map(e->(e.replace('o', 'r'))).collect(Collectors.toList());
		System.out.println(list);
	}

}
