import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewCustomer extends JFrame implements ActionListener {
    JTextField tname, tmeterno, tadress, tcity, tstate, temail, tphone;
    Random ran = new Random();
    Button b1, b2;
    int r = ran.nextInt(100000);
    int r1 = Math.abs(r);

    NewCustomer() {

        JPanel pane = new JPanel();

        pane.setBackground(new Color(173, 216, 230));
        pane.setLayout(null);

        JLabel head = new JLabel("New Customer");
        head.setBounds(280, 0, 400, 100);
        head.setFont(new Font("railway", Font.PLAIN, 24));
        pane.add(head);

        JLabel Cname = new JLabel("Customer Name");
        Cname.setBounds(200, 100, 200, 20);
        Cname.setFont(new Font("railway", Font.PLAIN, 15));
        tname = new JTextField();
        tname.setBounds(340, 100, 200, 20);
        pane.add(tname);
        pane.add(Cname);

        JLabel meternumber = new JLabel("Meter Number");
        meternumber.setBounds(200, 140, 200, 20);
        meternumber.setFont(new Font("railway", Font.PLAIN, 15));
        tmeterno = new JTextField();
        tmeterno.setBounds(340, 140, 200, 20);
        tmeterno.setText("" + r1);
        tmeterno.setEnabled(false);

        pane.add(tmeterno);
        pane.add(meternumber);

        JLabel adress = new JLabel("Address");
        adress.setBounds(200, 180, 200, 20);
        adress.setFont(new Font("railway", Font.PLAIN, 15));

        tadress = new JTextField();
        tadress.setBounds(340, 180, 200, 20);
        pane.add(tadress);

        pane.add(adress);

        JLabel city = new JLabel("City");
        city.setBounds(200, 220, 200, 20);
        city.setFont(new Font("railway", Font.PLAIN, 15));

        tcity = new JTextField();
        tcity.setBounds(340, 220, 200, 20);
        pane.add(tcity);

        pane.add(adress);

        pane.add(city);

        JLabel State = new JLabel("State");
        State.setBounds(200, 260, 200, 20);
        State.setFont(new Font("railway", Font.PLAIN, 15));
        tstate = new JTextField();
        tstate.setBounds(340, 260, 200, 20);
        pane.add(tstate);
        pane.add(State);

        JLabel email = new JLabel("Email");
        email.setBounds(200, 300, 200, 20);
        email.setFont(new Font("railway", Font.PLAIN, 15));
        temail = new JTextField();
        temail.setBounds(340, 300, 200, 20);
        pane.add(temail);
        pane.add(email);

        JLabel Phone = new JLabel("Phone Number");
        Phone.setBounds(200, 340, 200, 20);
        Phone.setFont(new Font("railway", Font.PLAIN, 15));
        tphone = new JTextField();
        tphone.setBounds(340, 340, 200, 20);
        pane.add(tphone);
        pane.add(Phone);

        b1 = new Button("Next");
        b1.setBounds(260, 400, 90, 40);
        b1.setBackground(Color.black);
        b1.setFont(new Font("railway", Font.PLAIN, 12));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        pane.add(b1);
        b2 = new Button("Cancel");
        b2.setBounds(380, 400, 90, 40);
        b2.setBackground(Color.black);
        b2.setFont(new Font("railway", Font.PLAIN, 12));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        pane.add(b2);
        add(pane);
        setSize(750, 600);
        setLayout(new BorderLayout());
        add(pane, "Center");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/hicon1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(150, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image, "West");
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            String sname = tname.getText();
            String smeter = tmeterno.getText();
            String saddress = tadress.getText();
            String scity = tcity.getText();
            String semail = temail.getText();
            String sphone = tphone.getText();
            String q="insert into customer values('"+sname+"','"+smeter+"','"+saddress+"','"+scity+"','"+semail+"','"+sphone+"')";
            String q1 ="insert into login values('"+smeter+"','','','','"+sname+"')";
            conn c = new conn();
            try {
                c.s.executeUpdate(q);
                c.s.executeUpdate(q1);
                JOptionPane.showMessageDialog(null,"Customer Detalis Saved");
                 setVisible(false);
               new MeterInformation(smeter);
              

            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }


        }
        else if(e.getSource()==b2)
        {

        }
    }

    public static void main(String[] args) {
        new NewCustomer();
    }

}
