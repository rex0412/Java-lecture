import javax.swing.*;
import java.awt.FlowLayout;

public class MyFrame2 extends JFrame {
	public MyFrame2() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		setLayout(new FlowLayout());
		JButton button = new JButton("��ư");
		this.add(button);
		setVisible(true);
	}

}
