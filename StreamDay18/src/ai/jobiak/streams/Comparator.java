package ai.jobiak.streams;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	class product1{
		int id;
		String name;
		double price;
		public product1(int id, String name, double price) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
		}
		
	
	}
	public class Comparator{
		
		public static void main(String[] args) {
			
			List<product1>list=new ArrayList<>();
			list.add(new product1(1, "Mango", 50));
			list.add(new product1(1, "Apple", 50));
			list.add(new product1(1, "Grapes", 50));
			list.add(new product1(1, "Banana", 50));
			
			System.out.println("Sorting on the basis of name....");
			
			Collections.sort(list,(p1,p2)->
			{
				return p1.name.compareTo(p2.name);
			});
			
			for(product1 p:list) {
				System.out.println(p.id+" "+p.name+" "+p.price);
			}
		}

	}

