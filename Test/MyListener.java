package Test;
import java.awt.event.*;
import javax.swing.JButton;

public class MyListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton)e.getSource();
        button.setText("��ħ�� ��ư�� ���������ϴ�.");
        //label.setText("��ħ�� ��ư�� ���������ϴ�.");
    }
}