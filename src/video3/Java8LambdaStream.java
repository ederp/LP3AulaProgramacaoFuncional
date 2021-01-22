package video3;

import java.util.Arrays;
import java.util.List;

public class Java8LambdaStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> asList = Arrays.asList(1,2,3,4);
		
		asList.stream()
			.filter(e -> e % 2 == 0)
			.forEach(e -> System.out.println(e));
	}

}
