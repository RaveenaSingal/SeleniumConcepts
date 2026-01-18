package Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamsList {

	@Test
	public void regular() {
		// Count the number of names starting with alphabet A in list
		int count = 0;
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A"))
				count++;
		}
		System.out.println(count);
	}

	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");

		long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);

		long d = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		// logic
		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));// limit>> to get 1
																								// result
	}

	@Test
	public void StreamMap() {
		// print names of length which have last letter as "a" with uppercase

		Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Rama").filter(s -> s.endsWith("a")) // closed bracket here
				.map(s -> s.toUpperCase()) // corrected method name
				.forEach(s -> System.out.println(s));

		// print names which have first letter as a with uppercase and sorted
		List<String> names = Arrays.asList("AZbhijeet", "Don", "Alekhya", "Adam", "Rama");

		names.stream().filter(s -> s.startsWith("A")) // uppercase A because your strings start with A
				.sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

	}

	@Test
	public void streamCollect() {

		// List
		// New list
		// New List>.Action performed
		List<String> dd = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Rama").filter(s -> s.endsWith("a")) // closed bracket here
		.map(s -> s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(dd.get(0));
	}
	@Test
	public void Unique() {
		List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
		//print unique numbers from this array and sort array
		values.stream().distinct().forEach(s->System.out.println(s));
		//sort the array- 3rd index-1,2,3,5,7,9
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		
	}
}
