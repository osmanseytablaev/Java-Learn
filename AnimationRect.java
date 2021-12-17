import java.awt.*;
import java.awt.event.*;
public class AnimationRect extends Frame implements MouseListener, KeyListener {
    String msg = "";
    int x = 20;
    int y = 150;
    int w = 60;
    int h = 50;
    public AnimationRect() {
        addMouseListener(this);
        addKeyListener(this);
        addWindowListener(new MyWindowAdapter3());
    }
    public void keyReleased(KeyEvent ke) {
        msg = "Key Up";
        repaint();
    }
    public void mouseClicked(MouseEvent me) {
        msg = msg + " -- click received";
        repaint();
    }
    public void mouseEntered(MouseEvent me) {
        msg = "Mouse entered.";
        repaint();
    }
    public void mouseExited(MouseEvent me) {
        msg = "Mouse exited.";
        repaint();
    }
    public void keyPressed(KeyEvent ke) {
        x += 10;
        repaint();
    }
    public void keyTyped(KeyEvent ke) {
        msg += ke.getKeyChar();
        repaint();
    }
    public void mousePressed(MouseEvent me) {
        x -= 10;
        repaint();
    }
    public void mouseReleased(MouseEvent me) {
        msg = "Mouse Released.";
        repaint();
    }
    public void mouseDragged(MouseEvent me) {
        msg = "*" + " mouse at " + x + ", " + y;
        repaint();
    }
    public void mouseMoved(MouseEvent me) {
        msg = "Moving mouse at " + x + ", " + y;
        repaint();
    }
    public void paint(Graphics g) {
        g.drawRect(x, y, w, h);
    }
    public static void main(String[] args) {
        AnimationRect appwin = new AnimationRect();
        appwin.setSize(new Dimension(600, 600));
        appwin.setTitle("AnimationRect");
        appwin.setVisible(true);
    }
}
class MyWindowAdapter3 extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
