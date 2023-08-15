import javax.naming.spi.DirStateFactory.Result;
import javax.swing.*;

import com.mysql.cj.protocol.Resultset;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JButton login, cancel, signup;
    JTextField username, tpassword;
    Choice logginin;

    Login() {
        super("Login Page");
        getContentPane().setBackground(Color.WHITE);

        JLabel user = new JLabel("Username");
        JLabel password = new JLabel("password");
        JLabel loginas = new JLabel("loginas");

        username = new JTextField();
        tpassword = new JTextField();
        logginin = new Choice();
        logginin.add("Admin");
        logginin.add("customer");
        add(user);
        add(password);
        add(loginas);
        add(username);
        add(tpassword);
        add(logginin);

        user.setBounds(300, 20, 100, 20);
        password.setBounds(300, 60, 100, 20);
        loginas.setBounds(300, 100, 100, 20);
        username.setBounds(400, 20, 150, 20);
        tpassword.setBounds(400, 60, 150, 20);
        logginin.setBounds(400, 100, 150, 20);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image i2 = i1.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);

        login = new JButton("Login", new ImageIcon(i2));

        ImageIcon icancel = new ImageIcon(ClassLoader.getSystemResource("icon/cancel.jpg"));
        Image icancel2 = icancel.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        login.setBounds(330, 160, 100, 20);
        login.addActionListener(this);

        cancel = new JButton("Cancel", new ImageIcon(icancel2));
        cancel.setBounds(450, 160, 100, 20);
        cancel.addActionListener(this);

        ImageIcon isign = new ImageIcon(ClassLoader.getSystemResource("icon/signup.png"));
        Image isign2 = isign.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        signup = new JButton("SignUp", new ImageIcon(isign2));
        signup.setBounds(400, 200, 100, 20);
        signup.addActionListener(this);

        add(login);
        add(cancel);
        add(signup);

        ImageIcon male = new ImageIcon(ClassLoader.getSystemResource("icon/second.jpg"));
        Image male2 = male.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon male3 = new ImageIcon(male2);
        JLabel image = new JLabel(male3);
        image.setBounds(0, -25, 250, 250);
        add(image);
        setSize(640, 300);
        setLocation(400, 200);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signup) {

            setVisible(false);
            new Signup();
        }

        else if (e.getSource() == cancel) {
            username.setText("");
            tpassword.setText("");
        } else if (e.getSource() == login) {
            String susername = username.getText();
            String spassword = tpassword.getText();
            String user = logginin.getSelectedItem();
            try {
                conn c = new conn();
                String q = "select * from login where username='" + susername + "' and password='" + spassword
                        + "' and user='" + user + "'";

                ResultSet rs = c.s.executeQuery(q);
                if (rs.next()) {
                    setVisible(false);
                    new project();
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect information");
                    username.setText("");
                    tpassword.setText("");
                }

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Login();
    }

}
