package curso.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Ágata");
		list.add("Nuno");
		list.add("Fania");
		list.add(2, "Ubirajara");
		
		System.out.println(list.size());
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("--------------");
		list.remove(2);
		list.removeIf(x -> x.charAt(0) == 'U');
		for(String x : list) {
			System.out.println(x);
		}
		
	}
}
