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
                this.setTitle("�����ϴ� ������ �����");
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                thread = new runnable();
                th = new Thread(thread); //������ ��ü ����
                this.setLocation(100, 100);
                this.add(p);
                this.setVisible(true);
                this.setSize(300, 300);
                th.start(); //Ÿ�̸� �����尡 ������ �����ϰ� �Ѵ�.

        }

        class runnable implements Runnable
        {
                public void run()
                {
                        while(true) //���ѷ��� ����
                        {
                                try
                                {
                                        f.setLocation(97, 97);
                                        Thread.sleep(1); //1�ʵ��� ���� �� �� �����.
                                        f.setLocation(100, 100);

                                }
                                catch(InterruptedException e){
                                	return; //���ܰ� �߻��ϸ� ������ ����
                                }
                        }
                }
        }

        public static void main(String[] args)
        {
                new Frame4();
        }
}


