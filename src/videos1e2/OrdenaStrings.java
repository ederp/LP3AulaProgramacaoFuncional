package videos1e2;

import java.util.ArrayList;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");
		
		palavras.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));
		
		System.out.println(palavras);

		palavras.forEach(t -> System.out.println(t));
	}

}

