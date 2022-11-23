package org.tns.stream;

//import java.util.ArrayList;
//import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class EndWithLetter {

	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		name.add("Ravi");
		name.add("Manju");
		name.add("Shiva");
		name.forEach(s -> System.out.print(s + " "));
		System.out.println();
		List<String> nameEndWithLetter = name.stream()
				.filter(nam -> nam.charAt(nam.length() - 1) == 'a')
				.collect(Collectors.toList());
		nameEndWithLetter.forEach(s ->System.out.println(s));
	}

}
