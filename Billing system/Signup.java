import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Signup extends JFrame implements ActionListener {
    JButton Back,create;
    Signup() {
        setBounds(450, 150, 700, 400);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(30, 30, 650, 300);
        panel.setBorder(new TitledBorder(new LineBorder(new Color(173, 216, 230), 2), "Create Account",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(172, 216, 230)));
        panel.setBackground(Color.white);
        panel.setLayout(null);
        panel.setForeground(new Color(34, 139, 34));

        add(panel);
        JLabel heading = new JLabel("create account as");
        heading.setBounds(100, 50, 140, 20);
        heading.setForeground(Color.gray);
        heading.setFont(new Font("Tahoma", Font.BOLD, 14));

        Choice accountType = new Choice();
        accountType.add("Admin");
        accountType.add("Customer");
        accountType.setBounds(260, 50, 150, 20);
        panel.add(accountType);
        panel.add(heading);

        JLabel lblmeter = new JLabel("meter number");
        lblmeter.setBounds(100, 90, 140, 20);
        lblmeter.setForeground(Color.gray);
        lblmeter.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(lblmeter);

        JTextField meter = new JTextField();
        meter.setBounds(260,90,150,20);
        panel.addPropertyChangeListener(null);
        panel.add(meter);

        JLabel user = new JLabel("Username");
        user.setBounds(100, 130, 140, 20);
        user.setForeground(Color.gray);
        user.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(user);

        JTextField username = new JTextField();
        username.setBounds(260,130,150,20);
        panel.addPropertyChangeListener(null);
        panel.add(username);

        JLabel Name = new JLabel("Name");
        Name.setBounds(100, 170, 140, 20);
        Name.setForeground(Color.gray);
        Name.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(Name);

        
        JTextField Tname = new JTextField();
        Tname.setBounds(260,170,150,20);
        panel.addPropertyChangeListener(null);
        panel.add(Tname);

         JLabel password = new JLabel("password");
        password.setBounds(100, 210, 140, 20);
        password.setForeground(Color.gray);
        password.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(password);

        JTextField Tpassword = new JTextField();
        Tpassword.setBounds(260,210,150,20);
        panel.addPropertyChangeListener(null);
        panel.add(Tpassword);

         create = new JButton("Create");
        create.setBackground(Color.BLACK);
        create.setForeground(Color.WHITE);
        create.setBounds(140, 260, 120, 25);
        panel.add(create);

        
        Back = new JButton("Back");
        Back.setBackground(Color.BLACK);
        Back.setForeground(Color.WHITE);
        Back.setBounds(300, 260, 120, 25);
        Back.addActionListener(this);
        panel.add(Back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/signupImage.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(415,30,250,250);
        panel.add(image);
        setVisible(true);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Back) {

            setVisible(false);
            new Login();
        }
        else if(e.getSource() == create)
        {
            
        }
         
        
    }

    public static void main(String[] args) {
        new Signup();
    }
}
