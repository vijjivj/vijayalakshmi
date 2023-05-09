package ArrayListLambda;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {

		ArrayList<String> list  = new ArrayList<>();
		list.add("Anu");
		list.add("Jesu");
		list.add("sam");
		list.add("Jam");
		
		System.out.println("Print ArrayList");
		list.forEach((e)->{
			System.out.println(e + "");
		});
		
		
	}

}
