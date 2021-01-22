package video3;

import javax.swing.JButton;

public class Java8LambdaActionListener {

	public static void main(String[] args) {
		JButton jButton = new JButton();
		jButton.addActionListener(e -> System.out.println("Olá mundo!"));
	}

}
