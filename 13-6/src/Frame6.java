import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame6 extends JFrame
{
        JPanel p = new JPanel();
        npc n1;
        Thread th;
        ImageIcon imgicon= new ImageIcon("image/target.jpg");
        JLabel la;
        JLabel la1;
        Frame6()
        {
                this.setTitle("test");
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                n1 = new npc();
                th = new Thread(n1);
                p.setLayout(null);
                this.addMouseListener(new my());
                la = new JLabel(imgicon); //새 레이블 생성
                la.setSize(50, 50); //레이블의 크기 50x50
                p.add(la);
                this.add(p);
                this.setVisible(true);
                this.setSize(600, 600);
                th.start();//타이머 스레드가 실행을 시작하게 한다.
        }
        class my implements MouseListener //mouse리스너 작성
        {
                public void mouseClicked(MouseEvent e)
                {
                        la = new JLabel(imgicon);
                        la.setSize(50, 50);
                        p.add(la);
                        la.setLocation(e.getX(), e.getY());
                }
        public void mouseEntered(MouseEvent arg0) {}

        public void mouseExited(MouseEvent arg0) {}

        public void mousePressed(MouseEvent arg0) {}

        public void mouseReleased(MouseEvent arg0) {}
}
        class npc implements Runnable
        {
                public void run()
                {
                        while(true)
                        {
                                try
                                {
                                        la.setLocation(la.getX(), la.getY()-5);
                                        Thread.sleep(200); //200초 동안 잠을 잔 후 깨어난다.
                                        if(la.getY() <=0)
                                        {
                                                la.setVisible(false);
                                        }
                                }
                                catch(InterruptedException e){return;}
                        }
                }
        }
        public static void main(String[] args)
        {
                new Frame6();
        }

        }