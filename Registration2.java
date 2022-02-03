import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Registration2 implements ActionListener {
    JPasswordField jtf3;
    JCheckBox jck;
    JLabel jlab;
    JLabel jlab2;
    JLabel jlab3;
    JLabel jlab4;
    JMenuItem jMenuItem;
    JMenu jMenuItem2;
    JMenuItem jMenuItem3;
    JMenuItem jMenuItem4;
    JRadioButtonMenuItem jRadioButtonMenuItem;
    JRadioButtonMenuItem jRadioButtonMenuItem2;
    JTextField jtf2;
    JFrame jFrame;
    JPanel panel;
    String[] Countries = {"USA", "Russian", "Ukraine",
            "Australia", "Germany", "Italian",
            "British", "France", "Chinese",
            "Egypt" , "Japan" , "Other" } ;
    public Registration2() {
        jFrame = new JFrame("Registration");
        panel = new JPanel();
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT);
        panel.setLayout(flowLayout);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300, 600);
        jlab = new JLabel();
        jlab2 = new JLabel();
        jlab3 = new JLabel();
        jlab4 = new JLabel();
        JLabel jlb2 = new JLabel("email:");
        jtf2 = new JTextField(15);
        JLabel jlb3 = new JLabel("password:");
        jtf3 = new JPasswordField(10);
        jck = new JCheckBox("Show password");
        jck.addActionListener(this);
        JButton jButton = new JButton("Ok");
        jButton.addActionListener(this);
        JButton jButton2 = new JButton("Cancel");
        jButton2.addActionListener(this);
        JComboBox<String> jComboBox = new JComboBox<>(Countries);
        JRadioButton b = new JRadioButton("Male");
        b.addActionListener(this);
        JRadioButton b2 = new JRadioButton("Female");
        b2.addActionListener(this);
        ButtonGroup bg = new ButtonGroup();
        bg.add(b);
        bg.add(b2);
        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenu = new JMenu("Settings");
        jMenuItem = new JMenuItem("Save");
        jMenuItem.addActionListener(this);
        jMenuItem2 = new JMenu("Background");
        jRadioButtonMenuItem = new JRadioButtonMenuItem("Cyan");
        jRadioButtonMenuItem.addActionListener(this);
        jRadioButtonMenuItem2 = new JRadioButtonMenuItem("White", true);
        jRadioButtonMenuItem2.addActionListener(this);
        jMenuItem2.add(jRadioButtonMenuItem);
        jMenuItem2.add(jRadioButtonMenuItem2);
        ButtonGroup buttonGroup = new  ButtonGroup();
        buttonGroup.add(jRadioButtonMenuItem);
        buttonGroup.add(jRadioButtonMenuItem2);
        jMenuItem3 = new JMenuItem("Exit");
        jMenuItem3.addActionListener(this);
        JMenu jMenu3 = new JMenu("Help");
        jMenuItem4 = new JMenuItem("About");
        jMenu.add(jMenuItem);
        jMenu.add(jMenuItem2);
        jMenu.addSeparator();
        jMenu.add(jMenuItem3);
        jMenu3.add(jMenuItem4);
        jMenuBar.add(jMenu);
        jMenuBar.add(jMenu3);
        jFrame.setJMenuBar(jMenuBar);

        panel.add(jlb2);
        panel.add(jtf2);
        panel.add(jlb3);
        panel.add(jtf3);
        panel.add(jck);
        panel.add(jComboBox);
        panel.add(b);
        panel.add(b2);
        panel.add(jButton);
        panel.add(jButton2);
        panel.add(jlab);
        panel.add(jlab2);
        jFrame.add(panel);

        jFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        jtf3.getPassword();
        String str = ae.getActionCommand();
        if(jck.isSelected()) {
            jtf3.setEchoChar((char)0);
        } else {
            jtf3.setEchoChar('•');
        }
        if(str.equals("Cancel")) {
            System.exit(0);
        }
        if(str.equals("Ok")) {
            jlab.setText("You are Registered!");
        }
        if(str.equals("Save")) {
            jlab.setText("Registration is saved!");
        }
        if(str.equals("Cyan")) {
            panel.setBackground(Color.CYAN);
        }
        if(str.equals("White")) {
            panel.setBackground(Color.WHITE);
        }
        if(str.equals("Exit")) {
            System.exit(0);
        }

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                Registration2::new);
    }

}
