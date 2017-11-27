import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("진동레이블", 150,150);
	}
}

class Frame41 extends JFrame
{
        JFrame f = this;
        JLabel p = new JLabel(); 
        runnable thread;
        Thread th;         
        Frame41()
        {
                this.setTitle("진동하는 레이블 만들기");
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                thread = new runnable();
                th = new Thread(thread);//스레드 객체 생성
                this.setLocation(200, 200);
                p = new JLabel("진동레이블");
                this.add(p);
                this.setVisible(true);
                this.setSize(500, 500);
                th.start();//타이머 스레드가 실행을 시작하게 한다.
                
        }     
        class runnable implements Runnable
        {     	
                public void run()
                {               	
                        while(true)
                        {                      
                                try
                                {
                                        p.setLocation(97, 97);
                                        Thread.sleep(0); //0초 동안 잠을 잔 후 깨어난다.
                                        p.setLocation(100, 100);                
                                }
                                catch(InterruptedException e){
                                	return; //예외가 발생하면 스레드 종료
                                }
                      }
                }
        }

        public static void main(String[] args)
        {
                new Frame41();
                
        }
}

