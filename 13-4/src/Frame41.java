import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("�������̺�", 150,150);
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
                this.setTitle("�����ϴ� ���̺� �����");
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                thread = new runnable();
                th = new Thread(thread);//������ ��ü ����
                this.setLocation(200, 200);
                p = new JLabel("�������̺�");
                this.add(p);
                this.setVisible(true);
                this.setSize(500, 500);
                th.start();//Ÿ�̸� �����尡 ������ �����ϰ� �Ѵ�.
                
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
                                        Thread.sleep(0); //0�� ���� ���� �� �� �����.
                                        p.setLocation(100, 100);                
                                }
                                catch(InterruptedException e){
                                	return; //���ܰ� �߻��ϸ� ������ ����
                                }
                      }
                }
        }

        public static void main(String[] args)
        {
                new Frame41();
                
        }
}

