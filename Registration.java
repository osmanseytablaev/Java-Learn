import java.awt.*;
import java.awt.event.*;
public class Registration extends Frame implements ActionListener, ItemListener {
    TextField name, password, email;
    Choice sex;
    Button ok, cancel;
    String msg = "";
    public Registration() {
        setLayout(new FlowLayout());
        setBackground(Color.CYAN);
        Label namep = new Label("Name: ", Label.LEFT);
        Label passwordp = new Label("Password: \n", Label.LEFT);
        Label emailp = new Label("Email: ", Label.LEFT);
        email = new TextField(10);
        name = new TextField(12);
        password = new TextField(10);
        password.setEchoChar('*');
        ok = new Button("Ok\n");
        cancel = new Button("Cancel");
        sex = new Choice();
        sex.add("Male");
        sex.add("Female");
        add(namep);
        add(name);
        add(emailp);
        add(email);
        add(passwordp);
        add(password);
        add(ok);
        add(cancel);
        add(sex);
        name.addActionListener(this);
        password.addActionListener(this);
        email.addActionListener(this);
        ok.addActionListener(this);
        cancel.addActionListener(this);
        sex.addItemListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if(str.equals("Ok")) {
            msg = "Success!";
        } else if(str.equals("Cancel")) {
            System.exit(0);
        }
        repaint();
    }
    public Insets getInsets() {
        return new Insets(40, 20, 10, 20);
    }
    public void ItemStateChanged(ItemEvent ie) {
        repaint();
    }
    public void paint(Graphics g) {
        g.drawString(msg, 20, 230);
    }
    public static void main (String[] args) {
        Registration app = new Registration();
        app.setSize(new Dimension(200, 250));
        app.setTitle("Registration");
        app.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        repaint();
    }
}
