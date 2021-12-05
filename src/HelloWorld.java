import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld {
    private JButton halloButton;
    private JPanel mainPanel;
    private JTextField nameField;
    private JLabel namensLabel;
    private JCheckBox informalCheckBox;

    public HelloWorld() {
        halloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean informell = informalCheckBox.isSelected();
                String name = nameField.getText();
                if (informell){
                    JOptionPane.showMessageDialog(halloButton,"Yo "+name+" !");
                }else{
                    JOptionPane.showMessageDialog(halloButton,"Herzlich Willkommen "+name+" !");
                }


            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorld");
        frame.setContentPane(new HelloWorld().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
