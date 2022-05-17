package ai.jobiak.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class TestStream19 {

	public static void main(String[] args) {
		
		ArrayList<String>fruits=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Pineapple");
		fruits.add("Mango");
		
		Consumer<String>consumer=(String str)->{
			byte[] b=str.getBytes();
			for(int i=0;i<b.length;i++) {
				System.out.println(b[i]);
			}
		};
		fruits.stream().forEach(consumer);
	}

}
