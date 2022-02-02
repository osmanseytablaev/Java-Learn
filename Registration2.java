import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Registration2 implements ActionListener {
    JPasswordField jtf3;
    JCheckBox jck;
    public Registration2() {
        JFrame jfrm = new JFrame("Registration");
        JPanel panel = new JPanel();
        BoxLayout layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(layout);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setSize(600, 600);
        JLabel jlb = new JLabel("Name:");
        JTextField jtf = new JTextField(6);
        JLabel jlb2 = new JLabel("email:");
        JTextField jtf2 = new JTextField(15);
        JLabel jlb3 = new JLabel("password:");
        jtf3 = new JPasswordField(10);
        jck = new JCheckBox("Visible password");
        jck.addActionListener(this);

        panel.add(jlb);
        panel.add(jtf);
        panel.add(jlb2);
        panel.add(jtf2);
        panel.add(jlb3);
        panel.add(jtf3);
        panel.add(jck);
        jfrm.add(panel);
        jfrm.pack();

        jfrm.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        jtf3.getPassword();
        if(jck.isSelected()) {
            jtf3.setEchoChar((char)0);
        } else {
            jtf3.setEchoChar('•');
        }

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
          new Runnable() {
            public void run() {
                new Registration2();
            }
        });
    }

}
