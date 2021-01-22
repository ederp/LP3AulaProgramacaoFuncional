package video3;

public class Java8LambdaRunnable {
	
	public static void main(String[] args) {
		new Thread(() -> System.out.println("Olá mundo!")).run();
	}

}
