import java.awt.*;
import java.awt.event.*;
public class MouseEventsDemo extends Frame implements MouseListener, MouseMotionListener {
    String msg = "";
    int mouseX = 0;
    int mouseY = 0;
    public MouseEventsDemo() {
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new MyWindowAdapter());
    }
    public void mouseClicked(MouseEvent me) {
        msg = msg + " -- click received";
        repaint();
    }
    public void mouseEntered(MouseEvent me) {
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse entered.";
        repaint();
    }
    public void mouseExited(MouseEvent me) {
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse exited.";
        repaint();
    }
    public void mousePressed(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Mouse down.";
        repaint();
    }
    public void mouseReleased(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Mouse Released.";
        repaint();
    }
    public void mouseDragged(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*" + " mouse at " + mouseX + ", " + mouseY;
        repaint();
    }
    public void mouseMoved(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Moving mouse at " + me.getX() + ", " + me.getY();
        repaint();
    }
    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
    }
    public static void main(String[] args) {
        MouseEventsDemo appwin = new MouseEventsDemo();
        appwin.setSize(new Dimension(600, 600));
        appwin.setTitle("MouseEventsDemo");
        appwin.setVisible(true);
    }
}
class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
