import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Streams {
	
	@Test
	public void regular() {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Ajju");
		a.add("Kriti");
		a.add("John");
		a.add("Anjana");
		a.add("Rhaul");
		
		int count=0;
		
		//count no of strings starts with "A"
		for(int i=0;i<a.size();i++) {
			if(a.get(i).startsWith("A")) {
			count++;
			}
			
		}
		System.out.println(count);
		
	}
	@Test
	public void streamFilter() {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Ajju");
		a.add("Kriti");
		a.add("John");
		a.add("Anjana");
		a.add("Rhaul");
		
	long countFromStream=	a.stream().filter(s->s.startsWith("A")).count();
	List<String> sorted=a.stream().filter(s->s.startsWith("A")).sorted().collect(Collectors.toList());
	System.out.println("The names are sorted  "+sorted);
	System.out.println("countFromStream "+countFromStream);
	
	a.stream().filter(x->x.contains("John")).forEach(x->System.out.println(x));
		
		
	}
	
	@Test
	public void method1() {
		Stream.of("Ram","Shiva","Junnu").filter(s->s.length()>2).limit(1).forEach(s->System.out.println("The limit 1 name is  "+s));
		Stream.of("Rama","Shiva","Junnu","Padma").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println("The Names ends with a, and convert to uppercase  "+s));
	}

}
