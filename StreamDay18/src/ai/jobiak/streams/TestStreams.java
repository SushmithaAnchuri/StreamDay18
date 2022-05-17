	package ai.jobiak.streams;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestStreams {

	public static void main(String[] args) {
		
		ArrayList<String>list=new ArrayList<>();
		list.add("Hello"); list.add("Hi"); list.add("Bonjure"); list.add("Buenos dias");
		/* Iterator<String>iter=list.iterator();
		 while(iter.hasNext()){
			 String element=iter.next();
			 System.out.println(element);
			 
		 }
		 for(String str:list) {System.out.println(str);}*/ 
		//java8 is all about collections 
		 list.stream().forEach(System.out::println);
		 //a stream has three operations 1 filter(predicate Interface) 2 map function(Function Interfac) 3 terminal operation(Consumer Interface)
		 
		 Consumer<String> consumer=(String str)->{
			 System.out.println(str);
		 };
		 list.stream().forEach(consumer);
		 
		 long count=list.stream().count();
		 System.out.println(count);
		 
		 
		 //Predicate<String>testB=(String str)->{return (str.charAt(0)=='B');};
		 List<Boolean>letterBList=list.stream().map(e->(e.charAt(0)=='B')).collect(Collectors.toList());
		 System.out.println(letterBList);
		 }
		 /*List<String>letterBList=list.stream().filter(e->(e.charAt(0)=='B')).collect(Collectors.toList());
		 System.out.println(letterBList);
		 
		 List<String>letter=list.stream().filter(e->(e.length()>4)).collect(Collectors.toList());
		 System.out.println(letter);
		 
		 list.stream().map(e->e.toUpperCase()).forEach(consumer);
		 Function<String,String>first3Letters=(s)->{return s.substring(0,3);};
		 list.stream().map(first3Letters).forEach(consumer);*/
	}

