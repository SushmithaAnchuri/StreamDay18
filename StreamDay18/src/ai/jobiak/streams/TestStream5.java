package ai.jobiak.streams;

import java.util.ArrayList;
import java.util.function.Consumer;

public class TestStream5 {

	public static void main(String[] args) {
	
		ArrayList<String>array=new ArrayList<>();
		array.add("Homework"); array.add("Classwork"); array.add("Test"); array.add("Class");
		
		Consumer<String>c=(String str)->{
			System.out.println(str.compareTo("Homework"));
		};
		array.stream().forEach(c);
	}

}
