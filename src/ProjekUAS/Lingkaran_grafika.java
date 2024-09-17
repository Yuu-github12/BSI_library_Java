package ProjekUAS;
 import java.awt.Color;
 import java.awt.Graphics;
 import java.awt.Graphics2D;
 import javax.swing.JFrame;
 import javax.swing.JPanel;
/**
*
* @author Yuu
*/
public class Lingkaran_grafika extends JPanel {
protected void paintComponent(Graphics g) {
 super.paintComponent(g);
 Graphics2D gd = (Graphics2D) g;
 
 int r = 150;
 int d = (5 / 4)* r;
 int x = 0;
 int y = r;
 
 do {
 gd.setColor(Color.BLUE);
 gd.drawLine(y + 200, x + 200,y + 200,x + 200);
 gd.drawLine(x + 200,y + 200,x + 200,y + 200);
 gd.drawLine(x + 200,-y + 200,x + 200,-y + 200);
 gd.drawLine(y + 200,-x + 200,y + 200,-x + 200);
 gd.drawLine(-y + 200,-x + 200,-y + 200,-x + 200);
 gd.drawLine(-x + 200,-y + 200,-x + 200,-y + 200);
 gd.drawLine(-x + 200,y + 200,-x + 200,y + 200);
 gd.drawLine(-y + 200,x + 200,-y + 200,x + 200);
 
 if (d < 0){
 d = d + 2 * x + 3;
 }
 else {
 d = d + 2 * (x - y) + 5;
 y = y - 1;
 }
 x = x + 1;
 } while (x < y);
}
public static void main(String[] args) {
 Lingkaran_grafika g = new Lingkaran_grafika();
 JFrame jf = new JFrame();
 jf.add(g);
 jf.setSize(600,600);
 jf.setLocationRelativeTo(null);
 jf.setVisible(true);
 jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
