
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import java.io.*;
import java.applet.*;

public class Help extends JFrame implements ActionListener
{
	JFrame jf;
    Font f,f1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	JButton cancel;
	ImageIcon img;
	File wavFile = new File("clicksound.au");
    AudioClip sound;
      //Timer t;

		Help()
		{
	     	jf=new JFrame();
	     	f = new Font("Times New Roman",Font.BOLD,20);//button
	   		f1 = new Font("Times New Roman",Font.BOLD+Font.ITALIC,25);//label
			jf.setLayout(null);
			try{sound = Applet.newAudioClip(wavFile.toURL());}
            catch(Exception e){e.printStackTrace();}

			l2=new JLabel("Help");
		    l2.setFont(new Font("Times New ROman",Font.BOLD,30));
		    l2.setForeground(Color.BLUE);
			l2.setBounds(310,250,220,30);
			jf.add(l2);

			l3=new JLabel("Cash withdrawal options used to getting money from the ATM.");
			l3.setFont(f);
			l3.setForeground(Color.WHITE);
			l3.setBounds(40,300,670,25);
			jf.add(l3);

			l4=new JLabel("Balance enquiry used to display and print your balance.");
			l4.setFont(f);
			l4.setForeground(Color.WHITE);
			l4.setBounds(40,330,670,25);
	    	jf.add(l4);

	    	l5=new JLabel("Mini statement used to print your balance.");
		    l5.setFont(f);
			l5.setForeground(Color.WHITE);
			l5.setBounds(40,360,650,25);
			jf.add(l5);

			l6=new JLabel("PIN change option used to change PIN no of ATM card.");
			l6.setFont(f);
			l6.setForeground(Color.WHITE);
			l6.setBounds(40,390,670,25);
			jf.add(l6);

			l7=new JLabel("Loan information option used to give various loan rate.");
			l7.setFont(f);
			l7.setForeground(Color.WHITE);
			l7.setBounds(40,420,650,25);
			jf.add(l7);

			l8=new JLabel("For more information Visit our your nearest branch of our Bank.");
			l8.setFont(f);
			l8.setForeground(Color.WHITE);
			l8.setBounds(40,450,700,25);
			jf.add(l8);

			l9=new JLabel("developers : ");
			l9.setFont(f);
			l9.setForeground(Color.black);
			l9.setBounds(40,480,300,25);
			jf.add(l9);

			l10=new JLabel("MR.Kutubkhan,\nMr.Salman,\nMr.burhanuddin and\n Mr.hussain sidhpur");
			l10.setFont(f);
			l10.setForeground(Color.black);
			l10.setBounds(170,480,260,20);
			jf.add(l10);
            
			l11=new JLabel("Mr.burhanuddin and\n Mr.hussain sidhpur");
			l11.setFont(f);
			l11.setForeground(Color.black);
			l11.setBounds(170,500,310,20);
			jf.add(l11);
			
			cancel=new JButton("Cancel",new ImageIcon("cancel.png"));
			cancel.setFont(f);
			cancel.setBounds(280,570,130,40);
			cancel.addActionListener(this);
			jf.add(cancel);

			img=new ImageIcon("bank.jpg");
	    	l1=new JLabel(img);
	    	l1.setBounds(1,1,800,700);
	    	jf.add(l1);

		 	jf.setTitle("Help");
	        jf.setSize(800,700);
			jf.setLocation(220,20);
		 	jf.setResizable(false);
	   		jf.setVisible(true);

	   	//Timer t=new Timer(30000,this);
        // t.start();
	}

	public void actionPerformed(ActionEvent ae)
	 {   //	JOptionPane.showMessageDialog(null,"Your time out for transaction");
     	// jf.setVisible(false);
     	 //new Welcome();
     	 //t.stop();
		if(ae.getSource()==cancel)
		{
			sound.play();
           	JOptionPane.showMessageDialog(this,"Your last transaction cancel.");
	        sound.play();
           	new Welcome();
           	jf.setVisible(false);
		}
	}
	 public static void main(String args[])
	  {
	    	new Help();
	  }

}
