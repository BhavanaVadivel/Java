package AMS;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	JButton bt1,bt2;
	JPasswordField pf;
	JTextField tf;
	JFrame f;
	private JLabel l4;
	Login(){
		f=new JFrame("Login Account");
		f.setBackground(Color.white);
		f.setLayout(null);
		
		l1=new JLabel();
		
		Image img1 = new ImageIcon(this.getClass().getResource("/4.jpg")).getImage().getScaledInstance(580, 350, Image.SCALE_SMOOTH);
		l1.setIcon(new  ImageIcon(img1));
		l1.setBounds(0,0,580,350);
		l1.setLayout(null);
		l1.setOpaque(false);
		f.getContentPane().add(l1);
		ImageIcon img2 = new ImageIcon(img1);
		l1.setIcon(img2);
		
		/*ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("/2.png"));
		Image i1 = img1.getImage().getScaledInstance(500, 350, Image.SCALE_SMOOTH);
		Image i1 = img1.getImage().getScaledInstance(500, 350, Image.SCALE_SMOOTH);
		ImageIcon img2 = new ImageIcon(i1);
		l1.setIcon(img2);*/

		l3=new JLabel("Login Account");
		l3.setBounds(210,30,500,50);
		l3.setForeground(Color.black);
		l3.setFont(new Font("Times New Roman",Font.BOLD,20));
		f.add(l3);
		
		l2=new JLabel("Username");
		l2.setBounds(120,110,150,30);
		l2.setForeground(Color.BLACK);
		l2.setFont(new Font("Times New Roman",Font.BOLD,20));
		l1.add(l2);
		f.add(l1);
		
		l4=new JLabel("Password");
		l4.setBounds(120,160,150,30);
		l4.setForeground(Color.BLACK);
		l4.setFont(new Font("Times New Roman",Font.BOLD,20));
		l1.add(l4);
		f.add(l1);
		
		tf = new JTextField();
		tf.setBounds(320,110,150,30);
		l1.add(tf);
		f.add(tf);
		
		pf = new JPasswordField();
		pf.setBounds(320,160,150,30);
		l1.add(pf);
		f.add(l1);
		
		bt1 = new JButton("Login");
		bt1.setBackground(Color.black);
		bt1.setForeground(Color.white);
		bt1.setBounds(110,220,150,40);
		l1.add(bt1);
		f.add(l1);
		
		bt2 = new JButton("SignUp");
		bt2.setBackground(Color.black);
		bt2.setForeground(Color.white);
		bt2.setBounds(320,220,150,40);
		l1.add(bt2);
		f.add(l1);
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
		f.setVisible(true);
		f.setSize(580,350);
		f.setLocation(300,100);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt1) {
			String username = tf.getText();
			String password = pf.getText();
			
			try {
				ConnectionClass obj = new ConnectionClass();
				String q = "Select * from signup where username = '"+username+"' and password = '"+password+"'";
				ResultSet rs = obj.stm.executeQuery(q);
				if(rs.next()) {
					//new HomePage().setVisible(true);
					f.setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null, "You have Entered Wrong Username and Password");
					f.setVisible(false);
					f.setVisible(true);
				}
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		if(e.getSource()==bt2) {
			this.f.setVisible(false);
			//new SignupMessage();
		}
			
	}
	public static void main(String[] args) {
		new Login();
	}
}
