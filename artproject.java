import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class artproject extends JFrame implements MouseListener, MouseMotionListener, KeyListener, MouseWheelListener {

	Canvas c;
	private int x1, y1;
	private int color;

	artproject() {
		super("canvas");

		c = new Canvas() {
			public void paint(Graphics g) {
			}
		};

		c.setBackground(Color.black);
		c.addKeyListener(this);
		c.addMouseListener(this);
		c.addMouseMotionListener(this);
		c.addMouseWheelListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(c);
		setSize(800, 600);
		show();
	}

	public void keyPressed(KeyEvent e) {

	}

	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {
		Graphics g = c.getGraphics();

		if (Math.abs(color % 10) == 0)
			g.setColor(Color.red);
		if (Math.abs(color % 10) == 1)
			g.setColor(Color.orange);
		if (Math.abs(color % 10) == 2)
			g.setColor(Color.yellow);
		if (Math.abs(color % 10) == 3)
			g.setColor(Color.green);
		if (Math.abs(color % 10) == 4)
			g.setColor(Color.cyan);
		if (Math.abs(color % 10) == 5)
			g.setColor(Color.blue);
		if (Math.abs(color % 10) == 6)
			g.setColor(Color.white);
		if (Math.abs(color % 10) == 7)
			g.setColor(Color.gray);
		if (Math.abs(color % 10) == 8)
			g.setColor(Color.pink);
		if (Math.abs(color % 10) == 9)
			g.setColor(Color.magenta);
		g.setFont(new Font("Bold", 1, 100));
		String s = e.getKeyChar() + "";
		g.drawString(s, x1, y1);

	}

	public void mouseMoved(MouseEvent e1) {
		x1 = e1.getX();
		y1 = e1.getY();
	}

	public void mouseClicked(MouseEvent e) {
		Graphics g = c.getGraphics();

		if (Math.abs(color % 10) == 0)
			g.setColor(Color.red);
		if (Math.abs(color % 10) == 1)
			g.setColor(Color.orange);
		if (Math.abs(color % 10) == 2)
			g.setColor(Color.yellow);
		if (Math.abs(color % 10) == 3)
			g.setColor(Color.green);
		if (Math.abs(color % 10) == 4)
			g.setColor(Color.cyan);
		if (Math.abs(color % 10) == 5)
			g.setColor(Color.blue);
		if (Math.abs(color % 10) == 6)
			g.setColor(Color.white);
		if (Math.abs(color % 10) == 7)
			g.setColor(Color.gray);
		if (Math.abs(color % 10) == 8)
			g.setColor(Color.pink);
		if (Math.abs(color % 10) == 9)
			g.setColor(Color.magenta);
		int x, y;
		x = e.getX();
		y = e.getY();
		g.fillOval(x, y, 5, 5);
	}

	public void mouseDragged(MouseEvent e) {
		Graphics g = c.getGraphics();
		if (Math.abs(color % 10) == 0)
			g.setColor(Color.red);
		if (Math.abs(color % 10) == 1)
			g.setColor(Color.orange);
		if (Math.abs(color % 10) == 2)
			g.setColor(Color.yellow);
		if (Math.abs(color % 10) == 3)
			g.setColor(Color.green);
		if (Math.abs(color % 10) == 4)
			g.setColor(Color.cyan);
		if (Math.abs(color % 10) == 5)
			g.setColor(Color.blue);
		if (Math.abs(color % 10) == 6)
			g.setColor(Color.white);
		if (Math.abs(color % 10) == 7)
			g.setColor(Color.gray);
		if (Math.abs(color % 10) == 8)
			g.setColor(Color.pink);
		if (Math.abs(color % 10) == 9)
			g.setColor(Color.magenta);

		int x, y;
		x = e.getX();
		y = e.getY();

		g.fillOval(x, y, 5, 5);
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		color += (e.getWheelRotation());
		System.out.println(color);
	}

	public static void main(String args[]) {
		artproject c = new artproject();
	}

}
