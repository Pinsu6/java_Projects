import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    Login() {
        super("Login Page");
        getContentPane().setBackground(Color.WHITE);

        JLabel user = new JLabel("Username");
        JLabel password = new JLabel("password");
        JLabel loginas = new JLabel("loginas");

        JTextField username = new JTextField();
        JTextField tpassword = new JTextField();
        Choice logginin = new Choice();
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

        JButton login = new JButton("Login", new ImageIcon(i2));

        ImageIcon icancel = new ImageIcon(ClassLoader.getSystemResource("icon/cancel.jpg"));
        Image icancel2 = icancel.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        login.setBounds(330, 160, 100, 20);
        JButton cancel = new JButton("Cancel", new ImageIcon(icancel2));
        cancel.setBounds(450, 160, 100, 20);
        ImageIcon isign = new ImageIcon(ClassLoader.getSystemResource("icon/signup.png"));
        Image isign2 = isign.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        JButton signup = new JButton("SignUp", new ImageIcon(isign2));
        signup.setBounds(400, 200, 100, 20);
        add(login);
        add(cancel);
        add(signup);

        ImageIcon male = new ImageIcon(ClassLoader.getSystemResource("icon/second.jpg"));
        Image male2 = male.getImage().getScaledInstance(250, 250,Image.SCALE_DEFAULT);
        ImageIcon male3 = new ImageIcon(male2);
        JLabel image = new JLabel(male3);
        image.setBounds(0, -25, 250, 250);
        add(image);
        setSize(640, 300);
        setLocation(400, 200);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
