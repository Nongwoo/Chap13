import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Frame2 extends JFrame
{
       private MyPanel panel = new MyPanel();
     public Frame2()
        {
                setTitle("원을 0.5초 간격으로 이동");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setContentPane(panel); //생성한 panel 패널을 컨텐트팬으로 사용
                Container c = getContentPane();
                c.addMouseListener(new Mouse());
                setVisible(true);
                setSize(350, 350);
        }
                class MyPanel extends JPanel{
                
                	public void paintComponent(Graphics g) {
                		super.paintComponent(g);
                		g.setColor(Color.RED); // 빨간색 선택
                		g.drawOval(20,20,80,80); //원그리기
                	}
                }     
        public static void main(String[] args)
        {
                new Frame2();
        }
}
class Mouse implements MouseListener
{
        public void mouseClicked(MouseEvent e)
        {
                JPanel g = (JPanel)e.getSource();
                int X = (int)(Math.random()*300);
                int Y = (int)(Math.random()*300);
                g.setLocation(X, Y);
        } //마우스로 원을 클릭할때 마다 랜덤의 좌표에 원 출력
        public void mouseEntered(MouseEvent e)
        {
        }

        public void mouseExited(MouseEvent e)
        {
        }

        public void mousePressed(MouseEvent e)
        {
        }

        public void mouseReleased(MouseEvent e)
        {
        }
}


