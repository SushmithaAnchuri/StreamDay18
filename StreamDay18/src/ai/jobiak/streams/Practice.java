package ai.jobiak.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Practice {

	public static void main(String[] args) {
		ArrayList<String> colors=new ArrayList<>();
		colors.add("green");
		colors.add("black");
		colors.add("pink");
		colors.add("yellow");
		//nested list
		List<List<String>> flowerColors = Arrays.asList( 
			      Arrays.asList("rose", "Red"), 
			      Arrays.asList("lilly", "White"), 
			      Arrays.asList("tulip", "Orange"));
		
		
		Consumer<String>consumer=(String str)->{System.out.println(str);};
		colors.stream().forEach(consumer);
		
		
		 
		 List<String>l1= colors.stream().collect(Collectors.toList());
		 System.out.println(l1);
		 
		 
		
		List<String> l2 =colors.stream().sorted().collect(Collectors.toList());
	   System.out.println(l2);	
	  
 	
	  
	   Predicate<String> c=(String str)->{return  str.startsWith("g");	};															
	   List<String> e=colors.stream().filter(c).collect(Collectors.toList());
	   System.out.println(e);
	   
	   
	   List<Integer> l3=Arrays.asList(13,18,25,30,35,40);
	   System.out.println(l3);
	   

	   
	   int oddReduce=l3.stream().filter(x->x%2==1).reduce(0,(element1,element2)->element1+element2);
	   System.out.println(oddReduce);
	   
	
	   
	   int evenReduce=l3.stream().filter(x->x%2==0).reduce(0,(element1,element2)->element1+element2);
	   System.out.println(evenReduce);
	   System.out.println();
	 
	  
	   int sumReduce = l3.stream().reduce(0, (element1, element2) -> element1 + element2);
	   System.out.println(sumReduce);
	 
	   
	   Optional<String>l4= colors.stream().findFirst();
	   System.out.println(l4);
	 
	  
	  
	   System.out.println();
	   List<String> l5 = flowerColors.stream().flatMap(Collection::stream).collect(Collectors.toList());
	   System.out.println(l5);
	   
	   List<List<String>> l6 = flowerColors.stream().peek(System.out::println).collect(Collectors.toList());
		   //.collect(Collectors.toList());

	}

}
