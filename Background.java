import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BackgroundChange extends JFrame {
	private JButton button_yellow;
	private JButton button_pink;
	private JPanel panel;

	MyListener listener = new MyListener();

	public BackgroundChange() {
		panel = new JPanel();
		this.setSize(300, 300);
		this.setTitle("배경색 바꾸기");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		button_yellow = new JButton("노란색");
		button_pink = new JButton("분홍색");
		
		button_yellow.addActionListener(listener);
		button_pink.addActionListener(listener);
		
		panel.add(button_yellow);
		panel.add(button_pink);
		
		this.add(panel);
		this.setVisible(true);
		
	}
	
	private class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button_yellow)
					panel.setBackground(Color.yellow);
				else if (e.getSource() == button_pink)
					panel.setBackground(Color.pink);
			}
			
		}
			
	}

public class Background {

	public static void main(String[] args) {
		BackgroundChange b = new BackgroundChange();

	}
}
