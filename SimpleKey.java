import java.awt.*;
import java.awt.event.*;
public class SimpleKey extends Frame implements KeyListener {
    String msg = "";
    String keyState = "";
    public SimpleKey() {
        addKeyListener(this);
        addWindowListener(new MyWindowAdapter2());
    }
    public void keyPressed(KeyEvent ke) {
        keyState = "Key Down";
        repaint();
    }
    public void keyReleased(KeyEvent ke) {
        keyState = "Key Up";
        repaint();
    }
    public void keyTyped(KeyEvent ke) {
        msg += ke.getKeyChar();
        repaint();
    }
    public void paint(Graphics g) {
        g.drawString(msg, 20, 100);
        g.drawString(keyState, 20, 50);
    }
    public static void main(String[] args) {
        SimpleKey appwin = new SimpleKey();
        appwin.setSize(new Dimension(600, 600));
        appwin.setTitle("SimpleKey");
        appwin.setVisible(true);
    }
}
class MyWindowAdapter2 extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

