import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame4 extends JFrame
{
        JFrame f = this;
        JPanel p = new JPanel();
        runnable thread;
        Thread th;
        Frame4()
        {
                this.setTitle("진동하는 프레임 만들기");
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                thread = new runnable();
                th = new Thread(thread); //스레드 객체 생성
                this.setLocation(100, 100);
                this.add(p);
                this.setVisible(true);
                this.setSize(300, 300);
                th.start(); //타이머 스레드가 실행을 시작하게 한다.

        }

        class runnable implements Runnable
        {
                public void run()
                {
                        while(true) //무한루프 실행
                        {
                                try
                                {
                                        f.setLocation(97, 97);
                                        Thread.sleep(1); //1초동안 잠을 잔 후 깨어난다.
                                        f.setLocation(100, 100);

                                }
                                catch(InterruptedException e){
                                	return; //예외가 발생하면 스레드 종료
                                }
                        }
                }
        }

        public static void main(String[] args)
        {
                new Frame4();
        }
}


